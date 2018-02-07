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

    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll() {

        return userMapper.findAll();
    }

    public void addUser(User user) {
        userMapper.addUser(user);
    }


}
