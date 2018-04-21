package com.gkhn.sendingplatform.module.prisontocourt.model;

public class OldSick extends OldSickKey {
    private String oldSickType;

    private String identDate;

    private String revocationDate;

    public String getOldSickType() {
        return oldSickType;
    }

    public void setOldSickType(String oldSickType) {
        this.oldSickType = oldSickType == null ? null : oldSickType.trim();
    }

    public String getIdentDate() {
        return identDate;
    }

    public void setIdentDate(String identDate) {
        this.identDate = identDate == null ? null : identDate.trim();
    }

    public String getRevocationDate() {
        return revocationDate;
    }

    public void setRevocationDate(String revocationDate) {
        this.revocationDate = revocationDate == null ? null : revocationDate.trim();
    }
}