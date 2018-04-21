package com.gkhn.sendingplatform.module.prisontocourt.service.impl;

import com.github.pagehelper.PageHelper;
import com.gkhn.sendingplatform.module.prisontocourt.mapper.CaseMapper;
import com.gkhn.sendingplatform.module.prisontocourt.model.Case;
import com.gkhn.sendingplatform.module.prisontocourt.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Phn
 * @description:
 * @date: Created in 11:48 2018/2/23
 * @modified By:
 */
@Service
public class CaseServiceImpl implements CaseService{

    @Autowired
    CaseMapper caseMapper;

    @Override
    public List<Case> selectByDepartIdAndBatch(String departId, String batch, int currPage, int pageSize) {
        //分页，currPage当前页 pageSize每页显示条数
        PageHelper.startPage(currPage,pageSize);
        return caseMapper.selectByDepartIdAndBatch(departId,batch);
    }
}
