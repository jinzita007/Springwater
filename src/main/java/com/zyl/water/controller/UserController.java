package com.zyl.water.controller;

import com.zyl.water.domain.User;
import com.zyl.water.mapper.UserMapper;
import com.zyl.water.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @ApiOperation(value="获取用户列表", notes="获取用户列表")
    @RequestMapping(value = "users", method = RequestMethod.GET)
    public List<User> getAllUser() {

        return userMapper.findAll();

    }

}
