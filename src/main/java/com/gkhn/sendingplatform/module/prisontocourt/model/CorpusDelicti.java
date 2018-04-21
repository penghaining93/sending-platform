package com.gkhn.sendingplatform.module.prisontocourt.model;

public class CorpusDelicti {
    private String commutationDegree;

    private String jointCrime;

    private String gangCrime;

    private String gangStatus;

    private String gangNumber;

    private String crimeStatus;

    private String crimeTruth;

    private String fleeType;

    private String caseInvolve;

    private String fourHistory;

    private String batchId;

    private String crimId;

    public String getCommutationDegree() {
        return commutationDegree;
    }

    public void setCommutationDegree(String commutationDegree) {
        this.commutationDegree = commutationDegree == null ? null : commutationDegree.trim();
    }

    public String getJointCrime() {
        return jointCrime;
    }

    public void setJointCrime(String jointCrime) {
        this.jointCrime = jointCrime == null ? null : jointCrime.trim();
    }

    public String getGangCrime() {
        return gangCrime;
    }

    public void setGangCrime(String gangCrime) {
        this.gangCrime = gangCrime == null ? null : gangCrime.trim();
    }

    public String getGangStatus() {
        return gangStatus;
    }

    public void setGangStatus(String gangStatus) {
        this.gangStatus = gangStatus == null ? null : gangStatus.trim();
    }

    public String getGangNumber() {
        return gangNumber;
    }

    public void setGangNumber(String gangNumber) {
        this.gangNumber = gangNumber == null ? null : gangNumber.trim();
    }

    public String getCrimeStatus() {
        return crimeStatus;
    }

    public void setCrimeStatus(String crimeStatus) {
        this.crimeStatus = crimeStatus == null ? null : crimeStatus.trim();
    }

    public String getCrimeTruth() {
        return crimeTruth;
    }

    public void setCrimeTruth(String crimeTruth) {
        this.crimeTruth = crimeTruth == null ? null : crimeTruth.trim();
    }

    public String getFleeType() {
        return fleeType;
    }

    public void setFleeType(String fleeType) {
        this.fleeType = fleeType == null ? null : fleeType.trim();
    }

    public String getCaseInvolve() {
        return caseInvolve;
    }

    public void setCaseInvolve(String caseInvolve) {
        this.caseInvolve = caseInvolve == null ? null : caseInvolve.trim();
    }

    public String getFourHistory() {
        return fourHistory;
    }

    public void setFourHistory(String fourHistory) {
        this.fourHistory = fourHistory == null ? null : fourHistory.trim();
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
}