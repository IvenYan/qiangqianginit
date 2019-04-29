package com.wechat.qiangqiang.api.entity;

/**
 * @ClassName ResponseData
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/3/16 21:45
 * @Version 1.0
 **/
public class ResponseData {
    private String code;
    private Object message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
