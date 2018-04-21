package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.OldSick;
import com.gkhn.sendingplatform.module.prisontocourt.model.OldSickKey;

public interface OldSickMapper {
    int deleteByPrimaryKey(OldSickKey key);

    int insert(OldSick record);

    int insertSelective(OldSick record);

    OldSick selectByPrimaryKey(OldSickKey key);

    int updateByPrimaryKeySelective(OldSick record);

    int updateByPrimaryKey(OldSick record);
}