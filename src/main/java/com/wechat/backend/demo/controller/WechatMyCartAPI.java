package com.wechat.qiangqiang.api.controller;

import com.wechat.qiangqiang.api.dao.ConsumerCartDetailMapper;
import com.wechat.qiangqiang.api.entity.ConsumerCart;
import com.wechat.qiangqiang.api.entity.ConsumerCartDetail;
import com.wechat.qiangqiang.api.entity.ResponseData;
import com.wechat.qiangqiang.api.service.WechatMyCartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName WechatMyCartAPI
 * @Author Iven
 * @Date 2019/3/13 17:58
 * @Version 1.0
 * @Description 购物车的操作
 */
@Api(value = "", description = "小程序端购物车管理接口")
@RestController
@RequestMapping("/api/qiangqiang/cart")
public class WechatMyCartAPI {
    protected static final Logger log = LoggerFactory.getLogger(com.wechat.qiangqiang.api.controller.WechatMyCartAPI.class);

    @Autowired
    private WechatMyCartService wechatMyCartService;
    @Autowired
    private ConsumerCartDetailMapper consumerCartDetailMapper;

//    展示某个用户的所有购物车商品 consumerCartDetail
    @ApiOperation(value="列出某个用户的所有购物车商品 consumerCartDetail", notes="")
    @ApiImplicitParam(name = "consumerOpenId", value = "用户的open id", required = true, dataType = "String")
    @GetMapping("/consumercart/list")
    public ConsumerCartDetail listCartDetail(@RequestParam String consumerOpenId) throws Exception {
        log.info("listCartDetail: start...");
        if(consumerOpenId!=null&&!"".equals(consumerOpenId)&&!"undefined".equals(consumerOpenId)&&!"null".equals(consumerOpenId)){
            return wechatMyCartService.findCartListByConsumerId(consumerOpenId);
        }
//        return consumerCartMapper.listProductByBrandId(id);
        return null;
    }

//  把用户想要的商品加入购物车  判断商品是否存在，
    @ApiOperation(value="把用户想要的商品加入购物车  并判断商品是否存在，", notes="")
    @ApiImplicitParam(name = "consumerCart", value = "购物车Object", required = true, dataType = "ConsumerCart")
    @ResponseBody
    @RequestMapping(value = { "/consumercart/addproduct"} , method = RequestMethod.POST,produces="application/json;charset=UTF-8")
    public ResponseData addProductToCartByProductId(@RequestBody ConsumerCart consumerCart) throws Exception {
        log.info("addProductToCartByProductId: start... ,consumerId="+consumerCart.getConsumerOpenId()+",productId="+consumerCart.getMerchantProductId()+",amount="+consumerCart.getConsumerCartMerchantProductAmount()+",selectStatus="+consumerCart.isSelectStatus());
        String message = wechatMyCartService.addProductToCartByProductId(consumerCart.getConsumerOpenId(), consumerCart.getMerchantProductId(), consumerCart.getConsumerCartMerchantProductAmount(),consumerCart.isSelectStatus());
        ResponseData responseData = new ResponseData();
        responseData.setMessage(message);
        return responseData;
    }

    //  把用户想要的商品加入购物车  判断商品是否存在，
    @ApiOperation(value="在购物车中，修改购物车的数量", notes="")
    @ApiImplicitParam(name = "consumerCart", value = "购物车Object", required = true, dataType = "ConsumerCart")
    @ResponseBody
    @RequestMapping(value = { "/consumercart/updateproduct"} , method = RequestMethod.POST,produces="application/json;charset=UTF-8")
    public ResponseData updateProductToCart(@RequestBody ConsumerCart consumerCart) throws Exception {
        log.info("updateProductToCart: start... ,consumerId="+consumerCart.getConsumerOpenId()+",productId="+consumerCart.getMerchantProductId()+",amount="+consumerCart.getConsumerCartMerchantProductAmount()+",selectStatus="+consumerCart.isSelectStatus());

        String message = wechatMyCartService.updateProductToCartByProductId(consumerCart.getConsumerOpenId(), consumerCart.getMerchantProductId(), consumerCart.getConsumerCartMerchantProductAmount());

        ResponseData responseData = new ResponseData();
        responseData.setCode("200");
        responseData.setMessage(message);
        return responseData;
    }
}
