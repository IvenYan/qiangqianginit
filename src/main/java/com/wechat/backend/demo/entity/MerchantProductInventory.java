package com.wechat.qiangqiang.api.entity;

public class MerchantProductInventory {
    private Integer merchantProductInventoryId;

    private Integer merchantProductId;

    private Integer merchantId;

    private Integer merchantProductInventoryAmount;

    public Integer getMerchantProductInventoryId() {
        return merchantProductInventoryId;
    }

    public void setMerchantProductInventoryId(Integer merchantProductInventoryId) {
        this.merchantProductInventoryId = merchantProductInventoryId;
    }

    public Integer getMerchantProductId() {
        return merchantProductId;
    }

    public void setMerchantProductId(Integer merchantProductId) {
        this.merchantProductId = merchantProductId;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getMerchantProductInventoryAmount() {
        return merchantProductInventoryAmount;
    }

    public void setMerchantProductInventoryAmount(Integer merchantProductInventoryAmount) {
        this.merchantProductInventoryAmount = merchantProductInventoryAmount;
    }
}