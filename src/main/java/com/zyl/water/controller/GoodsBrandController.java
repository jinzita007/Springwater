package com.zyl.water.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.zyl.water.domain.GoodsBrand;
import com.zyl.water.mapper.GoodsBrandMapper;
import com.zyl.water.service.GoodsBrandService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhouyulong on 2018/2/8.
 *
 * 商品品牌分类--控制层
 *
 */
@RestController
public class GoodsBrandController {

    @Autowired
    GoodsBrandMapper goodsBrandMapper;

    @Autowired
    GoodsBrandService goodsBrandService;

    /**
     * 查询商品品牌
     * @param pageNo
     * @param pageSize
     * @param q
     * @return
     */
    @ApiOperation(value="查询商品品牌", notes="查询商品品牌")
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

    /**
     * 新增商品品牌
     * @param goodsBrand
     * @return
     */
    @ApiOperation(value="新增商品品牌", notes="新增商品品牌")
    @RequestMapping(value = "brand",method = RequestMethod.POST)
    public Object insert(GoodsBrand goodsBrand) {

        goodsBrandService.insert(goodsBrand);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","新增成功");
        jsonObject.put("data",goodsBrand);
        return jsonObject;
    }

    /**
     * 更新商品品牌
     * @param brandId
     * @param goodsBrand
     * @return
     */
    @ApiOperation(value="更新商品品牌", notes="更新商品品牌")
    @RequestMapping(value = "brand/{id}",method = RequestMethod.PUT)
    public Object update(@PathVariable("id") Integer brandId,
                         /*@RequestParam("brandName") String brandName,
                         @RequestParam("brandTitile") String brandTitile,
                         @RequestParam("brandRebate") String brandRebate,
                         @RequestParam("brandImg") String brandImg,
                         @RequestParam("status") Integer status,
                         @RequestParam("sort") Integer sort*/
                         @RequestBody GoodsBrand goodsBrand
                         ) {
        /*GoodsBrand goodsBrand = new GoodsBrand();
        goodsBrand.setBrandId(brandId);
        goodsBrand.setBrandName(brandName);
        goodsBrand.setBrandTitile(brandTitile);
        goodsBrand.setBrandRebate(brandRebate);
        goodsBrand.setBrandImg(brandImg);
        goodsBrand.setStatus(status);
        goodsBrand.setSort(sort);*/

        JSONObject jsonObject = new JSONObject();

        goodsBrandService.update(goodsBrand);
        jsonObject.put("msg","更新成功");
        jsonObject.put("data",goodsBrand);
        return jsonObject;

    }

    /**
     * 删除商品品牌
     * @param brandId
     * @return
     */
    @ApiOperation(value="删除商品品牌", notes="删除商品品牌")
    @RequestMapping(value = "brand/{id}",method = RequestMethod.DELETE)
    public Object deleteById(@PathVariable("id") Integer brandId) {
        goodsBrandService.deleteById(brandId);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","删除成功");
        return jsonObject;
    }

}
