package com.gkhn.sendingplatform.module.prisontocourt.service;

import com.gkhn.sendingplatform.module.prisontocourt.config.datasource.DataSource;
import com.gkhn.sendingplatform.module.prisontocourt.mapper.BaseInfoMapper;
import com.gkhn.sendingplatform.module.prisontocourt.model.BaseInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Phn
 * @description:
 * @date: Created in 11:28 2018/1/21
 * @modified By:
 */
@Service
public class TestService {

    @Resource
    private BaseInfoMapper  baseInfoMapper;

    public int ds2(String persion,String batich,String crimid) {
        BaseInfo baseInfo = new BaseInfo();
        baseInfo.setBatchId("1111");
        return baseInfoMapper.insertSelective(baseInfo);
    }

    @DataSource
    public int ds3(String persion,String batich,String crimid) {
        BaseInfo baseInfo = new BaseInfo();
        baseInfo.setBatchId("1111");
        return baseInfoMapper.insertSelective(baseInfo);
    }
}
