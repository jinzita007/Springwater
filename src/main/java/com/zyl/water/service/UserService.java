package com.zyl.water.service;

import com.zyl.water.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public Object selectAllUser() {
        return userMapper.selectAllUser();
    }
}
