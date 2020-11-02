package com.abit.update.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ApkInfo implements Serializable {
    //0代表请求成功，非0代表失败
    private int Code ;

    //请求出错的信息
    private String Msg ;

    //0代表不更新，1代表有版本更新，不需要强制升级，2代表有版本更新，需要强制升级
    private int UpdateStatus ;

    // 3
    private int VersionCode ;

    // 1.0.2
    private String VersionName ;

    // 更新内容
    private String ModifyContent ;

    // 下载地址
    private String DownloadUrl ;

    // 包大小
    private int ApkSize ;

    //md5值没有的话
    private String ApkMd5 ;

    public ApkInfo() {

    }

    public ApkInfo(int code, String msg, int updateStatus, int versionCode, String versionName, String modifyContent, String downloadUrl, int apkSize, String apkMd5) {
        Code = code;
        Msg = msg;
        UpdateStatus = updateStatus;
        VersionCode = versionCode;
        VersionName = versionName;
        ModifyContent = modifyContent;
        DownloadUrl = downloadUrl;
        ApkSize = apkSize;
        ApkMd5 = apkMd5;
    }

    @JsonProperty("Code")
    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    @JsonProperty("Msg")
    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    @JsonProperty("UpdateStatus")
    public int getUpdateStatus() {
        return UpdateStatus;
    }

    public void setUpdateStatus(int updateStatus) {
        UpdateStatus = updateStatus;
    }

    @JsonProperty("VersionCode")
    public int getVersionCode() {
        return VersionCode;
    }

    public void setVersionCode(int versionCode) {
        VersionCode = versionCode;
    }

    @JsonProperty("VersionName")
    public String getVersionName() {
        return VersionName;
    }

    public void setVersionName(String versionName) {
        VersionName = versionName;
    }

    @JsonProperty("ModifyContent")
    public String getModifyContent() {
        return ModifyContent;
    }

    public void setModifyContent(String modifyContent) {
        ModifyContent = modifyContent;
    }

    @JsonProperty("DownloadUrl")
    public String getDownloadUrl() {
        return DownloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        DownloadUrl = downloadUrl;
    }

    @JsonProperty("ApkSize")
    public int getApkSize() {
        return ApkSize;
    }

    public void setApkSize(int apkSize) {
        ApkSize = apkSize;
    }

    @JsonProperty("ApkMd5")
    public String getApkMd5() {
        return ApkMd5;
    }

    public void setApkMd5(String apkMd5) {
        ApkMd5 = apkMd5;
    }
}
