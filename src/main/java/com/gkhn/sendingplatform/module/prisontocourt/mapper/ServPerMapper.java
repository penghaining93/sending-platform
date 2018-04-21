package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.ServPer;
import com.gkhn.sendingplatform.module.prisontocourt.model.ServPerKey;

public interface ServPerMapper {
    int deleteByPrimaryKey(ServPerKey key);

    int insert(ServPer record);

    int insertSelective(ServPer record);

    ServPer selectByPrimaryKey(ServPerKey key);

    int updateByPrimaryKeySelective(ServPer record);

    int updateByPrimaryKey(ServPer record);
}