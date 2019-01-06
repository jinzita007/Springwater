package com.zyl.water.mapper;

import com.github.pagehelper.Page;
import com.zyl.water.domain.Orders;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrdersMapper {

    Page<Orders> findByPage();

    List<Orders> findById(@Param("q") String q);

}