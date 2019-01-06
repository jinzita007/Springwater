package com.zyl.water.mapper;

import com.zyl.water.domain.OrderAddress;

public interface OrderAddressMapper {
    int insert(OrderAddress record);

    int insertSelective(OrderAddress record);
}