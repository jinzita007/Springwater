package com.zyl.water.service;

import com.zyl.water.domain.User;
import com.zyl.water.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> selectAllUser() {

        return userMapper.findAll();
    }
}
