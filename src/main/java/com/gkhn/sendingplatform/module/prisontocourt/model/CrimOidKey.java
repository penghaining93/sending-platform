package com.gkhn.sendingplatform.module.prisontocourt.model;

public class CrimOidKey {
    private String crimId;

    private String bacthId;

    public String getCrimId() {
        return crimId;
    }

    public void setCrimId(String crimId) {
        this.crimId = crimId == null ? null : crimId.trim();
    }

    public String getBacthId() {
        return bacthId;
    }

    public void setBacthId(String bacthId) {
        this.bacthId = bacthId == null ? null : bacthId.trim();
    }
}