package com.zyl.water.mapper;

import com.github.pagehelper.Page;
import com.zyl.water.domain.GoodsBrand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhouyulong on 2018/2/8.
 *
 * 商品品牌分类--持久层接口类
 *
 */
@Mapper
public interface GoodsBrandMapper {

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

    /**
     * 新增商品品牌
     * @param goodsBrand
     * @return
     */
    int insert(GoodsBrand goodsBrand);

    /**
     * 更新商品品牌
     * @param brandId
     * @return
     */

    int update(GoodsBrand goodsBrand);
    /**
     * 删除商品品牌
     * @param brandId
     * @return
     */
    int deleteById(Integer brandId);

    /**
     * 测试
     * @return
     */
    List<GoodsBrand> selectAll();

    GoodsBrand selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(GoodsBrand record);

    int updateByPrimaryKeyWithBLOBs(GoodsBrand record);

    int updateByPrimaryKey(GoodsBrand record);
}