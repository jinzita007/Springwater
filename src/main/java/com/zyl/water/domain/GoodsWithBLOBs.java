package com.zyl.water.domain;

import java.math.BigDecimal;

public class GoodsWithBLOBs extends Goods {
    private String goodsWaterSet;

    private String goodsDetail;

    private String goodsImgList;

    public GoodsWithBLOBs(Integer id, Integer pid, String goodsName, String goodsTitle, String goodsWaterTitle, Integer goodsBrand, BigDecimal goodsPriceList, BigDecimal goodsPrice, BigDecimal goodsWaterPrice, String goodsRebate, Integer goodsNum, Integer goodsType, Integer goodsTime, String goodsImg, Integer goodsGiftId, Integer goodsTickets, Integer goodsDeposit, Integer goodsStatus, Integer goodsPx, Integer goodsXl, Byte goodsScore, Integer score, Byte goodsGrade, String goodsWaterSet, String goodsDetail, String goodsImgList) {
        super(id, pid, goodsName, goodsTitle, goodsWaterTitle, goodsBrand, goodsPriceList, goodsPrice, goodsWaterPrice, goodsRebate, goodsNum, goodsType, goodsTime, goodsImg, goodsGiftId, goodsTickets, goodsDeposit, goodsStatus, goodsPx, goodsXl, goodsScore, score, goodsGrade);
        this.goodsWaterSet = goodsWaterSet;
        this.goodsDetail = goodsDetail;
        this.goodsImgList = goodsImgList;
    }

    public GoodsWithBLOBs() {
        super();
    }

    public String getGoodsWaterSet() {
        return goodsWaterSet;
    }

    public void setGoodsWaterSet(String goodsWaterSet) {
        this.goodsWaterSet = goodsWaterSet == null ? null : goodsWaterSet.trim();
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail == null ? null : goodsDetail.trim();
    }

    public String getGoodsImgList() {
        return goodsImgList;
    }

    public void setGoodsImgList(String goodsImgList) {
        this.goodsImgList = goodsImgList == null ? null : goodsImgList.trim();
    }
}