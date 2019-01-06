package com.zyl.water.mapper;

import com.zyl.water.domain.Tc;
import com.zyl.water.domain.TcWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TcMapper {
    /**
     * 所有套餐列表
     * @return
     */
    List<Tc> findByPage();

    int deleteByPrimaryKey(Integer id);

    int insert(TcWithBLOBs record);

    int insertSelective(TcWithBLOBs record);

    TcWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TcWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TcWithBLOBs record);

    int updateByPrimaryKey(Tc record);
}