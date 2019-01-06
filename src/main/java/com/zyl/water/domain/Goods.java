package com.zyl.water.domain;

import java.math.BigDecimal;

public class Goods {
    private Integer id;

    private Integer pid;

    private String goodsName;

    private String goodsTitle;

    private String goodsWaterTitle;

    private Integer goodsBrand;

    private BigDecimal goodsPriceList;

    private BigDecimal goodsPrice;

    private BigDecimal goodsWaterPrice;

    private String goodsRebate;

    private Integer goodsNum;

    private Integer goodsType;

    private Integer goodsTime;

    private String goodsImg;

    private Integer goodsGiftId;

    private Integer goodsTickets;

    private Integer goodsDeposit;

    private Integer goodsStatus;

    private Integer goodsPx;

    private Integer goodsXl;

    private Byte goodsScore;

    private Integer score;

    private Byte goodsGrade;

    public Goods(Integer id, Integer pid, String goodsName, String goodsTitle, String goodsWaterTitle, Integer goodsBrand, BigDecimal goodsPriceList, BigDecimal goodsPrice, BigDecimal goodsWaterPrice, String goodsRebate, Integer goodsNum, Integer goodsType, Integer goodsTime, String goodsImg, Integer goodsGiftId, Integer goodsTickets, Integer goodsDeposit, Integer goodsStatus, Integer goodsPx, Integer goodsXl, Byte goodsScore, Integer score, Byte goodsGrade) {
        this.id = id;
        this.pid = pid;
        this.goodsName = goodsName;
        this.goodsTitle = goodsTitle;
        this.goodsWaterTitle = goodsWaterTitle;
        this.goodsBrand = goodsBrand;
        this.goodsPriceList = goodsPriceList;
        this.goodsPrice = goodsPrice;
        this.goodsWaterPrice = goodsWaterPrice;
        this.goodsRebate = goodsRebate;
        this.goodsNum = goodsNum;
        this.goodsType = goodsType;
        this.goodsTime = goodsTime;
        this.goodsImg = goodsImg;
        this.goodsGiftId = goodsGiftId;
        this.goodsTickets = goodsTickets;
        this.goodsDeposit = goodsDeposit;
        this.goodsStatus = goodsStatus;
        this.goodsPx = goodsPx;
        this.goodsXl = goodsXl;
        this.goodsScore = goodsScore;
        this.score = score;
        this.goodsGrade = goodsGrade;
    }

    public Goods() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle == null ? null : goodsTitle.trim();
    }

    public String getGoodsWaterTitle() {
        return goodsWaterTitle;
    }

    public void setGoodsWaterTitle(String goodsWaterTitle) {
        this.goodsWaterTitle = goodsWaterTitle == null ? null : goodsWaterTitle.trim();
    }

    public Integer getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(Integer goodsBrand) {
        this.goodsBrand = goodsBrand;
    }

    public BigDecimal getGoodsPriceList() {
        return goodsPriceList;
    }

    public void setGoodsPriceList(BigDecimal goodsPriceList) {
        this.goodsPriceList = goodsPriceList;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getGoodsWaterPrice() {
        return goodsWaterPrice;
    }

    public void setGoodsWaterPrice(BigDecimal goodsWaterPrice) {
        this.goodsWaterPrice = goodsWaterPrice;
    }

    public String getGoodsRebate() {
        return goodsRebate;
    }

    public void setGoodsRebate(String goodsRebate) {
        this.goodsRebate = goodsRebate == null ? null : goodsRebate.trim();
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getGoodsTime() {
        return goodsTime;
    }

    public void setGoodsTime(Integer goodsTime) {
        this.goodsTime = goodsTime;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    public Integer getGoodsGiftId() {
        return goodsGiftId;
    }

    public void setGoodsGiftId(Integer goodsGiftId) {
        this.goodsGiftId = goodsGiftId;
    }

    public Integer getGoodsTickets() {
        return goodsTickets;
    }

    public void setGoodsTickets(Integer goodsTickets) {
        this.goodsTickets = goodsTickets;
    }

    public Integer getGoodsDeposit() {
        return goodsDeposit;
    }

    public void setGoodsDeposit(Integer goodsDeposit) {
        this.goodsDeposit = goodsDeposit;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getGoodsPx() {
        return goodsPx;
    }

    public void setGoodsPx(Integer goodsPx) {
        this.goodsPx = goodsPx;
    }

    public Integer getGoodsXl() {
        return goodsXl;
    }

    public void setGoodsXl(Integer goodsXl) {
        this.goodsXl = goodsXl;
    }

    public Byte getGoodsScore() {
        return goodsScore;
    }

    public void setGoodsScore(Byte goodsScore) {
        this.goodsScore = goodsScore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Byte getGoodsGrade() {
        return goodsGrade;
    }

    public void setGoodsGrade(Byte goodsGrade) {
        this.goodsGrade = goodsGrade;
    }
}