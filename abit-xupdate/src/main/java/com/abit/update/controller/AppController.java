package com.abit.update.controller;

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
import com.abit.update.domain.App;
import com.abit.update.service.IAppService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 应用信息Controller
 * 
 * @author ruoyi
 * @date 2020-09-22
 */
@RestController
@RequestMapping("/update/application")
public class AppController extends BaseController
{
    @Autowired
    private IAppService appService;

    /**
     * 查询应用信息列表
     */
    @PreAuthorize("@ss.hasPermi('update:application:list')")
    @GetMapping("/list")
    public TableDataInfo list(App app)
    {
        startPage();
        List<App> list = appService.selectAppList(app);
        return getDataTable(list);
    }

    /**
     * 导出应用信息列表
     */
    @PreAuthorize("@ss.hasPermi('update:application:export')")
    @Log(title = "应用信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(App app)
    {
        List<App> list = appService.selectAppList(app);
        ExcelUtil<App> util = new ExcelUtil<App>(App.class);
        return util.exportExcel(list, "application");
    }

    /**
     * 获取应用信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('update:application:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(appService.selectAppById(id));
    }

    /**
     * 新增应用信息
     */
    @PreAuthorize("@ss.hasPermi('update:application:add')")
    @Log(title = "应用信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody App app)
    {
        return toAjax(appService.insertApp(app));
    }

    /**
     * 修改应用信息
     */
    @PreAuthorize("@ss.hasPermi('update:application:edit')")
    @Log(title = "应用信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody App app)
    {
        return toAjax(appService.updateApp(app));
    }

    /**
     * 删除应用信息
     */
    @PreAuthorize("@ss.hasPermi('update:application:remove')")
    @Log(title = "应用信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(appService.deleteAppByIds(ids));
    }
}
