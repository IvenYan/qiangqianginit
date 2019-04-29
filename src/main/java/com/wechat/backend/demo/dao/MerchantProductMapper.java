package com.wechat.qiangqiang.api.dao;

import com.wechat.qiangqiang.api.entity.MerchantProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Mapper
@Component("merchantProductMapper")
public interface MerchantProductMapper {
    int insert(MerchantProduct record);
    int insertSelective(MerchantProduct record);
    int updateByPrimaryKeySelective(MerchantProduct record);
    int deleteProductById(String merchantProductId);

//    热门商品根据商户的存量
    ArrayList<MerchantProduct> listHotMerchantProductByMerchantInventory(Integer max);
//    热门商品根据后台设定的hot 值
    ArrayList<MerchantProduct> listHotMerchantProductByBrandHot(Integer max);
//    根据品牌id查找旗下所有商品
    ArrayList<MerchantProduct> listProductByBrandId(Integer brandid);

//    列出所有商品，首页简练
    ArrayList<MerchantProduct> listProductSimple();
    int countMerchantProductAll();
    ArrayList<MerchantProduct> listProductSimpleBySearch(@Param("searchProductName") String searchProductName);
    int countMerchantProductAllBySearch(@Param("searchProductName") String searchProductName);


}