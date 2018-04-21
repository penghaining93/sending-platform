package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.Opinion;
import com.gkhn.sendingplatform.module.prisontocourt.model.OpinionKey;

public interface OpinionMapper {
    int deleteByPrimaryKey(OpinionKey key);

    int insert(Opinion record);

    int insertSelective(Opinion record);

    Opinion selectByPrimaryKey(OpinionKey key);

    int updateByPrimaryKeySelective(Opinion record);

    int updateByPrimaryKey(Opinion record);
}