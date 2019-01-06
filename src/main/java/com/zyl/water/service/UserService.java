package com.zyl.water.service;

import com.zyl.water.domain.User;
import com.zyl.water.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;
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

    /**
     * 用户登录
     * @param user
     * @return
     */
    public User getUser(User user) {
        //通过用户名获取用户
        return userMapper.getUser(user.getUsername());
    }

    /**
     * 新增用户
     * @param user
     */
    public void addUser(User user) {

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
        userMapper.addUser(user);
    }

    /**
     * 更新用户名
     * @param user
     */
    public void updateUser(User user) {

        userMapper.updateUser(user);
    }

    /**
     * 删除用户名
     * @param id
     */
    public void removeUser(Long id) {

        userMapper.removeUser(id);

    }


}
