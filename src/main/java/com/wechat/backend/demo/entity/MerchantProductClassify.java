package com.wechat.qiangqiang.api.entity;

public class MerchantProductClassify {
    private Integer merchantProductClassifyId;

    private String merchantProductClassifyName;

    public Integer getMerchantProductClassifyId() {
        return merchantProductClassifyId;
    }

    public void setMerchantProductClassifyId(Integer merchantProductClassifyId) {
        this.merchantProductClassifyId = merchantProductClassifyId;
    }

    public String getMerchantProductClassifyName() {
        return merchantProductClassifyName;
    }

    public void setMerchantProductClassifyName(String merchantProductClassifyName) {
        this.merchantProductClassifyName = merchantProductClassifyName == null ? null : merchantProductClassifyName.trim();
    }
}