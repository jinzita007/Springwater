package com.zyl.water.config;

import com.qiniu.common.Zone;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QiniuConfig {

    @Value("${file.server.ak}")
    private String accessKey;

    @Value("${file.server.sk}")
    private String secretKey;

    @Value("${file.server.bucket}")
    private String bucketName;

    /**
     * 上传文件
     * @return
     */
    @Bean
    public UploadManager uploadManager() {
        com.qiniu.storage.Configuration config = new com.qiniu.storage.Configuration(Zone.zone0());
        return new UploadManager(config);
    }

    @Bean
    public BucketManager bucketManager() {
        Auth auth = Auth.create(accessKey, secretKey);
        com.qiniu.storage.Configuration config = new com.qiniu.storage.Configuration(Zone.zone0());
        return new BucketManager(auth, config);
    }

    @Bean
    public String uploadToken(){
        return Auth.create(accessKey, secretKey).uploadToken(bucketName);
    }

}
