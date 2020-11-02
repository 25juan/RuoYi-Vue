package com.abit.update.controller;

import cn.hutool.core.lang.Console;
import cn.hutool.crypto.SecureUtil;
import com.abit.update.domain.Apk;
import com.abit.update.domain.ApkInfo;
import com.abit.update.service.IApkService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.common.utils.file.FileUploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("/app")
public class ApkInfoController extends BaseController {
    @Autowired
    private IApkService apkService;

    public  String appendDownloadUrl(String profile) {
        String rootPath = ServletUtils.getRootPath() ;
        return rootPath + profile ;
    }

    @GetMapping(value = "/checkUpdate/{appKey}")
    public ApkInfo checkUpdate(@PathVariable String appKey) {
        ApkInfo apkInfo = apkService.selectApkByAppKey(appKey);
        if(apkInfo == null) {
            apkInfo = new ApkInfo();
            apkInfo.setCode(1);
            apkInfo.setMsg("暂无可用的更新包");
        }else {
            String profile = apkInfo.getDownloadUrl() ;
            apkInfo.setDownloadUrl(appendDownloadUrl(profile));
            String path = FileUploadUtils.getAbsolutePath(profile) ;
            File file = new File(path) ;
            if(file.exists()){ // 文件存在
                String md5 = SecureUtil.md5(file);
                apkInfo.setApkMd5(md5);
            }
        }
        return apkInfo ;
    }

}
