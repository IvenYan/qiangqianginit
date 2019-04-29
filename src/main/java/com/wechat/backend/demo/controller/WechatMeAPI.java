package com.wechat.qiangqiang.api.controller;

import com.wechat.qiangqiang.api.controller.entity.UserInfo;
import com.wechat.qiangqiang.api.dao.ConsumerAddressMapper;
import com.wechat.qiangqiang.api.dao.ConsumerMapper;
import com.wechat.qiangqiang.api.entity.Consumer;
import com.wechat.qiangqiang.api.entity.ConsumerAddress;
import com.wechat.qiangqiang.api.entity.ResponseData;
import com.wechat.qiangqiang.api.service.WechatMeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName WechatMeAPI
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/3/10 17:10
 * @Version 1.0
 **/
@Api(value = "", description = "小程序端用户管理接口")
@RestController
@RequestMapping("/api/qiangqiang/me")
public class WechatMeAPI {

    protected static final Logger log = LoggerFactory.getLogger(com.wechat.qiangqiang.api.controller.WechatMeAPI.class);

    @Autowired
    private WechatMeService wechatMeService;
    @Autowired
    private ConsumerAddressMapper consumerAddressMapper;
    @Autowired
    private ConsumerMapper consumerMapper;

    @ApiOperation(value="更新用户默认地址", notes="")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "customerWechatOppenid", value = "唯一open id", required = true, dataType = "String"),
            @ApiImplicitParam(name = "addressId", value = "地址id", required = true, dataType = "int")
    })
    @GetMapping("/consumer/updatedefaultaddress")
    public ResponseData updateConsumer(@RequestParam String consumerOpenId,@RequestParam Integer addressId) throws Exception {
        log.info("updateConsumer: start...,consumerOpenId="+consumerOpenId+",addressId="+addressId);
        consumerMapper.updateAddressDefaultId(consumerOpenId,addressId);
//        return wechatMeService.listConsumerAddress();
        return null;
    }



//    新增用户:判断用户是否存在，然后添加
    @ApiOperation(value="新增用户:判断用户是否存在，然后添加", notes="")
    @ApiImplicitParam(name = "userInfo", value = "用户object", required = true, dataType = "UserInfo")
    @PostMapping("/addconsumer/byobject")
    public String insertConsumerNew(@RequestBody UserInfo userInfo) throws Exception {
        log.info("insertConsumerNew: start...,");
        wechatMeService.insertConsumerNew(userInfo);
        return null;
    }

    @ApiOperation(value="列出某个用户默认地址+所有地址", notes="")
    @ApiImplicitParam(name = "customerOpenId", value = "用户Open ID", required = true, dataType = "String")
    @GetMapping("/address/defaultandaddresslist")
    public Consumer listConsumerDefaultAddressAndAddressList(@RequestParam String customerOpenId) throws Exception {
        log.info("listConsumerDefaultAddressAndAddressList: start...,customerOpenId="+customerOpenId);

        return wechatMeService.listConsumerDefaultAddressAndAddressList(customerOpenId);
    }

    @ApiOperation(value="列出某个用户的所有地址", notes="")
    @ApiImplicitParam(name = "customerOpenId", value = "用户Open ID", required = true, dataType = "String")
    @GetMapping("/address/list")
    public List<ConsumerAddress> listConsumerAddressList(@RequestParam String customerOpenId) throws Exception {
        log.info("listConsumerAddressList: start...,customerOpenId="+customerOpenId);

        return wechatMeService.listConsumerAddressList(customerOpenId);
    }

    @ApiOperation(value="添加地址", notes="")
    @ApiImplicitParam(name = "consumerAddress", value = "用户地址Object", required = true, dataType = "ConsumerAddress")
    @PostMapping("/address/add")
    public ResponseData addConsumerAddress(@RequestBody ConsumerAddress consumerAddress) throws Exception {
        log.info("addConsumerAddress: start...,consumerOpenId="+consumerAddress.getConsumerOpenId());
        ResponseData returnData=new ResponseData();
        if(consumerAddress.getConsumerOpenId()==null||"".equals(consumerAddress.getConsumerOpenId())){
            returnData.setCode("201");
            returnData.setMessage("用户OpenId为空，不能添加");
        }else {
            wechatMeService.insertSelective(consumerAddress);
            returnData.setCode("200");
            returnData.setMessage("添加成功");
        }


        return returnData;
    }

    @ApiOperation(value="删除地址", notes="")
    @ApiImplicitParam(name = "consumerAddress", value = "用户地址Object", required = true, dataType = "ConsumerAddress")
    @GetMapping("/address/deletebyid")
    public ResponseData deleteConsumerAddressById(@RequestParam String consumerAddressId) throws Exception {
        log.info("deleteConsumerAddressById: start...,consumerAddressId="+consumerAddressId);
        ResponseData returnData=new ResponseData();
        if(consumerAddressId==null||"".equals(consumerAddressId)){
            returnData.setCode("201");
            returnData.setMessage("用户consumerAddressId为空，不能添加");
        }else {
            consumerAddressMapper.deleteByAddressId(consumerAddressId);
            returnData.setCode("200");
            returnData.setMessage("删除成功");
        }
        return returnData;
    }
}
