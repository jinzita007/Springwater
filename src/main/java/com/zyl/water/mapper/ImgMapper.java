package com.zyl.water.mapper;

import com.zyl.water.domain.Img;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ImgMapper {


    int insert(Img img);

    int update(String key);

    int deleteByName(String key);

    /*int insertSelective(Img record);

    int deleteByPrimaryKey(Integer id);

    Img selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Img record);

    int updateByPrimaryKey(Img record);*/
}