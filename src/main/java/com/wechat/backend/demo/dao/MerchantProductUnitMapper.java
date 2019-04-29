package com.wechat.qiangqiang.api.dao;

import com.wechat.qiangqiang.api.entity.MerchantProductUnit;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface MerchantProductUnitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantProductUnit record);

    int insertSelective(MerchantProductUnit record);

    MerchantProductUnit selectByPrimaryKey(Integer id);

    List<MerchantProductUnit> selectAll();

    int updateByPrimaryKeySelective(MerchantProductUnit record);

    int updateByPrimaryKey(MerchantProductUnit record);
}