package com.zyl.water.domain;

import java.math.BigDecimal;
import java.util.List;

public class Orders {
    private Integer id;

    private Integer uid;

    private Integer orderType;

    private String orderNum;

    private BigDecimal orderPrice;

    private BigDecimal orderDeposit;

    private BigDecimal payPrice;

    private Integer payType;

    private Integer orderStatus;

    private Integer area;

    private Integer bcircle;

    private Integer district;

    private Integer orderAddressId;

    private Integer isDelivery;

    private String deliveryTime;

    private Integer couponId;

    private Integer goodsGiftId;

    private Integer isLnvoice;

    private String lnvoiceTitle;

    private String name;

    private String phone;

    private Integer createtime;

    private String tradeNo;

    private BigDecimal tradePrice;

    private Integer ziyoutongLinshi;

    private Integer ziyoutong;

    private Integer orderGiftId;

    private Integer one;

    private Integer del;

    private Integer deliver;

    private Integer finishtime;

    private Integer bucket;

    private Boolean share;

    private String youhui;

    private String point;

    private Area arealist;

    public Area getArealist() {
        return arealist;
    }

    public void setArealist(Area arealist) {
        this.arealist = arealist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getOrderDeposit() {
        return orderDeposit;
    }

    public void setOrderDeposit(BigDecimal orderDeposit) {
        this.orderDeposit = orderDeposit;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getBcircle() {
        return bcircle;
    }

    public void setBcircle(Integer bcircle) {
        this.bcircle = bcircle;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Integer getOrderAddressId() {
        return orderAddressId;
    }

    public void setOrderAddressId(Integer orderAddressId) {
        this.orderAddressId = orderAddressId;
    }

    public Integer getIsDelivery() {
        return isDelivery;
    }

    public void setIsDelivery(Integer isDelivery) {
        this.isDelivery = isDelivery;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime == null ? null : deliveryTime.trim();
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getGoodsGiftId() {
        return goodsGiftId;
    }

    public void setGoodsGiftId(Integer goodsGiftId) {
        this.goodsGiftId = goodsGiftId;
    }

    public Integer getIsLnvoice() {
        return isLnvoice;
    }

    public void setIsLnvoice(Integer isLnvoice) {
        this.isLnvoice = isLnvoice;
    }

    public String getLnvoiceTitle() {
        return lnvoiceTitle;
    }

    public void setLnvoiceTitle(String lnvoiceTitle) {
        this.lnvoiceTitle = lnvoiceTitle == null ? null : lnvoiceTitle.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public BigDecimal getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(BigDecimal tradePrice) {
        this.tradePrice = tradePrice;
    }

    public Integer getZiyoutongLinshi() {
        return ziyoutongLinshi;
    }

    public void setZiyoutongLinshi(Integer ziyoutongLinshi) {
        this.ziyoutongLinshi = ziyoutongLinshi;
    }

    public Integer getZiyoutong() {
        return ziyoutong;
    }

    public void setZiyoutong(Integer ziyoutong) {
        this.ziyoutong = ziyoutong;
    }

    public Integer getOrderGiftId() {
        return orderGiftId;
    }

    public void setOrderGiftId(Integer orderGiftId) {
        this.orderGiftId = orderGiftId;
    }

    public Integer getOne() {
        return one;
    }

    public void setOne(Integer one) {
        this.one = one;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Integer getDeliver() {
        return deliver;
    }

    public void setDeliver(Integer deliver) {
        this.deliver = deliver;
    }

    public Integer getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Integer finishtime) {
        this.finishtime = finishtime;
    }

    public Integer getBucket() {
        return bucket;
    }

    public void setBucket(Integer bucket) {
        this.bucket = bucket;
    }

    public Boolean getShare() {
        return share;
    }

    public void setShare(Boolean share) {
        this.share = share;
    }

    public String getYouhui() {
        return youhui;
    }

    public void setYouhui(String youhui) {
        this.youhui = youhui == null ? null : youhui.trim();
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point == null ? null : point.trim();
    }
}