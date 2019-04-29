package com.wechat.qiangqiang.api.controller.entity;

/**
 * @ClassName UserInfo
 * @Author Iven
 * @Date 2019/3/14 14:43
 * @Version 1.0
 * @Description TODO
 */
public class UserInfo {

    private String openid;

    private String avatarUrl;

    private String nickName;

    private String gender;

    private String language;

    private String city;

    private String province;

    private String country;

    public UserInfo() {
    }

    public UserInfo(String openid, String avatarUrl, String nickName, String gender, String language, String city, String province, String country) {
        this.openid = openid;
        this.avatarUrl = avatarUrl;
        this.nickName = nickName;
        this.gender = gender;
        this.language = language;
        this.city = city;
        this.province = province;
        this.country = country;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
