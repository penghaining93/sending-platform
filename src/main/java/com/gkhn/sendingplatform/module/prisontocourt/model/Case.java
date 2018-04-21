package com.gkhn.sendingplatform.module.prisontocourt.model;

import java.util.Date;

public class Case {
    private Integer caseId;

    private String departId;

    private String nowYear;

    private String batchId;

    private String crimId;

    private String courtId;

    private Date receiveTime;

    private Date sendTime;

    private Integer status;

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

    public String getNowYear() {
        return nowYear;
    }

    public void setNowYear(String nowYear) {
        this.nowYear = nowYear == null ? null : nowYear.trim();
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public String getCrimId() {
        return crimId;
    }

    public void setCrimId(String crimId) {
        this.crimId = crimId == null ? null : crimId.trim();
    }

    public String getCourtId() {
        return courtId;
    }

    public void setCourtId(String courtId) {
        this.courtId = courtId == null ? null : courtId.trim();
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}