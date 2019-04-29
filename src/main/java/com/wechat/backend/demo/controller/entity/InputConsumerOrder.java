package com.wechat.qiangqiang.api.controller.entity;

/**
 * @ClassName UserInfo
 * @Author Iven
 * @Date 2019/3/14 14:43
 * @Version 1.0
 * @Description TODO
 */
public class InputConsumerOrder {

    private String openId;

    private String orderId;

    public InputConsumerOrder() {
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
