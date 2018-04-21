package com.gkhn.sendingplatform.module.prisontocourt.model;

public class SysSettingPlc {
    private Integer sId;

    private String ip;

    private String browerAddress;

    private String departId;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getBrowerAddress() {
        return browerAddress;
    }

    public void setBrowerAddress(String browerAddress) {
        this.browerAddress = browerAddress == null ? null : browerAddress.trim();
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }
}