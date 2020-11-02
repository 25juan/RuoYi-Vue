package com.abit.update.mapper;

import java.util.List;
import com.abit.update.domain.Apk;
import com.abit.update.domain.ApkInfo;

/**
 * apk管理Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-24
 */
public interface ApkMapper 
{
    /**
     * 查询apk管理
     * 
     * @param id apk管理ID
     * @return apk管理
     */
    public Apk selectApkById(Long id);
    /**
     * 查询apk管理
     *
     * @param appKey apk管理ID
     * @return apk管理
     */
    public ApkInfo selectApkByAppKey(String appKey);

    /**
     * 查询apk管理列表
     * 
     * @param apk apk管理
     * @return apk管理集合
     */
    public List<Apk> selectApkList(Apk apk);

    /**
     * 新增apk管理
     * 
     * @param apk apk管理
     * @return 结果
     */
    public int insertApk(Apk apk);

    /**
     * 修改apk管理
     * 
     * @param apk apk管理
     * @return 结果
     */
    public int updateApk(Apk apk);

    /**
     * 删除apk管理
     * 
     * @param id apk管理ID
     * @return 结果
     */
    public int deleteApkById(Long id);

    /**
     * 批量删除apk管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteApkByIds(Long[] ids);
}
