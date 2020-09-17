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
import com.abit.commodity.domain.AbitCategory;
import com.abit.commodity.service.IAbitCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品分类Controller
 * 
 * @author ruoyi
 * @date 2020-09-17
 */
@RestController
@RequestMapping("/commodity/category")
public class AbitCategoryController extends BaseController
{
    @Autowired
    private IAbitCategoryService abitCategoryService;

    /**
     * 查询商品分类列表
     */
    @PreAuthorize("@ss.hasPermi('commodity:category:list')")
    @GetMapping("/list")
    public TableDataInfo list(AbitCategory abitCategory)
    {
        startPage();
        List<AbitCategory> list = abitCategoryService.selectAbitCategoryList(abitCategory);
        return getDataTable(list);
    }

    /**
     * 导出商品分类列表
     */
    @PreAuthorize("@ss.hasPermi('commodity:category:export')")
    @Log(title = "商品分类", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(AbitCategory abitCategory)
    {
        List<AbitCategory> list = abitCategoryService.selectAbitCategoryList(abitCategory);
        ExcelUtil<AbitCategory> util = new ExcelUtil<AbitCategory>(AbitCategory.class);
        return util.exportExcel(list, "category");
    }

    /**
     * 获取商品分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('commodity:category:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(abitCategoryService.selectAbitCategoryById(id));
    }

    /**
     * 新增商品分类
     */
    @PreAuthorize("@ss.hasPermi('commodity:category:add')")
    @Log(title = "商品分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AbitCategory abitCategory)
    {
        return toAjax(abitCategoryService.insertAbitCategory(abitCategory));
    }

    /**
     * 修改商品分类
     */
    @PreAuthorize("@ss.hasPermi('commodity:category:edit')")
    @Log(title = "商品分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AbitCategory abitCategory)
    {
        return toAjax(abitCategoryService.updateAbitCategory(abitCategory));
    }

    /**
     * 删除商品分类
     */
    @PreAuthorize("@ss.hasPermi('commodity:category:remove')")
    @Log(title = "商品分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(abitCategoryService.deleteAbitCategoryByIds(ids));
    }
}
