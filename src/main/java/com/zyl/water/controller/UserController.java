package com.zyl.water.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Tables;
import com.zyl.water.domain.User;
import com.zyl.water.mapper.UserMapper;
import com.zyl.water.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.sql.Timestamp;
import java.util.List;

/**
 * Created by woaitianwen on 2018/2/1.
 */
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;

    /**
     * 获取用户列表
     * @return
     */
    @ApiOperation(value="获取用户列表", notes="获取用户列表")
    @RequestMapping(value = "users", method = RequestMethod.GET)
    public List<User> findAll() {
        return userService.findAll();
    }

    /**
     * 新增用户
     * @param user
     * @return
     */
    @ApiOperation(value="新增一个用户", notes="新增一个用户")
    @RequestMapping(value = "users", method = RequestMethod.POST)
    public Object addUser(User user) {

        userService.addUser(user);

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("msg","插入成功！");
        jsonObject.put("data",user);

        return jsonObject;

    }

    /**
     * 更新一个用户名
     * @param id
     * @param username
     * @param password
     * @param email
     * @param mobile
     * @param status
     * @return
     */
    @ApiOperation(value="更新一个用户", notes="更新一个用户")
    @RequestMapping(value = "users/{id}", method = RequestMethod.PUT)
    public String updateUser(@PathVariable("id") Long id,
                             @RequestParam("username") String username,
                             @RequestParam("password") String password,
                             @RequestParam("email") String email,
                             @RequestParam("mobile") String mobile,
                             @RequestParam("status") Boolean status) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setMobile(mobile);
        user.setStatus(status);
        //生成时间
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        user.setUpdate_time(timestamp);

        userService.updateUser(user);

        return "success";

    }

    /**
     * 删除用户名
     * @param id
     */
    @ApiOperation(value="删除用户名", notes="删除用户名")
    @RequestMapping(value = "users/{id}",method = RequestMethod.DELETE)
    public void removeUser(@PathVariable("id") Long id) {
        userService.removeUser(id);
    }



}
