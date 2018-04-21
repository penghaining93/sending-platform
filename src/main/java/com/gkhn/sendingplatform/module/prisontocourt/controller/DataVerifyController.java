package com.gkhn.sendingplatform.module.prisontocourt.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gkhn.sendingplatform.module.prisontocourt.mapper.BaseInfoMapper;
import com.gkhn.sendingplatform.module.prisontocourt.mapper.CaseMapper;
import com.gkhn.sendingplatform.module.prisontocourt.model.Case;
import com.gkhn.sendingplatform.module.prisontocourt.model.CaseVo;
import com.gkhn.sendingplatform.module.prisontocourt.model.SysSettingPlc;
import com.gkhn.sendingplatform.module.prisontocourt.service.CaseService;
import com.gkhn.sendingplatform.module.prisontocourt.service.SysSettingPlcService;
import com.gkhn.sendingplatform.module.prisontocourt.service.TestService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;

/**
 * @author: Phn
 * @description: 数据校验 前置接口
 * @date: 2018-1-16
 */
@Controller
@RequestMapping("dataVerify")
public class  DataVerifyController{

    private Logger logger = LoggerFactory.getLogger(DataVerifyController.class);

    @Autowired
    BaseInfoMapper baseInfoMapper;

    @Autowired
    CaseMapper caseMapper;

    @Autowired
    TestService testService;

    @Autowired
    CaseService caseService;

    @Autowired
    SysSettingPlcService sysSettingPlcService;

    /**
     * @Author: Phn
     * @Description: 给刑罚平台调用，将案件基本信息传输过来
     * @Date: 17:20 2018/1/16
     */
    @RequestMapping(value = "/sendToSendingPlatform",method = RequestMethod.POST,produces = "application/json")
    public String sendToSendingPlatform(Model model, HttpServletRequest request) {
        Case caseInfo = new Case();
        CaseVo caseVo = new CaseVo();
        String json = request.getParameter("json");
        JSONArray jsonArray = JSONArray.fromObject(json);
        for (int i = 0; i < jsonArray.size(); i++) {
            // 定义一个Map
            JSONObject caseJson = (JSONObject) jsonArray.get(i);
            Map<String, Class<Case>> map = new HashMap<>();
            // key为teacher私有变量的属性名
            map.put("list", Case.class);
            caseVo = (CaseVo)JSONObject.toBean(caseJson,CaseVo.class,map);
        }
        List<Case> list = caseVo.getList();
        Map<String,String> resultMap = new HashMap<>(list.size());
        List resultList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            caseInfo = list.get(i);
            caseInfo.setReceiveTime(new Date());
            int result =caseMapper.insertSelective(caseInfo);
        }
        String ip = request.getLocalAddr();
        SysSettingPlc sysSettingPlc = sysSettingPlcService.selectByIp(ip);
        String browerAddress = "";
        if(sysSettingPlc!=null){
            browerAddress = sysSettingPlc.getBrowerAddress();
        }
        model.addAttribute("ip", ip);
        model.addAttribute("browerAddress", browerAddress);
        model.addAttribute("departId",caseVo.getOrgid());
        model.addAttribute("batch",caseVo.getBatch());
        model.addAttribute("courtName",caseVo.getCourtName());
        model.addAttribute("shortName",caseVo.getDepartName());
        return "dataverify/index";
    }

    /**
    * @author: Phn
    * @description: 案件列表展示页面的前置接口
    * @date: 11:32 2018/2/23
    */
    @RequestMapping(value="caseList")
    public void caseList(HttpServletRequest request){
        String parameters = request.getQueryString();
        StringBuffer url =  request.getRequestURL();
        String path = url + "R?" + parameters;
        String browerAddress = request.getParameter("browerAddress");
        HttpSession session = request.getSession(true);
        Map<String,String> map = new HashMap<>();
        map.put("ip",request.getParameter("ip"));
        map.put("departId",request.getParameter("departId"));
        map.put("batch",request.getParameter("batch"));
        map.put("shortname",request.getParameter("shortname"));
        session.setAttribute("user_key",map);
        openBrower(browerAddress,path);
    }

    /**
    * @author: Phn
    * @description: 案件列表展示页面
    * @date: 11:35 2018/2/23
    */
    @RequestMapping(value="caseListR")
    public String caseListR(@RequestParam(defaultValue = "1")int currPage,@RequestParam(defaultValue = "20")int pageSize,
            Model model,HttpServletRequest request){
        String departId = request.getParameter("departId");
        String batch = request.getParameter("batch");
        List<Case> list = caseService.selectByDepartIdAndBatch(departId,batch,currPage,pageSize);
        model.addAttribute("list",list);
        return "dataverify/caseList";
    }

    /*@Test
    @RequestMapping(value=" /ceshi")
    public void ceshi(){
        int i = testService.ds2("4309","20000","430423");
    }*/

    @RequestMapping(value="/viewTest")
    public String viewTest(Model model){
        Map<String,String> map = new HashMap<>();
        model.addAttribute("browerAddress","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"); //C:\fakepath\chrome.exe
        model.addAttribute("ip", "127.0.0.1");
        model.addAttribute("courtName","长沙市人民法院");
        model.addAttribute("shortname","长沙监狱");
        model.addAttribute("departId","4307");
        model.addAttribute("batch","4");
        return "dataverify/index";
    }

    @RequestMapping(value="/browerTest")
    public String browerTest(Model model){
        Map<String,String> map = new HashMap<>();
        model.addAttribute("browerAddress","C:\\fakepath\\chrome.exe");
        ProcessBuilder proc = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "www.baidu.com");
        try {
            proc.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
    * @author: Phn
    * @description: 调用浏览器打开项目
     * browerAddress 浏览器地址 url 访问的url
    * @date: 10:35 2018/2/23
    */
    private void openBrower(String browerAddress,String url){
        ProcessBuilder proc = new ProcessBuilder(browerAddress, url);
        try {
            proc.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
