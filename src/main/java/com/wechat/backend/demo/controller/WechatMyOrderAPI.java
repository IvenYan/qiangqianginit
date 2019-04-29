package com.wechat.qiangqiang.api.controller;

import com.wechat.qiangqiang.api.dao.ConsumerOrdersMapper;
import com.wechat.qiangqiang.api.entity.ConsumerOrders;
import com.wechat.qiangqiang.api.entity.ConsumerOrdersDetail;
import com.wechat.qiangqiang.api.entity.ResponseData;
import com.wechat.qiangqiang.api.service.WechatMyOrderService;
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
@Api(value = "", description = "小程序端订单管理接口")
@RestController
@RequestMapping("/api/qiangqiang/order")
public class WechatMyOrderAPI {

    protected static final Logger log = LoggerFactory.getLogger(WechatMyOrderAPI.class);
    private ResponseData responseData=null;
    private ResponseData getResponseData(){
        if(responseData==null){
            responseData=new ResponseData();
        }
        return this.responseData;
    }
    @Autowired
    private ConsumerOrdersMapper consumerOrdersMapper;
    @Autowired
    private WechatMyOrderService wechatMyOrderService;

//    生成订单，
    @ApiOperation(value="生成订单", notes="")
    @ApiImplicitParam(name = "consumerOrders", value = "下单object", required = true, dataType = "ConsumerOrders")
    @PostMapping("/create")
    public ResponseData createConsumerOrders(@RequestBody ConsumerOrders consumerOrders) throws Exception {
        log.info("createConsumerOrders: start...,consumerOpenId="+consumerOrders.getConsumerOpenId());
        ResponseData responseMessage = wechatMyOrderService.createConsumerOrders(consumerOrders);
        return responseMessage;
    }

    //   更新订单，对订单进行 TODO
    @ApiOperation(value="列出某个用户某个订单", notes="")
    @ApiImplicitParam(name = "consumerOrderNo", value = "订单号", required = true, dataType = "String")
    @GetMapping("/listorderbyids")
    public ConsumerOrdersDetail listOrderByOrderNo(@RequestParam String consumerOrderNo) throws Exception {
        log.info("listOrderByOrderNo: start...,consumerOrderNo="+consumerOrderNo);
        if(consumerOrderNo==null||"".equals(consumerOrderNo)||"undefined".equals(consumerOrderNo)){
            return null;
        }
        return consumerOrdersMapper.selectByOrderNo(consumerOrderNo);
    }

//
    @ApiOperation(value="列出某个用户的所有订单", notes="")
    @ApiImplicitParam(name = "consumerOpenId", value = "用户的openid", required = true, dataType = "String")
    @GetMapping("/listorderbyopenid")
    public List<ConsumerOrdersDetail> listConsumerOrders(@RequestParam String consumerOpenId) throws Exception {
        log.info("listConsumerOrders: start...,consumerOpenId="+consumerOpenId);

        return wechatMyOrderService.listConsumerOrders(consumerOpenId);
//        return null;
    }

    @ApiOperation(value="列出某个用户的所有订单--分页", notes="")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "currentPage", value = "当前页面", required = true, dataType = "int"),
            @ApiImplicitParam(name = "pageSize", value = "页面大小", required = true, dataType = "int"),
            @ApiImplicitParam(name = "consumerOpenId", value = "用户的openid", required = true, dataType = "String"),
            @ApiImplicitParam(name = "consumerOrderStatus", value = "订单状态", required = false, dataType = "String")
    })
    @GetMapping("/listorderbypage")
    public List<ConsumerOrdersDetail> listConsumerOrdersByPage(@RequestParam int currentPage,@RequestParam  int pageSize,@RequestParam String consumerOpenId,@RequestParam String consumerOrderStatus) throws Exception {
        log.info("listConsumerOrdersByPage: start...,currentPage="+currentPage+",pageSize="+pageSize+",consumerOpenId="+consumerOpenId+",consumerOrderStatus="+consumerOrderStatus);

        return wechatMyOrderService.listConsumerOrdersByPage(currentPage,pageSize,consumerOpenId,consumerOrderStatus);
//        return null;
    }

    /*//
    @ApiOperation(value="列出某个用户的某类型订单", notes="")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "consumerOpenId", value = "用户的openid", required = true, dataType = "String"),
            @ApiImplicitParam(name = "consumerOrderStatus", value = "订单状态", required = true, dataType = "String")
    })
    @GetMapping("/listorderbystatus")
    public List<ConsumerOrdersDetail> listConsumerOrdersByIdAndOrderStatus(@RequestParam String consumerOpenId,@RequestParam String consumerOrderStatus) throws Exception {
        log.info("listConsumerOrders: start...,consumerOpenId="+consumerOpenId+",consumerOrderStatus="+consumerOrderStatus);

        return wechatMyOrderService.listConsumerOrdersByPage(consumerOpenId,consumerOrderStatus);
//        return null;
    }*/




}
