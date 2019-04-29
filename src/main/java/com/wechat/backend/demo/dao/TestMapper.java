package com.wechat.qiangqiang.api.dao;

import com.wechat.qiangqiang.api.entity.Test;

public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);
}