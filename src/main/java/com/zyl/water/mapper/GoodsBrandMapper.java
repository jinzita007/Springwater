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
     * 商品品牌记录总数
     * @return
     */
    int selectCount();

    /**
     * 模糊查询记录总数
     * @param q
     * @return
     */
    int fuzzQueryCount(@Param("q") String q);

    /**
     * 查询商品品牌--分页
     * @return
     */
    Page<GoodsBrand> findByPage(@Param("q") String q);


    GoodsBrand selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(GoodsBrand record);

    int updateByPrimaryKeyWithBLOBs(GoodsBrand record);

    int updateByPrimaryKey(GoodsBrand record);
}