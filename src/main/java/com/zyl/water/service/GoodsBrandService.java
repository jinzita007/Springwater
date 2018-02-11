package com.zyl.water.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zyl.water.domain.GoodsBrand;
import com.zyl.water.mapper.GoodsBrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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

    /**
     * 新增商品品牌
     * @param goodsBrand
     * @return
     */
    public Object insert(GoodsBrand goodsBrand) {

        return goodsBrandMapper.insert(goodsBrand);
    }

    /**
     * 更新商品品牌
     * @param goodsBrand
     * @return
     */
    public Object update(GoodsBrand goodsBrand) {
        return goodsBrandMapper.update(goodsBrand);
    }

    /**
     * 删除商品品牌
     * @param brandId
     * @return
     */
    public Object deleteById(Integer brandId) {
        return goodsBrandMapper.deleteById(brandId);
    }

    /**
     * 测试
     * @return
     */
    public List<GoodsBrand> selectAll() {
        return goodsBrandMapper.selectAll();
    }
}
