package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.JudgmentInfo;
import com.gkhn.sendingplatform.module.prisontocourt.model.JudgmentInfoKey;

public interface JudgmentInfoMapper {
    int deleteByPrimaryKey(JudgmentInfoKey key);

    int insert(JudgmentInfo record);

    int insertSelective(JudgmentInfo record);

    JudgmentInfo selectByPrimaryKey(JudgmentInfoKey key);

    int updateByPrimaryKeySelective(JudgmentInfo record);

    int updateByPrimaryKey(JudgmentInfo record);
}