package com.wechat.qiangqiang.api.dao;

import com.wechat.qiangqiang.api.entity.MerchantProductInventory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("merchantProductInventoryMapper")
public interface MerchantProductInventoryMapper {
    int insert(MerchantProductInventory record);

    int insertSelective(MerchantProductInventory record);
}