package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.ResumeInfo;
import com.gkhn.sendingplatform.module.prisontocourt.model.ResumeInfoKey;

public interface ResumeInfoMapper {
    int deleteByPrimaryKey(ResumeInfoKey key);

    int insert(ResumeInfo record);

    int insertSelective(ResumeInfo record);

    ResumeInfo selectByPrimaryKey(ResumeInfoKey key);

    int updateByPrimaryKeySelective(ResumeInfo record);

    int updateByPrimaryKey(ResumeInfo record);
}