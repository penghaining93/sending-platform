package com.gkhn.sendingplatform.module.prisontocourt.model;

public class ServPer extends ServPerKey {
    private String lawScore;

    private String awardSituation;

    private String punishSituation;

    public String getLawScore() {
        return lawScore;
    }

    public void setLawScore(String lawScore) {
        this.lawScore = lawScore == null ? null : lawScore.trim();
    }

    public String getAwardSituation() {
        return awardSituation;
    }

    public void setAwardSituation(String awardSituation) {
        this.awardSituation = awardSituation == null ? null : awardSituation.trim();
    }

    public String getPunishSituation() {
        return punishSituation;
    }

    public void setPunishSituation(String punishSituation) {
        this.punishSituation = punishSituation == null ? null : punishSituation.trim();
    }
}