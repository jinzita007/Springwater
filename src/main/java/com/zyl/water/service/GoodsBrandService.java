package com.zyl.water.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zyl.water.domain.GoodsBrand;
import com.zyl.water.mapper.GoodsBrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by zhouyulong on 2018/2/8.
 *
 * 商品品牌分类--业务层实现类
 *
 */
@Service
public class GoodsBrandService {

    @Autowired
    GoodsBrandMapper goodsBrandMapper;

    /**
     * 查询商品品牌--分页
     * @param pageNo  当前页码
     * @param pageSize 每页大小
     * @return
     */
    public Page<GoodsBrand> findByPage(int pageNo, int pageSize, String q) {
        PageHelper.startPage(pageNo, pageSize);
        return goodsBrandMapper.findByPage(q);
    }
}
