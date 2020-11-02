package com.abit.update.service.impl;

import java.util.List;

import com.abit.update.domain.ApkInfo;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abit.update.mapper.ApkMapper;
import com.abit.update.domain.Apk;
import com.abit.update.service.IApkService;

/**
 * apk管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-24
 */
@Service
public class ApkServiceImpl implements IApkService 
{
    @Autowired
    private ApkMapper apkMapper;

    /**
     * 查询apk管理
     * 
     * @param id apk管理ID
     * @return apk管理
     */
    @Override
    public Apk selectApkById(Long id)
    {
        return apkMapper.selectApkById(id);
    }

    @Override
    public ApkInfo selectApkByAppKey(String appKey)
    {
        return apkMapper.selectApkByAppKey(appKey);
    }

    /**
     * 查询apk管理列表
     * 
     * @param apk apk管理
     * @return apk管理
     */
    @Override
    public List<Apk> selectApkList(Apk apk)
    {
        return apkMapper.selectApkList(apk);
    }

    /**
     * 新增apk管理
     * 
     * @param apk apk管理
     * @return 结果
     */
    @Override
    public int insertApk(Apk apk)
    {
        return apkMapper.insertApk(apk);
    }

    /**
     * 修改apk管理
     * 
     * @param apk apk管理
     * @return 结果
     */
    @Override
    public int updateApk(Apk apk)
    {
        return apkMapper.updateApk(apk);
    }

    /**
     * 批量删除apk管理
     * 
     * @param ids 需要删除的apk管理ID
     * @return 结果
     */
    @Override
    public int deleteApkByIds(Long[] ids)
    {
        return apkMapper.deleteApkByIds(ids);
    }

    /**
     * 删除apk管理信息
     * 
     * @param id apk管理ID
     * @return 结果
     */
    @Override
    public int deleteApkById(Long id)
    {
        return apkMapper.deleteApkById(id);
    }
}
