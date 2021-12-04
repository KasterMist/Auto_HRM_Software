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
import com.ruoyi.system.domain.vitStaff;
import com.ruoyi.system.service.IvitStaffService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * vitStaffController
 * 
 * @author ruoyi
 * @date 2021-12-04
 */
@Controller
@RequestMapping("/system/vitStaff")
public class vitStaffController extends BaseController
{
    private String prefix = "system/vitStaff";

    @Autowired
    private IvitStaffService vitStaffService;

    @RequiresPermissions("system:vitStaff:view")
    @GetMapping()
    public String vitStaff()
    {
        return prefix + "/vitStaff";
    }

    /**
     * 查询vitStaff列表
     */
    @RequiresPermissions("system:vitStaff:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(vitStaff vitStaff)
    {
        startPage();
        List<vitStaff> list = vitStaffService.selectvitStaffList(vitStaff);
        return getDataTable(list);
    }

    /**
     * 导出vitStaff列表
     */
    @RequiresPermissions("system:vitStaff:export")
    @Log(title = "vitStaff", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(vitStaff vitStaff)
    {
        List<vitStaff> list = vitStaffService.selectvitStaffList(vitStaff);
        ExcelUtil<vitStaff> util = new ExcelUtil<vitStaff>(vitStaff.class);
        return util.exportExcel(list, "vitStaff");
    }

    /**
     * 新增vitStaff
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存vitStaff
     */
    @RequiresPermissions("system:vitStaff:add")
    @Log(title = "vitStaff", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(vitStaff vitStaff)
    {
        return toAjax(vitStaffService.insertvitStaff(vitStaff));
    }

    /**
     * 修改vitStaff
     */
    @GetMapping("/edit/{staffId}")
    public String edit(@PathVariable("staffId") Long staffId, ModelMap mmap)
    {
        vitStaff vitStaff = vitStaffService.selectvitStaffById(staffId);
        mmap.put("vitStaff", vitStaff);
        return prefix + "/edit";
    }

    /**
     * 修改保存vitStaff
     */
    @RequiresPermissions("system:vitStaff:edit")
    @Log(title = "vitStaff", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(vitStaff vitStaff)
    {
        return toAjax(vitStaffService.updatevitStaff(vitStaff));
    }

    /**
     * 删除vitStaff
     */
    @RequiresPermissions("system:vitStaff:remove")
    @Log(title = "vitStaff", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vitStaffService.deletevitStaffByIds(ids));
    }
}
