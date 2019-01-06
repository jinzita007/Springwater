package com.zyl.water.controller;

import com.zyl.water.domain.Tc;
import com.zyl.water.service.TcService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TcController {

    @Autowired
    TcService tcService;

    /**
     * 所有套餐列表
     * @return
     */
    @ApiOperation(value="所有套餐列表", notes="所有套餐列表")
    @RequestMapping(value = "tc", method = RequestMethod.GET)
    public List<Tc> findByPage() {
        return tcService.findByPage();
    }
}
