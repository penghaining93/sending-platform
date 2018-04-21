package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import com.gkhn.sendingplatform.module.prisontocourt.model.CorpusDelicti;

public interface CorpusDelictiMapper {
    int insert(CorpusDelicti record);

    int insertSelective(CorpusDelicti record);
}