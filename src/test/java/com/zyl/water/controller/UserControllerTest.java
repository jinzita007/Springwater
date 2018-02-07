package com.zyl.water.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zyl.water.domain.User;
import com.zyl.water.mapper.UserMapper;
import com.zyl.water.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;
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
    @Test
    public void addUserTest() {
        User user = new User();
        user.setUsername("haha");
        user.setPassword("123456");
        user.setEmail("haha@qq.com");
        user.setMobile("15555999933");

        Timestamp timestamp = new Timestamp(System.currentTimeMillis()); //生成时间

        //获取本地IP
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String ip = address.getHostAddress();

        user.setReg_time(timestamp);
        user.setReg_ip(ip);
        user.setLast_login_time(timestamp);
        user.setLast_login_ip(ip);
        user.setUpdate_time(timestamp);
        user.setStatus(true);
        userService.addUser(user);

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("msg","插入成功！");
        jsonObject.put("data",user);

        System.out.println("--------------------开始单元测试1--------------------");
        System.out.println(JSON.toJSONString(jsonObject));
        System.out.println("--------------------结束单元测试1--------------------");

    }
    @Test
    public void ipTest() {

        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("--------------------开始单元测试1--------------------");
        System.out.println("本机的IP = " + address.getHostAddress());
        System.out.println("--------------------结束单元测试1--------------------");

    }

}
