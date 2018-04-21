package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.Submitinfo;
import com.gkhn.sendingplatform.module.prisontocourt.model.SubmitinfoKey;

public interface SubmitinfoMapper {
    int deleteByPrimaryKey(SubmitinfoKey key);

    int insert(Submitinfo record);

    int insertSelective(Submitinfo record);

    Submitinfo selectByPrimaryKey(SubmitinfoKey key);

    int updateByPrimaryKeySelective(Submitinfo record);

    int updateByPrimaryKey(Submitinfo record);
}