package com.zyl.water.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.util.StringUtil;
import com.zyl.water.domain.Img;
import com.zyl.water.mapper.ImgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImgService {

    @Autowired
    ImgMapper imgMapper;

    /**
     * 插入图片
     * @param img
     */
    public void insert(Img img) {
        imgMapper.insert(img);
        System.out.println(img.getId());
    }

    /**
     * 更新图片
     * @param key
     */
    public void update(String key) {
        imgMapper.update(key);
    }

    /**
     * 删除七牛图片名称
     * @param key
     * @return
     */
    public Object deleteByName(String key) {
        return imgMapper.deleteByName(key);
    }
}

