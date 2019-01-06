package com.zyl.water.controller;

import com.alibaba.fastjson.JSON;
import com.zyl.water.domain.GoodsBrand;
import com.zyl.water.mapper.GoodsBrandMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodBrandControllerTest {

    @Autowired
    GoodsBrandMapper goodsBrandMapper;

    // 添加--持久层接口
    @Test
    public void getAllTest() {

        System.out.println("--------------------开始单元测试1--------------------");
        System.out.println(JSON.toJSONString(goodsBrandMapper.selectAll()));
        System.out.println("--------------------结束单元测试1--------------------");
    }

    @Test
    public void addTest() {
        GoodsBrand result = new GoodsBrand();
        result.setBrandName("eee");
        result.setBrandTitile("eee");
        result.setBrandRebate("eee");
        result.setBrandImg("20");
        result.setStatus(1);
        result.setSort(3);

        System.out.println("--------------------开始单元测试1--------------------");
        System.out.println(JSON.toJSONString(goodsBrandMapper.insert(result)));
        System.out.println("--------------------结束单元测试1--------------------");

    }

}
