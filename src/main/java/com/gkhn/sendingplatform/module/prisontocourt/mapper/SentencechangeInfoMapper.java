package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.SentencechangeInfo;
import com.gkhn.sendingplatform.module.prisontocourt.model.SentencechangeInfoKey;

public interface SentencechangeInfoMapper {
    int deleteByPrimaryKey(SentencechangeInfoKey key);

    int insert(SentencechangeInfo record);

    int insertSelective(SentencechangeInfo record);

    SentencechangeInfo selectByPrimaryKey(SentencechangeInfoKey key);

    int updateByPrimaryKeySelective(SentencechangeInfo record);

    int updateByPrimaryKey(SentencechangeInfo record);
}