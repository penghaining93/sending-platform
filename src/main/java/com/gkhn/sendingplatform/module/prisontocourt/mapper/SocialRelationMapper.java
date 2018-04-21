package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.SocialRelation;
import com.gkhn.sendingplatform.module.prisontocourt.model.SocialRelationKey;

public interface SocialRelationMapper {
    int deleteByPrimaryKey(SocialRelationKey key);

    int insert(SocialRelation record);

    int insertSelective(SocialRelation record);

    SocialRelation selectByPrimaryKey(SocialRelationKey key);

    int updateByPrimaryKeySelective(SocialRelation record);

    int updateByPrimaryKey(SocialRelation record);
}