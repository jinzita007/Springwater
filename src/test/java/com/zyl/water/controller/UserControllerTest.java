package com.zyl.water.controller;

import com.alibaba.fastjson.JSON;
import com.zyl.water.domain.User;
import com.zyl.water.mapper.UserMapper;
import com.zyl.water.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;

    // 添加--持久层接口
    @Test
    public void getAllUserTest() {

        List<User> result = userMapper.findAll();

        System.out.println("--------------------开始单元测试1--------------------");
        System.out.println(JSON.toJSONString(result));
        System.out.println("--------------------结束单元测试1--------------------");
    }

}
