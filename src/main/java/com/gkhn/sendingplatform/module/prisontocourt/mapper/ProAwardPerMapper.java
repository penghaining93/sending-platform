package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.ProAwardPer;
import com.gkhn.sendingplatform.module.prisontocourt.model.ProAwardPerKey;

public interface ProAwardPerMapper {
    int deleteByPrimaryKey(ProAwardPerKey key);

    int insert(ProAwardPer record);

    int insertSelective(ProAwardPer record);

    ProAwardPer selectByPrimaryKey(ProAwardPerKey key);

    int updateByPrimaryKeySelective(ProAwardPer record);

    int updateByPrimaryKey(ProAwardPer record);
}