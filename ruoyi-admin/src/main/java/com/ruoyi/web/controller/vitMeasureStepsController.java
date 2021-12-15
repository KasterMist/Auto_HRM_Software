package com.ruoyi.web.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.vitMeasureSteps;
import com.ruoyi.system.service.IvitMeasureStepsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * vitMeasureStepsController
 * 
 * @author ruoyi
 * @date 2021-12-14
 */
@Controller
@RequestMapping("/system/vitMeasureSteps")
public class vitMeasureStepsController extends BaseController
{
    private String prefix = "system/vitMeasureSteps";

    @Autowired
    private IvitMeasureStepsService vitMeasureStepsService;

    @RequiresPermissions("system:vitMeasureSteps:view")
    @GetMapping()
    public String vitMeasureSteps()
    {
        return prefix + "/vitMeasureSteps";
    }

    /**
     * 查询vitMeasureSteps列表
     */
    @RequiresPermissions("system:vitMeasureSteps:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(vitMeasureSteps vitMeasureSteps)
    {
        startPage();
        List<vitMeasureSteps> list = vitMeasureStepsService.selectvitMeasureStepsList(vitMeasureSteps);
        return getDataTable(list);
    }

    /**
     * 导出vitMeasureSteps列表
     */
    @RequiresPermissions("system:vitMeasureSteps:export")
    @Log(title = "vitMeasureSteps", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(vitMeasureSteps vitMeasureSteps)
    {
        List<vitMeasureSteps> list = vitMeasureStepsService.selectvitMeasureStepsList(vitMeasureSteps);
        ExcelUtil<vitMeasureSteps> util = new ExcelUtil<vitMeasureSteps>(vitMeasureSteps.class);
        return util.exportExcel(list, "vitMeasureSteps");
    }

    /**
     * 新增vitMeasureSteps
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存vitMeasureSteps
     */
    @RequiresPermissions("system:vitMeasureSteps:add")
    @Log(title = "vitMeasureSteps", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(vitMeasureSteps vitMeasureSteps)
    {
        return toAjax(vitMeasureStepsService.insertvitMeasureSteps(vitMeasureSteps));
    }

    /**
     * 修改vitMeasureSteps
     */
    @GetMapping("/edit/{measureId}")
    public String edit(@PathVariable("measureId") Long measureId, ModelMap mmap)
    {
        vitMeasureSteps vitMeasureSteps = vitMeasureStepsService.selectvitMeasureStepsById(measureId);
        mmap.put("vitMeasureSteps", vitMeasureSteps);
        return prefix + "/edit";
    }

    /**
     * 修改保存vitMeasureSteps
     */
    @RequiresPermissions("system:vitMeasureSteps:edit")
    @Log(title = "vitMeasureSteps", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(vitMeasureSteps vitMeasureSteps)
    {
        return toAjax(vitMeasureStepsService.updatevitMeasureSteps(vitMeasureSteps));
    }

    /**
     * 删除vitMeasureSteps
     */
    @RequiresPermissions("system:vitMeasureSteps:remove")
    @Log(title = "vitMeasureSteps", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vitMeasureStepsService.deletevitMeasureStepsByIds(ids));
    }
}
