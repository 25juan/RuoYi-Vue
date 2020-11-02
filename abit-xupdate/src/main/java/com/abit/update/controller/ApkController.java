package com.abit.update.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.exception.file.InvalidExtensionException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.common.utils.file.FileUploadUtils;
import net.dongliu.apk.parser.ApkFile;
import net.dongliu.apk.parser.bean.ApkMeta;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.abit.update.domain.Apk;
import com.abit.update.service.IApkService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * apk管理Controller
 * 
 * @author ruoyi
 * @date 2020-09-24
 */
@RestController
@RequestMapping("/update/apk")
public class ApkController extends BaseController
{
    @Autowired
    private IApkService apkService;

    /**
     * 查询apk管理列表
     */
    @PreAuthorize("@ss.hasPermi('update:apk:list')")
    @GetMapping("/list")
    public TableDataInfo list(Apk apk)
    {
        startPage();
        List<Apk> list = apkService.selectApkList(apk);
        List<Apk> list2 = new ArrayList<>();

        for(Apk apk1 : list){
            apk1.setAndroidDownloadUrl(appendDownloadUrl(apk1));
            if(apk1.getDownloadCount() == null){
                apk1.setDownloadCount(0L);
            }
            list2.add(apk1);
        }
        return getDataTable(list2);
    }

    public  String appendDownloadUrl(Apk apk) {
        String rootPath = ServletUtils.getRootPath() ;
        String downloadUrl = apk.getAndroidDownloadUrl() ;
        return rootPath + downloadUrl ;
    }

    /**
     * 导出apk管理列表
     */
    @PreAuthorize("@ss.hasPermi('update:apk:export')")
    @Log(title = "apk管理", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Apk apk)
    {
        List<Apk> list = apkService.selectApkList(apk);
        ExcelUtil<Apk> util = new ExcelUtil<Apk>(Apk.class);
        return util.exportExcel(list, "apk");
    }

    /**
     * 获取apk管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('update:apk:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        Apk apk = apkService.selectApkById(id);
        apk.setAndroidDownloadUrl(appendDownloadUrl(apk));
        return AjaxResult.success(apk);
    }

    /**
     * 新增apk管理
     */
    @PreAuthorize("@ss.hasPermi('update:apk:add')")
    @Log(title = "apk管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult insertOrUpdate(@RequestParam( value = "file",required = false) MultipartFile file, @RequestParam String data)
    {
        String rootPath = RuoYiConfig.getUploadPath() ;
        try {
            Apk apk = JSON.parseObject(data,Apk.class) ;
            LoginUser currentUser = SecurityUtils.getLoginUser();
            Long userId = currentUser.getUser().getUserId();
            apk.setUserId(userId);
            if(file != null) {
                HashMap<String,String> paths = FileUploadUtils.upload(rootPath,file,0);
                String path = paths.get("pathFileName");
                String absolutePath = paths.get("absolutePath");
                ApkFile apkFile = new ApkFile(new File(absolutePath)) ;
                ApkMeta apkMeta= apkFile.getApkMeta() ; // 获取app元数据信息
                apk.setVersion(apkMeta.getVersionName()); // 获取app的版本号
                apk.setBuild(String.valueOf(apkMeta.getVersionCode())); // 获取app的构建版本号
                apk.setAppName(apkMeta.getLabel());
                apk.setAndroidDownloadUrl(path); // 设置下载的路径
                apk.setApkSize(file.getSize());
            }
            int result = 0 ;
            if(apk.getId() == null ) { // 新规
                apk.setStatus("0");
                apk.setCreateTime(DateUtils.getNowDate());
                result = apkService.insertApk(apk) ;
            }else {
                apk.setAndroidDownloadUrl(null);
                apk.setUpdateTime(DateUtils.getNowDate());
                result = apkService.updateApk(apk) ;
            }
            Console.log(data);
            Console.log(apk);
            return toAjax(result);
        } catch (IOException | InvalidExtensionException e) {
            return toAjax(0);
        }
    }
    /**
     * 修改apk管理
     */
    @PreAuthorize("@ss.hasPermi('update:apk:edit')")
    @Log(title = "apk管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Apk apk)
    {
        return toAjax(apkService.updateApk(apk));
    }

    /**
     * 删除apk管理
     */
    @PreAuthorize("@ss.hasPermi('update:apk:remove')")
    @Log(title = "apk管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(apkService.deleteApkByIds(ids));
    }



}
