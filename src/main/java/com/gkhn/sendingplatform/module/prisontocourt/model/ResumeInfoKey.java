package com.gkhn.sendingplatform.module.prisontocourt.model;

public class ResumeInfoKey {
    private String crimId;

    private String batchId;

    public String getCrimId() {
        return crimId;
    }

    public void setCrimId(String crimId) {
        this.crimId = crimId == null ? null : crimId.trim();
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }
}