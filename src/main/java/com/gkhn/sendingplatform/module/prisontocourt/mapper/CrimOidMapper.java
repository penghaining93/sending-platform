package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.CrimOid;
import com.gkhn.sendingplatform.module.prisontocourt.model.CrimOidKey;

public interface CrimOidMapper {
    int deleteByPrimaryKey(CrimOidKey key);

    int insert(CrimOid record);

    int insertSelective(CrimOid record);

    CrimOid selectByPrimaryKey(CrimOidKey key);

    int updateByPrimaryKeySelective(CrimOid record);

    int updateByPrimaryKey(CrimOid record);
}