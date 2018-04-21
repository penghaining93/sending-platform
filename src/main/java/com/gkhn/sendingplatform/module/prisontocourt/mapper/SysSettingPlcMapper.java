package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.SysSettingPlc;

public interface SysSettingPlcMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(SysSettingPlc record);

    int insertSelective(SysSettingPlc record);

    SysSettingPlc selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(SysSettingPlc record);

    int updateByPrimaryKey(SysSettingPlc record);

    SysSettingPlc selectByIp(String ip);
}