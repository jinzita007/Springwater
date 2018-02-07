package com.zyl.water.controller;

import com.zyl.water.dao.User;
import com.zyl.water.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by woaitianwen on 2018/2/1.
 */
@RestController
@EnableAutoConfiguration
public class UserController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserServiceImpl userService;

    @GetMapping(value = "/users")
    List<User> getAllUser() {
        return userMapper.selectAllUser();
    }


}
