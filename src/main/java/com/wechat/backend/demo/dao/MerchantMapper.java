package com.wechat.qiangqiang.api.dao;

import com.wechat.qiangqiang.api.entity.Merchant;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("merchantMapper")
public interface MerchantMapper {
    int insert(Merchant record);

    int insertSelective(Merchant record);
}