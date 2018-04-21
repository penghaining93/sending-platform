package com.gkhn.sendingplatform.module.prisontocourt.model;

import java.util.Date;

public class CrimOid extends CrimOidKey {
    private String oidType;

    private String confirmTime;

    private Date revocationTime;

    public String getOidType() {
        return oidType;
    }

    public void setOidType(String oidType) {
        this.oidType = oidType == null ? null : oidType.trim();
    }

    public String getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(String confirmTime) {
        this.confirmTime = confirmTime == null ? null : confirmTime.trim();
    }

    public Date getRevocationTime() {
        return revocationTime;
    }

    public void setRevocationTime(Date revocationTime) {
        this.revocationTime = revocationTime;
    }
}