package com.gkhn.sendingplatform.module.prisontocourt.model;

import java.util.List;

/**
 * @author: Phn
 * @description:
 * @date: Created in 14:58 2018/2/5
 * @modified By:
 */
public class CaseVo {

    private List<Case> list;

    private String departName;

    private String courtName;

    private String batch ;

    private String orgid;


    public List<Case> getList() {
        return list;
    }

    public void setList(List<Case> list) {
        this.list = list;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public String getBatch() {
        return batch;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }
}
