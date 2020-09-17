package com.abit.commodity.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abit.commodity.mapper.AbitCategoryMapper;
import com.abit.commodity.domain.AbitCategory;
import com.abit.commodity.service.IAbitCategoryService;

/**
 * 商品分类Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-17
 */
@Service
public class AbitCategoryServiceImpl implements IAbitCategoryService 
{
    @Autowired
    private AbitCategoryMapper abitCategoryMapper;

    /**
     * 查询商品分类
     * 
     * @param id 商品分类ID
     * @return 商品分类
     */
    @Override
    public AbitCategory selectAbitCategoryById(Long id)
    {
        return abitCategoryMapper.selectAbitCategoryById(id);
    }

    /**
     * 查询商品分类列表
     * 
     * @param abitCategory 商品分类
     * @return 商品分类
     */
    @Override
    public List<AbitCategory> selectAbitCategoryList(AbitCategory abitCategory)
    {
        return abitCategoryMapper.selectAbitCategoryList(abitCategory);
    }

    /**
     * 新增商品分类
     * 
     * @param abitCategory 商品分类
     * @return 结果
     */
    @Override
    public int insertAbitCategory(AbitCategory abitCategory)
    {
        abitCategory.setCreateTime(DateUtils.getNowDate());
        return abitCategoryMapper.insertAbitCategory(abitCategory);
    }

    /**
     * 修改商品分类
     * 
     * @param abitCategory 商品分类
     * @return 结果
     */
    @Override
    public int updateAbitCategory(AbitCategory abitCategory)
    {
        return abitCategoryMapper.updateAbitCategory(abitCategory);
    }

    /**
     * 批量删除商品分类
     * 
     * @param ids 需要删除的商品分类ID
     * @return 结果
     */
    @Override
    public int deleteAbitCategoryByIds(Long[] ids)
    {
        return abitCategoryMapper.deleteAbitCategoryByIds(ids);
    }

    /**
     * 删除商品分类信息
     * 
     * @param id 商品分类ID
     * @return 结果
     */
    @Override
    public int deleteAbitCategoryById(Long id)
    {
        return abitCategoryMapper.deleteAbitCategoryById(id);
    }
}
