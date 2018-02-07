package com.zyl.water.mapper;


import com.zyl.water.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAll();

    /**
     * 新增用户名
     * @param user
     */
    void addUser(User user);
}
