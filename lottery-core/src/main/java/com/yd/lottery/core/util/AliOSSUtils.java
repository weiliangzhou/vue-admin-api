package com.yd.lottery.core.util;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.internal.OSSHeaders;
import com.aliyun.oss.model.*;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * OSS上传工具类
 */
@Slf4j
public class AliOSSUtils {
    /**
     * 管理控制台里面获取EndPoint
     */
    private final static String END_POINT = "oss-cn-hangzhou.aliyuncs.com";
//    private final static String END_POINT = "oss-cn-hangzhou-internal.aliyuncs.com";
    /**
     * 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建
     */
    private final static String ACCESS_KEY_ID = "************";
    private final static String ACCESS_KEY_SECRET = "***************";
    /**
     * 上传的BUCKET名称
     */
    private final static String BUCKET_NAME = "testcjduck";
    /**
     * 管理控制台里面获取的访问域名
     */
    private final static String FILE_HOST = "oss-cn-hangzhou.aliyuncs.com";

    /**
     * 上传文件到bucket
     *
     * @param file 本地文件
     * @return 访问地址
     */
    public static String uploadLocalFile(File file) {
        if (file == null) {
            return null;
        }
        //生成唯一的文件名
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        df.format(new Date());
        String filePath = "upload/images/" + df.format(new Date()) + "/" + System.currentTimeMillis() + file.getName().substring(file.getName().lastIndexOf("."));
        // 创建OSSClient实例
        OSSClient ossClient = new OSSClient(END_POINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setHeader(OSSHeaders.OSS_STORAGE_CLASS, StorageClass.Standard.toString());
//        metadata.setObjectAcl(CannedAccessControlList.Private);
        metadata.setObjectAcl(CannedAccessControlList.PublicRead);
        try {
            // 上传文件
            PutObjectResult result = ossClient.putObject(new PutObjectRequest(BUCKET_NAME, filePath, file,metadata));
            if (null != result) {
                // 拼装访问地址
                String url;
                StringBuffer sb = new StringBuffer();
                sb.append("http://").append(BUCKET_NAME).append(".").append(FILE_HOST).append("/").append(filePath);
                url = sb.toString();
                return url;
            } else {
                log.info(result.toString());
                return null;
            }
        } catch (OSSException | ClientException oe) {
            log.error("OSS上传失败:", oe);
            oe.printStackTrace();
            return null;
        } finally {
            // 关闭OSS服务
            ossClient.shutdown();
        }
    }
}
