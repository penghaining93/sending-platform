package com.gkhn.sendingplatform.module.prisontocourt.service.impl;

import com.gkhn.sendingplatform.module.prisontocourt.mapper.SysSettingPlcMapper;
import com.gkhn.sendingplatform.module.prisontocourt.model.SysSettingPlc;
import com.gkhn.sendingplatform.module.prisontocourt.service.SysSettingPlcService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Phn
 * @description:
 * @date: Created in 16:15 2018/2/8
 * @modified By:
 */
@Service
public class SysSettingPlcServiceImpl implements SysSettingPlcService{

    @Resource
    SysSettingPlcMapper sysSettingPlcMapper;

    @Override
    public SysSettingPlc selectByIp(String ip) {
        return sysSettingPlcMapper.selectByIp(ip);
    }
}
