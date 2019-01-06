package com.zyl.water.domain;

public class OrderWithBLOBs extends Orders {
    private String goodsGift;

    private String address;

    private String beizhu;

    private String sfbeizhu;

    public String getGoodsGift() {
        return goodsGift;
    }

    public void setGoodsGift(String goodsGift) {
        this.goodsGift = goodsGift == null ? null : goodsGift.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public String getSfbeizhu() {
        return sfbeizhu;
    }

    public void setSfbeizhu(String sfbeizhu) {
        this.sfbeizhu = sfbeizhu == null ? null : sfbeizhu.trim();
    }
}