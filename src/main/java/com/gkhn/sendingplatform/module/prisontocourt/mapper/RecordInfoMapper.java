package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.RecordInfo;
import com.gkhn.sendingplatform.module.prisontocourt.model.RecordInfoKey;

public interface RecordInfoMapper {
    int deleteByPrimaryKey(RecordInfoKey key);

    int insert(RecordInfo record);

    int insertSelective(RecordInfo record);

    RecordInfo selectByPrimaryKey(RecordInfoKey key);

    int updateByPrimaryKeySelective(RecordInfo record);

    int updateByPrimaryKey(RecordInfo record);
}