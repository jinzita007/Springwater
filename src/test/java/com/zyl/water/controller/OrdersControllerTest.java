package com.zyl.water.controller;

import com.alibaba.fastjson.JSON;
import com.zyl.water.domain.Orders;
import com.zyl.water.mapper.OrdersMapper;
import com.zyl.water.service.OrdersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrdersControllerTest {

    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private OrdersService ordersService;

    @Test
    public void findByIdTest() {
        List<Orders> result = ordersService.findById("1");
        System.out.println("--------------------开始单元测试1--------------------");
        System.out.println(JSON.toJSONString(result));
        System.out.println("--------------------结束单元测试1--------------------");
    }
}
