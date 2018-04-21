package com.gkhn.sendingplatform.module.prisontocourt.mapper;

import java.util.List;
import java.util.Map;

public interface DataCollectMapper {

    List getAJXXCaseDateInfo(Map<Object, Object> map);

    List getJYYJCaseDateInfo(Map<Object, Object> map);

    List getJYJYJCaseDateInfo(Map<Object, Object> map);

    List getFZSSCaseDateInfo(Map<Object, Object> map);

    List getZFJBXXCaseDateInfo(Map<Object, Object> map);

    List getXFBGCaseDateInfo(Map<Object, Object> map);

    List getZFXFQKCaseDateInfo(Map<Object, Object> map);

    List getLRBCCaseDateInfo(Map<Object, Object> map);
    List getQKXXCaseDateInfo(Map<Object, Object> map);
    List getSHGXCaseDateInfo(Map<Object, Object> map);
    List getJLXXCaseDateInfo(Map<Object, Object> map);
    List getFXBXCaseDateInfo(Map<Object, Object> map);
    List getCCQKCaseDateInfo(Map<Object, Object> map);
    List getQLQKCaseDateInfo(Map<Object, Object> map);
    List getCFQKCaseDateInfo(Map<Object, Object> map);
    List getYPXXCaseDateInfo(Map<Object, Object> map);

}