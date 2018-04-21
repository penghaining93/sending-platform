package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.BaseInfo;
import com.gkhn.sendingplatform.module.prisontocourt.model.BaseInfoKey;

public interface BaseInfoMapper {
    int deleteByPrimaryKey(BaseInfoKey key);

    int insert(BaseInfo record);

    int insertSelective(BaseInfo record);

    BaseInfo selectByPrimaryKey(BaseInfoKey key);

    int updateByPrimaryKeySelective(BaseInfo record);

    int updateByPrimaryKey(BaseInfo record);
}