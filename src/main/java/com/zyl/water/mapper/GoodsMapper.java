package com.zyl.water.mapper;

import com.github.pagehelper.Page;
import com.zyl.water.domain.Goods;
import com.zyl.water.domain.GoodsWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsMapper {

    /**
     * 查询商品信息列表
     * @return
     */
    List<Goods> selectByGoodsList();

    /**
     * 模糊查询
     * @param q
     * @return
     */
    int fuzzQueryCount(@Param("q") String q);

    /**
     * 查询商品信息列表--自带分页
     * @return
     */
    Page<Goods> findByPage(@Param("q") String q);

    /**
     * 商品信息记录总数
     * @return
     */
    int selectCount();

    /**
     * 根据商品类型--查询赠品
     * @return
     */
    List<Goods> findByGift();

    /**
     * 根据商品类型--查询商品
     * @return
     */
    List<Goods> findByGood();

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsWithBLOBs record);

    int insertSelective(GoodsWithBLOBs record);

    GoodsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GoodsWithBLOBs record);

    int updateByPrimaryKey(Goods record);
}