package com.yd.lottery.admin.web;

import com.yd.lottery.admin.service.FileUploadService;
import com.yd.lottery.core.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 二师兄超级帅
 * @Title: ImageController
 * @ProjectName parent
 * @Description: TODO
 * @date 2018/7/1919:12
 */
@RestController
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("/api/admin/file/upload")
    public Object imageUpload(@RequestParam("file") MultipartFile file) {
        String url = fileUploadService.upload(file, 1);
        return ResponseUtil.ok(url);
    }
}
