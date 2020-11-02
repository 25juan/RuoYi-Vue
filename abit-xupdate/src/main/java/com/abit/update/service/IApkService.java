package com.abit.update.service;

import java.util.List;
import com.abit.update.domain.Apk;
import com.abit.update.domain.ApkInfo;

/**
 * apk管理Service接口
 * 
 * @author ruoyi
 * @date 2020-09-24
 */
public interface IApkService 
{
    /**
     * 查询apk管理
     * 
     * @param id apk管理ID
     * @return apk管理
     */
    public Apk selectApkById(Long id);


    /**
     * 查询apk 根据appid 选出当前最新的包
     *
     * @param id apk管理ID
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
     * 批量删除apk管理
     * 
     * @param ids 需要删除的apk管理ID
     * @return 结果
     */
    public int deleteApkByIds(Long[] ids);

    /**
     * 删除apk管理信息
     * 
     * @param id apk管理ID
     * @return 结果
     */
    public int deleteApkById(Long id);
}
