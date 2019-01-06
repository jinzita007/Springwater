package com.zyl.water.controller;

import com.github.pagehelper.Page;
import com.zyl.water.domain.Goods;
import com.zyl.water.mapper.GoodsMapper;
import com.zyl.water.service.GoodsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GoodsController {

    @Autowired
    GoodsMapper goodsMapper;

    @Autowired
    GoodsService goodsService;

    /**
     * 查询所有商品信息列表
     * @return
     */
    @ApiOperation(value="查询商品信息列表", notes="查询商品信息列表")
    @RequestMapping(value = "goods", method = RequestMethod.GET)
    public Map<String, Object> findByPage(
                                  @RequestParam(value = "pageNo",  defaultValue = "1")  int pageNo,
                                  @RequestParam(value = "pageSize", defaultValue = "3")  int pageSiz,
                                  String q) {
        Page<Goods> goods = goodsService.findByPage(pageNo, pageSiz,q);
        if(q!=null) {
            int total = goodsMapper.fuzzQueryCount(q);
            Map<String, Object> map = new HashMap<>();
            map.put("code","0");
            map.put("total",total);
            map.put("data",goods);
            return map;
        } else {
            int total = goodsMapper.selectCount();
            Map<String, Object> map = new HashMap<>();
            map.put("code","0");
            map.put("total",total);
            map.put("data",goods);
            return map;
        }

    }

    /**
     * 根据商品类型--查询赠品
     * @return
     */
    @ApiOperation(value="查询赠品", notes="查询赠品")
    @RequestMapping(value = "goods/gift", method = RequestMethod.GET)
    public Object findByGift() {
        return goodsService.findByGift();
    }

    /**
     * 根据商品类型--查询商品
     * @return
     */
    @ApiOperation(value="查询商品", notes="查询商品")
    @RequestMapping(value = "goods/good", method = RequestMethod.GET)
    public Object findByGood() {
        return goodsService.findByGood();
    }



}
