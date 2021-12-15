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
import com.ruoyi.system.domain.vitMeasureType;
import com.ruoyi.system.service.IvitMeasureTypeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * vitMeasureTypeController
 * 
 * @author ruoyi
 * @date 2021-12-14
 */
@Controller
@RequestMapping("/system/vitMeasureType")
public class vitMeasureTypeController extends BaseController
{
    private String prefix = "system/vitMeasureType";

    @Autowired
    private IvitMeasureTypeService vitMeasureTypeService;

    @RequiresPermissions("system:vitMeasureType:view")
    @GetMapping()
    public String vitMeasureType()
    {
        return prefix + "/vitMeasureType";
    }

    /**
     * 查询vitMeasureType列表
     */
    @RequiresPermissions("system:vitMeasureType:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(vitMeasureType vitMeasureType)
    {
        startPage();
        List<vitMeasureType> list = vitMeasureTypeService.selectvitMeasureTypeList(vitMeasureType);
        return getDataTable(list);
    }

    /**
     * 导出vitMeasureType列表
     */
    @RequiresPermissions("system:vitMeasureType:export")
    @Log(title = "vitMeasureType", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(vitMeasureType vitMeasureType)
    {
        List<vitMeasureType> list = vitMeasureTypeService.selectvitMeasureTypeList(vitMeasureType);
        ExcelUtil<vitMeasureType> util = new ExcelUtil<vitMeasureType>(vitMeasureType.class);
        return util.exportExcel(list, "vitMeasureType");
    }

    /**
     * 新增vitMeasureType
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存vitMeasureType
     */
    @RequiresPermissions("system:vitMeasureType:add")
    @Log(title = "vitMeasureType", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(vitMeasureType vitMeasureType)
    {
        return toAjax(vitMeasureTypeService.insertvitMeasureType(vitMeasureType));
    }

    /**
     * 修改vitMeasureType
     */
    @GetMapping("/edit/{measureTypeId}")
    public String edit(@PathVariable("measureTypeId") Long measureTypeId, ModelMap mmap)
    {
        vitMeasureType vitMeasureType = vitMeasureTypeService.selectvitMeasureTypeById(measureTypeId);
        mmap.put("vitMeasureType", vitMeasureType);
        return prefix + "/edit";
    }

    /**
     * 修改保存vitMeasureType
     */
    @RequiresPermissions("system:vitMeasureType:edit")
    @Log(title = "vitMeasureType", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(vitMeasureType vitMeasureType)
    {
        return toAjax(vitMeasureTypeService.updatevitMeasureType(vitMeasureType));
    }

    /**
     * 删除vitMeasureType
     */
    @RequiresPermissions("system:vitMeasureType:remove")
    @Log(title = "vitMeasureType", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vitMeasureTypeService.deletevitMeasureTypeByIds(ids));
    }
}
