package com.zyl.water.mapper;

import com.zyl.water.domain.OrderGoods;

public interface OrderGoodsMapper {
    int insert(OrderGoods record);

    int insertSelective(OrderGoods record);
}