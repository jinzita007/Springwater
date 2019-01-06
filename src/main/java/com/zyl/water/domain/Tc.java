package com.zyl.water.domain;

import java.math.BigDecimal;

public class Tc {
    private Integer id;

    private String tcName;

    private String tcTitle;

    private BigDecimal tcPrice;

    private Integer tcTime;

    private Integer tcStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTcName() {
        return tcName;
    }

    public void setTcName(String tcName) {
        this.tcName = tcName == null ? null : tcName.trim();
    }

    public String getTcTitle() {
        return tcTitle;
    }

    public void setTcTitle(String tcTitle) {
        this.tcTitle = tcTitle == null ? null : tcTitle.trim();
    }

    public BigDecimal getTcPrice() {
        return tcPrice;
    }

    public void setTcPrice(BigDecimal tcPrice) {
        this.tcPrice = tcPrice;
    }

    public Integer getTcTime() {
        return tcTime;
    }

    public void setTcTime(Integer tcTime) {
        this.tcTime = tcTime;
    }

    public Integer getTcStatus() {
        return tcStatus;
    }

    public void setTcStatus(Integer tcStatus) {
        this.tcStatus = tcStatus;
    }
}