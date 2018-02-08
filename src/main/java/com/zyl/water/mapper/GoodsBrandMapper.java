package com.zyl.water.mapper;

import com.github.pagehelper.Page;
import com.zyl.water.domain.GoodsBrand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsBrandMapper {
    int deleteByPrimaryKey(Integer brandId);

    int insert(GoodsBrand record);

    int insertSelective(GoodsBrand record);

    /**
     * 查询商品品牌--分页
     * @return
     */
    Page<GoodsBrand> findByPage();


    GoodsBrand selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(GoodsBrand record);

    int updateByPrimaryKeyWithBLOBs(GoodsBrand record);

    int updateByPrimaryKey(GoodsBrand record);
}