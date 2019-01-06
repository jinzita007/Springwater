package com.zyl.water.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zyl.water.domain.Orders;
import com.zyl.water.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    /**
     * 未支付订单列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    public Page<Orders> findByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return ordersMapper.findByPage();
    }

    /**
     * 查询未支付订单ID或订单编号
     * @return
     */
    public List<Orders> findById(String q) {
        return ordersMapper.findById(q);
    }


}
