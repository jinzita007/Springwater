package com.zyl.water.service;

import com.zyl.water.domain.GoodsBrand;
import com.zyl.water.mapper.GoodsBrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsBrandService {

    @Autowired
    GoodsBrandMapper goodsBrandMapper;

    public List<GoodsBrand> selectBybrand(){
        return goodsBrandMapper.selectBybrand();
    }
}
