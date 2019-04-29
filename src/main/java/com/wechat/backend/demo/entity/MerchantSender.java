package com.wechat.qiangqiang.api.entity;

public class MerchantSender {
    private Integer merchantSenderId;

    private String merchantSenderName;

    private String merchantSenderTel;

    public Integer getMerchantSenderId() {
        return merchantSenderId;
    }

    public void setMerchantSenderId(Integer merchantSenderId) {
        this.merchantSenderId = merchantSenderId;
    }

    public String getMerchantSenderName() {
        return merchantSenderName;
    }

    public void setMerchantSenderName(String merchantSenderName) {
        this.merchantSenderName = merchantSenderName == null ? null : merchantSenderName.trim();
    }

    public String getMerchantSenderTel() {
        return merchantSenderTel;
    }

    public void setMerchantSenderTel(String merchantSenderTel) {
        this.merchantSenderTel = merchantSenderTel == null ? null : merchantSenderTel.trim();
    }
}