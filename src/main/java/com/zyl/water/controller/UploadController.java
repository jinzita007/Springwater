package com.zyl.water.controller;
import com.zyl.water.domain.Img;
import com.zyl.water.service.ImgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

/**
 * 上传文件类
 */

@RestController
public class UploadController {

    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);


    @Autowired
    ImgService imgService;

    @Value("${upload.path}")
    private String path;


    /**
     * 第一种上传方式
     * @param file
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public  Map<String, Object> upload(@RequestParam MultipartFile file) throws IOException {

        // 先判断文件是否为空
        if (!file.isEmpty()) {
            // 获得原始文件名
            String fileName = file.getOriginalFilename();
            InputStream is = file.getInputStream();

            Files.copy(is, Paths.get(path + fileName),
                    StandardCopyOption.REPLACE_EXISTING);
            logger.info(fileName);

            Img img = new Img();
            img.setName(fileName);
            img.setUrl(path+fileName);
            img.setStatus(true);
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            img.setCreatetime(timestamp);

            imgService.insert(img);
            Map<String, Object> map = new HashMap<>();
            map.put("msg", "上传成功!");
            map.put("id",img.getId());
            map.put("url",img);
            return map;

        } else {
            Map<String, Object> map = new HashMap<>();
            map.put("error", "上传失败!");
            return map;
        }

    }



}
