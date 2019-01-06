package com.zyl.water.service;

import com.zyl.water.domain.Tc;
import com.zyl.water.mapper.TcMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TcService {
    @Autowired
    TcMapper tcMapper;

    /**
     * 所有套餐列表
     * @return
     */
    public List<Tc> findByPage() {
        return tcMapper.findByPage();
    }
}
