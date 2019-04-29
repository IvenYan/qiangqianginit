package com.wechat.qiangqiang.api.controller;

import com.wechat.qiangqiang.api.entity.ClassifyMenu;
import com.wechat.qiangqiang.api.entity.MerchantProduct;
import com.wechat.qiangqiang.api.entity.MerchantProductBrand;
import com.wechat.qiangqiang.api.entity.MerchantProductClassify;
import com.wechat.qiangqiang.api.service.MerchantProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@Api(value = "", description = "小程序端product接口")
@RestController
@RequestMapping("/api/qiangqiang/product")
public class WechatProductAPI {
    protected static final Logger log = LoggerFactory.getLogger(WechatProductAPI.class);

    public WechatProductAPI() {
        log.info("WechatProductAPI Controller start...");
    }

    @Autowired
    private MerchantProductService productService;

//    列出某个品牌的所有产品
    @ApiOperation(value="列出某个品牌的所有产品", notes="")
    @ApiImplicitParam(name = "id", value = "brand id", required = true, dataType = "int")
    @GetMapping("/productlist/bybrandid")
    public ArrayList<MerchantProduct> listProductByBrandId(@RequestParam Integer id) throws Exception {
        log.info("listProductByBrandId: start... ,brandId="+id);
        return productService.listProductByBrandId(id);
    }

//    列出所有1级菜单
    @ApiOperation(value="列出所有1级菜单", notes="")
    @GetMapping("/classify/list")
    public ArrayList<MerchantProductClassify> listClassify() throws Exception {
        log.info("listClassify: start...");
        return productService.listMerchantProductClassify();
    }

//    列出单个1级菜单
    @ApiOperation(value="列出单个1级菜单", notes="")
    @ApiImplicitParam(name = "id", value = "classify id", required = true, dataType = "int")
    @GetMapping(value = "/classify/byid")
    public MerchantProductClassify findClassifyById(@RequestParam Integer id) throws Exception {
        log.info("findClassifyById: start... ,id="+id);
        return productService.findById(1);
    }

    @ApiOperation(value="列出热门商品 根据品牌hot", notes="")
    @ApiImplicitParam(name = "max", value = "max", required = true, dataType = "int")
    @GetMapping("/hotproduct/list")
    public ArrayList<MerchantProduct> listHotProduct(@RequestParam int max) throws Exception {
        log.info("listHotProduct: start...");
        ArrayList<MerchantProduct> merchantProducts = productService.listHotMerchantProductByBrandHot(max);
        return merchantProducts;
    }

    @ApiOperation(value="列出热门商品 根据库存", notes="")
    @ApiImplicitParam(name = "max", value = "max", required = true, dataType = "int")
    @GetMapping("/hotproduct/listbyinventory")
    public ArrayList<MerchantProduct> listHotProductByMerchantInventory(@RequestParam int max) throws Exception {
        log.info("listHotProductByMerchantInventory: start...");
        ArrayList<MerchantProduct> merchantProducts = productService.listHotMerchantProductByMerchantInventory(max);
        return merchantProducts;
    }
}
