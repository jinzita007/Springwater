package com.zyl.water.domain;

import java.util.List;

public class GoodsBrand {
    private Integer brandId;

    private String brandName;

    private String brandTitile;

    private String brandRebate;

    private Integer status;

    private Integer sort;

    private String brandImg;

    private List<Img> img;

    public List<Img> getImg() {
        return img;
    }

    public void setImg(List<Img> img) {
        this.img = img;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandTitile() {
        return brandTitile;
    }

    public void setBrandTitile(String brandTitile) {
        this.brandTitile = brandTitile == null ? null : brandTitile.trim();
    }

    public String getBrandRebate() {
        return brandRebate;
    }

    public void setBrandRebate(String brandRebate) {
        this.brandRebate = brandRebate == null ? null : brandRebate.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getBrandImg() {
        return brandImg;
    }

    public void setBrandImg(String brandImg) {
        this.brandImg = brandImg == null ? null : brandImg.trim();
    }
}