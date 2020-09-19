package com.abit.commodity.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.abit.commodity.domain.Commodity;
import com.abit.commodity.service.ICommodityService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品Controller
 * 
 * @author ruoyi
 * @date 2020-09-18
 */
@RestController
@RequestMapping("/commodity/commodity")
public class CommodityController extends BaseController
{
    @Autowired
    private ICommodityService commodityService;

    /**
     * 查询商品列表
     */
    @PreAuthorize("@ss.hasPermi('commodity:commodity:list')")
    @GetMapping("/list")
    public TableDataInfo list(Commodity commodity)
    {
        startPage();
        List<Commodity> list = commodityService.selectCommodityList(commodity);
        return getDataTable(list);
    }

    /**
     * 导出商品列表
     */
    @PreAuthorize("@ss.hasPermi('commodity:commodity:export')")
    @Log(title = "商品", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Commodity commodity)
    {
        List<Commodity> list = commodityService.selectCommodityList(commodity);
        ExcelUtil<Commodity> util = new ExcelUtil<Commodity>(Commodity.class);
        return util.exportExcel(list, "commodity");
    }

    /**
     * 获取商品详细信息
     */
    @PreAuthorize("@ss.hasPermi('commodity:commodity:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(commodityService.selectCommodityById(id));
    }

    /**
     * 新增商品
     */
    @PreAuthorize("@ss.hasPermi('commodity:commodity:add')")
    @Log(title = "商品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Commodity commodity)
    {
        commodity.setStatus(0);
        return toAjax(commodityService.insertCommodity(commodity));
    }

    /**
     * 修改商品
     */
    @PreAuthorize("@ss.hasPermi('commodity:commodity:edit')")
    @Log(title = "商品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Commodity commodity)
    {
        return toAjax(commodityService.updateCommodity(commodity));
    }

    /**
     * 删除商品
     */
    @PreAuthorize("@ss.hasPermi('commodity:commodity:remove')")
    @Log(title = "商品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(commodityService.deleteCommodityByIds(ids));
    }
}
