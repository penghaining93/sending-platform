package com.gkhn.sendingplatform.module.prisontocourt.service;

import com.gkhn.sendingplatform.module.prisontocourt.model.SysSettingPlc;

/**
 * @author: Phn
 * @description:
 * @date: Created in 15:58 2018/2/8
 * @modified By:
 */
public interface SysSettingPlcService {
    /**
    * @author: Phn
    * @description:  根据ip查找设置
    * @date: 16:07 2018/2/8
     * @param ip
    */
    SysSettingPlc selectByIp(String ip);
}
