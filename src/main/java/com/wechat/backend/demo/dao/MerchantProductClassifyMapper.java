package com.wechat.qiangqiang.api.dao;

import com.wechat.qiangqiang.api.entity.MerchantProductClassify;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Mapper
@Component(value = "merchantProductClassifyMapper")
public interface MerchantProductClassifyMapper {
    int insert(MerchantProductClassify record);
    int insertSelective(MerchantProductClassify record);

    MerchantProductClassify selectByClassifyName(@Param("merchantProductClassifyName") String merchantProductClassifyName);

    MerchantProductClassify    selectById(int merchantProductClassifyId);
    ArrayList<MerchantProductClassify>  selectAll();
}