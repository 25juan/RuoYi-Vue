package com.abit.update.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * apk管理对象 abit_apk
 * 
 * @author ruoyi
 * @date 2020-09-24
 */
public class Apk extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "ID")
    private Long id;

    /** Key */
    @Excel(name = "Key")
    private Long appId;

    /** 下载地址 */
    @Excel(name = "下载地址")
    private String androidDownloadUrl;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 版本 */
    @Excel(name = "版本")
    private String version;

    /** 构建版本 */
    @Excel(name = "构建版本")
    private String build;

    /** 更新描述 */
    @Excel(name = "更新描述")
    private String description;

    /** 下载地址 */
    @Excel(name = "下载地址")
    private String iosDownUrl;

    /** 更新者 */
    @Excel(name = "更新者")
    private Long userId;

    /** app名称 */
    @Excel(name = "更新者")
    private String appName ;

    /** 更新机制 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新机制", width = 30, dateFormat = "yyyy-MM-dd")
    private String updateStatus;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getApkSize() {
        return apkSize;
    }

    public void setApkSize(Long apkSize) {
        this.apkSize = apkSize;
    }

    private Long apkSize ;


    /** 下载次数 */
    @Excel(name = "下载次数")
    private Long downloadCount;

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppName() {
        return appName;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAppId(Long appId) 
    {
        this.appId = appId;
    }

    public Long getAppId() 
    {
        return appId;
    }
    public void setAndroidDownloadUrl(String androidDownloadUrl) 
    {
        this.androidDownloadUrl = androidDownloadUrl;
    }

    public String getAndroidDownloadUrl() 
    {
        return androidDownloadUrl;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }
    public void setBuild(String build) 
    {
        this.build = build;
    }

    public String getBuild() 
    {
        return build;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setIosDownUrl(String iosDownUrl) 
    {
        this.iosDownUrl = iosDownUrl;
    }

    public String getIosDownUrl() 
    {
        return iosDownUrl;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUpdateStatus(String updateStatus)
    {
        this.updateStatus = updateStatus;
    }

    public String getUpdateStatus()
    {
        return updateStatus;
    }
    public void setDownloadCount(Long downloadCount) 
    {
        this.downloadCount = downloadCount;
    }

    public Long getDownloadCount() 
    {
        return downloadCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("updateTime", getUpdateTime())
            .append("id", getId())
            .append("appId", getAppId())
            .append("androidDownloadUrl", getAndroidDownloadUrl())
            .append("status", getStatus())
            .append("version", getVersion())
            .append("build", getBuild())
            .append("description", getDescription())
            .append("iosDownUrl", getIosDownUrl())
            .append("userId", getUserId())
            .append("updateStatus", getUpdateStatus())
            .append("createTime", getCreateTime())
            .append("downloadCount", getDownloadCount())
            .toString();
    }
}
