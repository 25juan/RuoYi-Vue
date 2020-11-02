package com.abit.update.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 应用信息对象 abit_app
 * 
 * @author ruoyi
 * @date 2020-09-22
 */
public class App extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** key */
    @Excel(name = "key")
    private String appId;

    /** 应用名称 */
    @Excel(name = "应用名称")
    private String appName;

    /** 创建者 */
    @Excel(name = "创建者")
    private Long userId;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 平台 */
    @Excel(name = "平台")
    private Long platform;

    /** 用户昵称 */
    private String nickName ;

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAppId(String appId) 
    {
        this.appId = appId;
    }

    public String getAppId() 
    {
        return appId;
    }
    public void setAppName(String appName) 
    {
        this.appName = appName;
    }

    public String getAppName() 
    {
        return appName;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public Integer getStatus()
    {
        return status;
    }
    public void setPlatform(Long platform) 
    {
        this.platform = platform;
    }

    public Long getPlatform() 
    {
        return platform;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("appId", getAppId())
            .append("appName", getAppName())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("userId", getUserId())
            .append("status", getStatus())
            .append("platform", getPlatform())
            .toString();
    }
}
