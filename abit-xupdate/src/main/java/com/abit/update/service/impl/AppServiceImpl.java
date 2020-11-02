package com.abit.update.service.impl;

import java.util.List;

import cn.hutool.core.util.IdUtil;
import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.enums.DataScope;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abit.update.mapper.AppMapper;
import com.abit.update.domain.App;
import com.abit.update.service.IAppService;

/**
 * 应用信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-22
 */
@Service
public class AppServiceImpl implements IAppService 
{
    @Autowired
    private AppMapper appMapper;

    /**
     * 查询应用信息
     * 
     * @param id 应用信息ID
     * @return 应用信息
     */
    @Override
    public App selectAppById(Long id)
    {
        return appMapper.selectAppById(id);
    }

    /**
     * 查询应用信息列表
     * 
     * @param app 应用信息
     * @return 应用信息
     */
    @Override
    public List<App> selectAppList(App app)
    {
        LoginUser currentUser = SecurityUtils.getLoginUser();
        Long userId = currentUser.getUser().getUserId();
        List<SysRole> roles = currentUser.getUser().getRoles() ;
        boolean isQueryAll = false ;
        for(SysRole role:roles){
            String roleKey = role.getDataScope();
            if( roleKey.equals(DataScope.ALL.getValue())){ // 判断当前角色是否具有全部数据权限
                isQueryAll =  true ;
            }
        }
        if(!isQueryAll) {
            app.setUserId(userId); // 只能查询自己的app
        }
        return appMapper.selectAppList(app);
    }

    /**
     * 新增应用信息
     * 
     * @param app 应用信息
     * @return 结果
     */
    @Override
    public int insertApp(App app)
    {
        app.setStatus(0); // 设置为不可用状态
        LoginUser currentUser = SecurityUtils.getLoginUser();
        Long userId = currentUser.getUser().getUserId();
        app.setUserId(userId); // 绑定当前的用户
        String appKey = IdUtil.simpleUUID(); // 生成appkey
        app.setAppId(appKey);
        app.setCreateTime(DateUtils.getNowDate());
        app.setUpdateTime(DateUtils.getNowDate());
        return appMapper.insertApp(app);
    }

    /**
     * 修改应用信息
     * 
     * @param app 应用信息
     * @return 结果
     */
    @Override
    public int updateApp(App app)
    {
        app.setUpdateTime(DateUtils.getNowDate());
        return appMapper.updateApp(app);
    }

    /**
     * 批量删除应用信息
     * 
     * @param ids 需要删除的应用信息ID
     * @return 结果
     */
    @Override
    public int deleteAppByIds(Long[] ids)
    {
        return appMapper.deleteAppByIds(ids);
    }

    /**
     * 删除应用信息信息
     * 
     * @param id 应用信息ID
     * @return 结果
     */
    @Override
    public int deleteAppById(Long id)
    {
        return appMapper.deleteAppById(id);
    }
}
