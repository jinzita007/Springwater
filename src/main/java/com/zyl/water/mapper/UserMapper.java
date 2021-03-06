package com.zyl.water.mapper;


import com.zyl.water.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAll();

    /**
     * 用户登录
     * @param username
     * @return
     */
    User getUser(@Param(value = "username") String username);

    /**
     * 新增用户名
     * @param user
     */
    void addUser(User user);

    /**
     * 更新一个用户名
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除用户名
     * @param id
     */
    void removeUser(Long id);

}
