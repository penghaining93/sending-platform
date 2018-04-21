package com.gkhn.sendingplatform.module.prisontocourt.model;

public class BaseInfo extends BaseInfoKey {
    private Integer penaltyChangeType;

    private Integer mainCharge;

    private String chargeRemark;

    private Integer paroleType;

    private String caseNum;

    public Integer getPenaltyChangeType() {
        return penaltyChangeType;
    }

    public void setPenaltyChangeType(Integer penaltyChangeType) {
        this.penaltyChangeType = penaltyChangeType;
    }

    public Integer getMainCharge() {
        return mainCharge;
    }

    public void setMainCharge(Integer mainCharge) {
        this.mainCharge = mainCharge;
    }

    public String getChargeRemark() {
        return chargeRemark;
    }

    public void setChargeRemark(String chargeRemark) {
        this.chargeRemark = chargeRemark == null ? null : chargeRemark.trim();
    }

    public Integer getParoleType() {
        return paroleType;
    }

    public void setParoleType(Integer paroleType) {
        this.paroleType = paroleType;
    }

    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum == null ? null : caseNum.trim();
    }
}