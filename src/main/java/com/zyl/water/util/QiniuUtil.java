package com.zyl.water.util;

import com.alibaba.fastjson.JSON;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.zyl.water.domain.Qiniu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.InputStream;

/**
 * 上传工具类
 */
@Component
public class QiniuUtil {

    public static Qiniu upload;
    @Autowired
    private  UploadManager uploadManager;

    @Autowired
    private  String uploadToken;

    public static Qiniu upload(InputStream io) throws QiniuException {
        Response uploadResp = uploadManager.put(io, null, uploadToken, null, null);
        return JSON.parseObject(uploadResp.bodyString(), Qiniu.class);
    }
}
