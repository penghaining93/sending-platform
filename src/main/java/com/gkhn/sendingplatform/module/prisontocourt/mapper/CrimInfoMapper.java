package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.CrimInfo;
import com.gkhn.sendingplatform.module.prisontocourt.model.CrimInfoKey;

public interface CrimInfoMapper {
    int deleteByPrimaryKey(CrimInfoKey key);

    int insert(CrimInfo record);

    int insertSelective(CrimInfo record);

    CrimInfo selectByPrimaryKey(CrimInfoKey key);

    int updateByPrimaryKeySelective(CrimInfo record);

    int updateByPrimaryKey(CrimInfo record);
}