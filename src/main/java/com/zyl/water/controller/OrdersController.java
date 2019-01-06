package com.zyl.water.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.zyl.water.domain.Orders;
import com.zyl.water.service.OrdersService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    /**
     * 查询未支付订单列表接口
     * @param pageNo
     * @param pageSize
     * @return
     */
    @ApiOperation(value="查询未支付订单列表", notes="查询未支付订单")
    @RequestMapping(value = "orders",method = RequestMethod.GET)
    public Object getByPage(@RequestParam(value = "pageNo",  defaultValue = "1")  int pageNo,
                            @RequestParam(value = "pageSize", defaultValue = "3")  int pageSize) {
        Page<Orders> ordersPage = ordersService.findByPage(pageNo, pageSize);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","查询成功");
        jsonObject.put("data",ordersPage);
        return jsonObject;
    }

    /**
     * 查询未支付订单编号或者ID接口
     * @param q
     * @return
     */
    @ApiOperation(value="查询未支付订单ID接口", notes="未支付查询订单ID")
    @RequestMapping(value = "orders/search",method = RequestMethod.GET)
    public Object getById(String q) {
        List<Orders> orders = ordersService.findById(q);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","查询成功");
        jsonObject.put("data",orders);
        return jsonObject;
    }

}
