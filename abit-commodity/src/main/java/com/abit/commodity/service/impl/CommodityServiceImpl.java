package com.abit.commodity.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abit.commodity.mapper.CommodityMapper;
import com.abit.commodity.domain.Commodity;
import com.abit.commodity.service.ICommodityService;

/**
 * 商品Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-18
 */
@Service
public class CommodityServiceImpl implements ICommodityService 
{
    @Autowired
    private CommodityMapper commodityMapper;

    /**
     * 查询商品
     * 
     * @param id 商品ID
     * @return 商品
     */
    @Override
    public Commodity selectCommodityById(Long id)
    {
        return commodityMapper.selectCommodityById(id);
    }

    /**
     * 查询商品列表
     * 
     * @param commodity 商品
     * @return 商品
     */
    @Override
    public List<Commodity> selectCommodityList(Commodity commodity)
    {
        return commodityMapper.selectCommodityList(commodity);
    }

    /**
     * 新增商品
     * 
     * @param commodity 商品
     * @return 结果
     */
    @Override
    public int insertCommodity(Commodity commodity)
    {
        commodity.setCreateTime(DateUtils.getNowDate());
        return commodityMapper.insertCommodity(commodity);
    }

    /**
     * 修改商品
     * 
     * @param commodity 商品
     * @return 结果
     */
    @Override
    public int updateCommodity(Commodity commodity)
    {
        return commodityMapper.updateCommodity(commodity);
    }

    /**
     * 批量删除商品
     * 
     * @param ids 需要删除的商品ID
     * @return 结果
     */
    @Override
    public int deleteCommodityByIds(Long[] ids)
    {
        return commodityMapper.deleteCommodityByIds(ids);
    }

    /**
     * 删除商品信息
     * 
     * @param id 商品ID
     * @return 结果
     */
    @Override
    public int deleteCommodityById(Long id)
    {
        return commodityMapper.deleteCommodityById(id);
    }
}
