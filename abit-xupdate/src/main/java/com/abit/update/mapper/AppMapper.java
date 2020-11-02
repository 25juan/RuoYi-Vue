package com.abit.update.mapper;

import java.util.List;
import com.abit.update.domain.App;

/**
 * 应用信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-22
 */
public interface AppMapper 
{
    /**
     * 查询应用信息
     * 
     * @param id 应用信息ID
     * @return 应用信息
     */
    public App selectAppById(Long id);

    /**
     * 查询应用信息列表
     * 
     * @param app 应用信息
     * @return 应用信息集合
     */
    public List<App> selectAppList(App app);

    /**
     * 新增应用信息
     * 
     * @param app 应用信息
     * @return 结果
     */
    public int insertApp(App app);

    /**
     * 修改应用信息
     * 
     * @param app 应用信息
     * @return 结果
     */
    public int updateApp(App app);

    /**
     * 删除应用信息
     * 
     * @param id 应用信息ID
     * @return 结果
     */
    public int deleteAppById(Long id);

    /**
     * 批量删除应用信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAppByIds(Long[] ids);
}
