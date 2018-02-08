package com.zyl.water.mapper;

import com.zyl.water.domain.GoodsBrand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsBrandMapper {
    int deleteByPrimaryKey(Integer brandId);

    int insert(GoodsBrand record);

    int insertSelective(GoodsBrand record);

    List<GoodsBrand> selectBybrand();

    GoodsBrand selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(GoodsBrand record);

    int updateByPrimaryKeyWithBLOBs(GoodsBrand record);

    int updateByPrimaryKey(GoodsBrand record);
}