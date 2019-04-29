package com.wechat.qiangqiang.api.dao;

import com.wechat.qiangqiang.api.entity.MerchantProductTaste;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface MerchantProductTasteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantProductTaste record);

    int insertSelective(MerchantProductTaste record);

    MerchantProductTaste selectByPrimaryKey(Integer id);
    List<MerchantProductTaste> selectAll();

    int updateByPrimaryKeySelective(MerchantProductTaste record);

    int updateByPrimaryKey(MerchantProductTaste record);
}