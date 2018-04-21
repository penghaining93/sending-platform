package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.Case;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaseMapper {
    int deleteByPrimaryKey(Integer caseId);

    int insert(Case record);

    int insertSelective(Case record);

    Case selectByPrimaryKey(Integer caseId);

    int updateByPrimaryKeySelective(Case record);

    int updateByPrimaryKey(Case record);

    List<Case> selectByDepartIdAndBatch(@Param("departId")String departId, @Param("batch")String batch);
}