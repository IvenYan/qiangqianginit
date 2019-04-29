package com.wechat.qiangqiang.api.dao;

import com.wechat.qiangqiang.api.entity.MerchantSender;

public interface MerchantSenderMapper {
    int insert(MerchantSender record);

    int insertSelective(MerchantSender record);
}