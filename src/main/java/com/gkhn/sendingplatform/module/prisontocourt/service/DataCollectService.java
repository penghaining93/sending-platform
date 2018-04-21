package com.gkhn.sendingplatform.module.prisontocourt.service;

import java.util.List;
import java.util.Map;

/**
 * @author: Phn
 * @description:
 * @date: Created in 15:45 2018/3/17
 * @modified By:
 */
public interface DataCollectService {

    /**
    * @author: Phn
    * @description:用来获取刑罚执行平台的减刑假释的数据
     * 入参 罪犯编号 年份 批次
    * @date: 15:50 2018/3/17
    */
    List<Map<String,Object>> getJxjsData(List<Map<String,Object>> list);
}
