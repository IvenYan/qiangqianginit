package com.wechat.qiangqiang.api.dao;

import com.wechat.qiangqiang.api.entity.MerchantProductDegree;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface MerchantProductDegreeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantProductDegree record);

    int insertSelective(MerchantProductDegree record);

    MerchantProductDegree selectByPrimaryKey(Integer id);
    List<MerchantProductDegree> selectAll();

    int updateByPrimaryKeySelective(MerchantProductDegree record);

    int updateByPrimaryKey(MerchantProductDegree record);
}