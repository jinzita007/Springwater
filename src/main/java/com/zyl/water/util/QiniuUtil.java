package com.zyl.water.util;


import com.alibaba.fastjson.JSON;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
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

    @Autowired
    private UploadManager uploadManager;

    @Autowired
    private BucketManager bucketManager;

    @Autowired
    private String uploadToken;

    String bucket = "picture";

    //默认不指定key的情况下，以文件内容的hash值作为文件名
    String key = null;

    public Qiniu uploads(InputStream io) throws QiniuException {
        Response uploadResp = uploadManager.put(io, key, uploadToken, null, null);
        return JSON.parseObject(uploadResp.bodyString(), Qiniu.class);
    }

    /**
     * 删除资源
     * @param key 资源key
     * @return
     * @throws QiniuException 操作失败时抛出
     */
    public Qiniu delete(String key) throws QiniuException {
        Response deleteResp = bucketManager.delete(bucket,key);
        return JSON.parseObject(deleteResp.bodyString(), Qiniu.class);
    }
}
