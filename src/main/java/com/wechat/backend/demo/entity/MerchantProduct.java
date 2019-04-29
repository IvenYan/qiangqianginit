package com.wechat.qiangqiang.api.entity;


public class MerchantProduct {
    private Integer merchantProductId;

    private String merchantProductStatus;

    private String merchantProductBrandId;

    private String merchantProductBrandName;

    private String merchantProductName;

    private String merchantProductTaste;

    private String merchantProductDegree;

    private String merchantProductSpec;

    private String merchantProductUnit;

    private String merchantProductPrice;

    private String merchantProductImageName;

    private String merchantProductDetail;

    public MerchantProduct() {
    }

    public MerchantProduct(String merchantProductStatus, String merchantProductBrandId, String merchantProductName, String merchantProductTaste, String merchantProductDegree, String merchantProductSpec, String merchantProductUnit, String merchantProductPrice, String merchantProductImageName, String merchantProductDetail) {
        this.merchantProductStatus = merchantProductStatus;
        this.merchantProductBrandId = merchantProductBrandId;
        this.merchantProductName = merchantProductName;
        this.merchantProductTaste = merchantProductTaste;
        this.merchantProductDegree = merchantProductDegree;
        this.merchantProductSpec = merchantProductSpec;
        this.merchantProductUnit = merchantProductUnit;
        this.merchantProductPrice = merchantProductPrice;
        this.merchantProductImageName = merchantProductImageName;
        this.merchantProductDetail = merchantProductDetail;
    }

    public String getMerchantProductBrandName() {
        return merchantProductBrandName;
    }

    public void setMerchantProductBrandName(String merchantProductBrandName) {
        this.merchantProductBrandName = merchantProductBrandName;
    }

    public Integer getMerchantProductId() {
        return merchantProductId;
    }


    public void setMerchantProductId(Integer merchantProductId) {
        this.merchantProductId = merchantProductId;
    }

    public String getMerchantProductStatus() {
        return merchantProductStatus;
    }

    public void setMerchantProductStatus(String merchantProductStatus) {
        this.merchantProductStatus = merchantProductStatus == null ? null : merchantProductStatus.trim();
    }

    public String getMerchantProductBrandId() {
        return merchantProductBrandId;
    }

    public void setMerchantProductBrandId(String merchantProductBrandId) {
        this.merchantProductBrandId = merchantProductBrandId == null ? null : merchantProductBrandId.trim();
    }

    public String getMerchantProductName() {
        return merchantProductName;
    }

    public void setMerchantProductName(String merchantProductName) {
        this.merchantProductName = merchantProductName == null ? null : merchantProductName.trim();
    }

    public String getMerchantProductTaste() {
        return merchantProductTaste;
    }

    public void setMerchantProductTaste(String merchantProductTaste) {
        this.merchantProductTaste = merchantProductTaste == null ? null : merchantProductTaste.trim();
    }

    public String getMerchantProductDegree() {
        return merchantProductDegree;
    }

    public void setMerchantProductDegree(String merchantProductDegree) {
        this.merchantProductDegree = merchantProductDegree == null ? null : merchantProductDegree.trim();
    }

    public String getMerchantProductSpec() {
        return merchantProductSpec;
    }

    public void setMerchantProductSpec(String merchantProductSpec) {
        this.merchantProductSpec = merchantProductSpec == null ? null : merchantProductSpec.trim();
    }

    public String getMerchantProductUnit() {
        return merchantProductUnit;
    }

    public void setMerchantProductUnit(String merchantProductUnit) {
        this.merchantProductUnit = merchantProductUnit == null ? null : merchantProductUnit.trim();
    }

    public String getMerchantProductPrice() {
        return merchantProductPrice;
    }

    public void setMerchantProductPrice(String merchantProductPrice) {
        this.merchantProductPrice = merchantProductPrice;
    }

    public String getMerchantProductImageName() {
        return merchantProductImageName;
    }

    public void setMerchantProductImageName(String merchantProductImageName) {
        this.merchantProductImageName = merchantProductImageName == null ? null : merchantProductImageName.trim();
    }

    public String getMerchantProductDetail() {
        return merchantProductDetail;
    }

    public void setMerchantProductDetail(String merchantProductDetail) {
        this.merchantProductDetail = merchantProductDetail == null ? null : merchantProductDetail.trim();
    }

    @Override
    public String toString() {
        return "MerchantProduct{" +
                "merchantProductId=" + merchantProductId +
                ", merchantProductStatus='" + merchantProductStatus + '\'' +
                ", merchantProductBrandId='" + merchantProductBrandId + '\'' +
                ", merchantProductBrandName='" + merchantProductBrandName + '\'' +
                ", merchantProductName='" + merchantProductName + '\'' +
                ", merchantProductTaste='" + merchantProductTaste + '\'' +
                ", merchantProductDegree='" + merchantProductDegree + '\'' +
                ", merchantProductSpec='" + merchantProductSpec + '\'' +
                ", merchantProductUnit='" + merchantProductUnit + '\'' +
                ", merchantProductPrice='" + merchantProductPrice + '\'' +
                ", merchantProductImageName='" + merchantProductImageName + '\'' +
                ", merchantProductDetail='" + merchantProductDetail + '\'' +
                '}';
    }
}