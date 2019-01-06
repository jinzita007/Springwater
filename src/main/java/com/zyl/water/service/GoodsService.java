package com.zyl.water.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zyl.water.domain.Goods;
import com.zyl.water.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    /**
     * 查询所有商品信息列表--自带分页
     * @return
     */
    public Page<Goods> findByPage(int pageNo, int pageSize, String q) {
        PageHelper.startPage(pageNo, pageSize);
        return goodsMapper.findByPage(q);
    }

    /**
     * 根据商品类型--查询赠品
     * @return
     */
    public Object findByGift() {
        return goodsMapper.findByGift();
    }

    /**
     * 根据商品类型--查询商品
     * @return
     */
    public Object findByGood() {
        return goodsMapper.findByGood();
    }
}
