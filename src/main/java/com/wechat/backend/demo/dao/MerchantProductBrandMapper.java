package com.wechat.qiangqiang.api.dao;

import com.wechat.qiangqiang.api.entity.MerchantProductBrand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Mapper
@Component("merchantProductBrandMapper")
public interface MerchantProductBrandMapper {
    int deleteByPrimaryKey(Integer brandId);

    int insert(MerchantProductBrand record);

    int insertSelective(MerchantProductBrand record);

    ArrayList<MerchantProductBrand> selectAll();

    ArrayList<MerchantProductBrand> selectHotBrand();

    MerchantProductBrand selectByPrimaryKey(Integer brandId);

    MerchantProductBrand selectByBrandName(@Param("brandName") String brandName);

//    在使用中
    int updateByPrimaryKeySelective(MerchantProductBrand record);

    int updateByPrimaryKey(MerchantProductBrand record);

    //    列出所有商品--在使用中
    ArrayList<MerchantProductBrand> listBrandBySearch(@Param("searchClassifyId") int searchClassifyId);
    int countBrandBySearch(@Param("searchClassifyId") int searchClassifyId);
}