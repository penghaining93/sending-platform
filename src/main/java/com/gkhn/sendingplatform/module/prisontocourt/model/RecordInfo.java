package com.gkhn.sendingplatform.module.prisontocourt.model;

public class RecordInfo extends RecordInfoKey {
    private String criminalCharge;

    private String exeOrgan;

    private String origSentenceYear;

    private String origSentenceMonth;

    private String origSentenceDay;

    private String startime;

    private String endtime;

    public String getCriminalCharge() {
        return criminalCharge;
    }

    public void setCriminalCharge(String criminalCharge) {
        this.criminalCharge = criminalCharge == null ? null : criminalCharge.trim();
    }

    public String getExeOrgan() {
        return exeOrgan;
    }

    public void setExeOrgan(String exeOrgan) {
        this.exeOrgan = exeOrgan == null ? null : exeOrgan.trim();
    }

    public String getOrigSentenceYear() {
        return origSentenceYear;
    }

    public void setOrigSentenceYear(String origSentenceYear) {
        this.origSentenceYear = origSentenceYear == null ? null : origSentenceYear.trim();
    }

    public String getOrigSentenceMonth() {
        return origSentenceMonth;
    }

    public void setOrigSentenceMonth(String origSentenceMonth) {
        this.origSentenceMonth = origSentenceMonth == null ? null : origSentenceMonth.trim();
    }

    public String getOrigSentenceDay() {
        return origSentenceDay;
    }

    public void setOrigSentenceDay(String origSentenceDay) {
        this.origSentenceDay = origSentenceDay == null ? null : origSentenceDay.trim();
    }

    public String getStartime() {
        return startime;
    }

    public void setStartime(String startime) {
        this.startime = startime == null ? null : startime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }
}