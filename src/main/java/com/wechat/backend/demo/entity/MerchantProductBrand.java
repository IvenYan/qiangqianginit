package com.wechat.qiangqiang.api.entity;

public class MerchantProductBrand {
    private Integer brandId;

    private String brandName;

    private String merchantProductClassifyName;

    private Integer merchantProductClassifyId;
//热度
    private Integer HotNo;

    public Integer getHotNo() {
        return HotNo;
    }

    public void setHotNo(Integer hotNo) {
        HotNo = hotNo;
    }

    public String getMerchantProductClassifyName() {
        return merchantProductClassifyName;
    }

    public void setMerchantProductClassifyName(String merchantProductClassifyName) {
        this.merchantProductClassifyName = merchantProductClassifyName;
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

    public Integer getMerchantProductClassifyId() {
        return merchantProductClassifyId;
    }

    public void setMerchantProductClassifyId(Integer merchantProductClassifyId) {
        this.merchantProductClassifyId = merchantProductClassifyId;
    }

    @Override
    public String toString() {
        return "MerchantProductBrand{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", merchantProductClassifyName='" + merchantProductClassifyName + '\'' +
                ", merchantProductClassifyId=" + merchantProductClassifyId +
                ", HotNo=" + HotNo +
                '}';
    }
}