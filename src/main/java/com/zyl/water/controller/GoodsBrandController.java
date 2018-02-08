package com.zyl.water.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.zyl.water.domain.GoodsBrand;
import com.zyl.water.mapper.GoodsBrandMapper;
import com.zyl.water.service.GoodsBrandService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GoodsBrandController {

    @Autowired
    GoodsBrandMapper goodsBrandMapper;

    @Autowired
    GoodsBrandService goodsBrandService;

    @ApiOperation(value="查询所有商品品牌", notes="查询所有商品品牌")
    @RequestMapping(value = "brand",method = RequestMethod.GET)
    public Object getByPage(@RequestParam(value = "pageNo",  defaultValue = "1")  int pageNo,
                            @RequestParam(value = "pageSize", defaultValue = "3")  int pageSize,
                            String q) {

        if(q!=null) {
            int total = goodsBrandMapper.fuzzQueryCount(q);
            Page<GoodsBrand> goodsBrandPage = goodsBrandService.findByPage(pageNo, pageSize, q);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("msg","模糊查询成功");
            jsonObject.put("total",total);
            jsonObject.put("data",goodsBrandPage);
            return jsonObject;
        } else {
            int totalCount = goodsBrandMapper.selectCount();
            Page<GoodsBrand> goodsBrandPage = goodsBrandService.findByPage(pageNo, pageSize, q);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("msg","查询成功");
            jsonObject.put("total",totalCount);
            jsonObject.put("data",goodsBrandPage);
            return jsonObject;
        }

    }
}
