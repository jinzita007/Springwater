package com.zyl.water.domain;

public class TcWithBLOBs extends Tc {
    private String tcWaterSet;

    private String tcZpSet;

    private String tcDetail;

    public String getTcWaterSet() {
        return tcWaterSet;
    }

    public void setTcWaterSet(String tcWaterSet) {
        this.tcWaterSet = tcWaterSet == null ? null : tcWaterSet.trim();
    }

    public String getTcZpSet() {
        return tcZpSet;
    }

    public void setTcZpSet(String tcZpSet) {
        this.tcZpSet = tcZpSet == null ? null : tcZpSet.trim();
    }

    public String getTcDetail() {
        return tcDetail;
    }

    public void setTcDetail(String tcDetail) {
        this.tcDetail = tcDetail == null ? null : tcDetail.trim();
    }
}