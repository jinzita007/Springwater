package com.zyl.water.controller;

import com.alibaba.fastjson.JSONObject;
import com.zyl.water.domain.GoodsBrand;
import com.zyl.water.service.GoodsBrandService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsBrandController {

    @Autowired
    GoodsBrandService goodsBrandService;

    @ApiOperation(value="查询所有商品品牌", notes="查询所有商品品牌")
    @RequestMapping(value = "brand",method = RequestMethod.GET)
    public Object selectBybrand() {
        List<GoodsBrand> goodsBrandList = goodsBrandService.selectBybrand();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","查询成功");
        jsonObject.put("data",goodsBrandList);
        return jsonObject;
    }
}
