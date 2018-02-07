package com.zyl.water.mapper;

import com.zyl.water.dao.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by woaitianwen on 2018/2/1.
 */
@Mapper
public interface UserMapper {

    /**
     * 查询全部用户
     * @return
     */
    List<User> selectAllUser();

}
