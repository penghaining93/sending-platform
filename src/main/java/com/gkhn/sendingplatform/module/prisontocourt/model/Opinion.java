package com.gkhn.sendingplatform.module.prisontocourt.model;

public class Opinion extends OpinionKey {
    private String prisonOpinion;

    private String prisonadminOpinion;

    private String procuratorateOpinion;

    public String getPrisonOpinion() {
        return prisonOpinion;
    }

    public void setPrisonOpinion(String prisonOpinion) {
        this.prisonOpinion = prisonOpinion == null ? null : prisonOpinion.trim();
    }

    public String getPrisonadminOpinion() {
        return prisonadminOpinion;
    }

    public void setPrisonadminOpinion(String prisonadminOpinion) {
        this.prisonadminOpinion = prisonadminOpinion == null ? null : prisonadminOpinion.trim();
    }

    public String getProcuratorateOpinion() {
        return procuratorateOpinion;
    }

    public void setProcuratorateOpinion(String procuratorateOpinion) {
        this.procuratorateOpinion = procuratorateOpinion == null ? null : procuratorateOpinion.trim();
    }
}