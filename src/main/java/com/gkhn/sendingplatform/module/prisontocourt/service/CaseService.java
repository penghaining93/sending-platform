package com.gkhn.sendingplatform.module.prisontocourt.service;

import com.gkhn.sendingplatform.module.prisontocourt.model.Case;

import java.util.List;

/**
 * @author: Phn
 * @description:
 * @date: Created in 11:47 2018/2/23
 * @modified By:
 */
public interface CaseService {

    List<Case> selectByDepartIdAndBatch(String departId, String batch, int currPage, int pageSize);
}
