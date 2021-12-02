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
import com.ruoyi.system.domain.vitRoles;
import com.ruoyi.system.service.IvitRolesService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * vitRolesController
 * 
 * @author ruoyi
 * @date 2021-12-02
 */
@Controller
@RequestMapping("/system/vitRoles")
public class vitRolesController extends BaseController
{
    private String prefix = "system/vitRoles";

    @Autowired
    private IvitRolesService vitRolesService;

    @RequiresPermissions("system:vitRoles:view")
    @GetMapping()
    public String vitRoles()
    {
        return prefix + "/vitRoles";
    }

    /**
     * 查询vitRoles列表
     */
    @RequiresPermissions("system:vitRoles:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(vitRoles vitRoles)
    {
        startPage();
        List<vitRoles> list = vitRolesService.selectvitRolesList(vitRoles);
        return getDataTable(list);
    }

    /**
     * 导出vitRoles列表
     */
    @RequiresPermissions("system:vitRoles:export")
    @Log(title = "vitRoles", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(vitRoles vitRoles)
    {
        List<vitRoles> list = vitRolesService.selectvitRolesList(vitRoles);
        ExcelUtil<vitRoles> util = new ExcelUtil<vitRoles>(vitRoles.class);
        return util.exportExcel(list, "vitRoles");
    }

    /**
     * 新增vitRoles
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存vitRoles
     */
    @RequiresPermissions("system:vitRoles:add")
    @Log(title = "vitRoles", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(vitRoles vitRoles)
    {
        return toAjax(vitRolesService.insertvitRoles(vitRoles));
    }

    /**
     * 修改vitRoles
     */
    @GetMapping("/edit/{roleId}")
    public String edit(@PathVariable("roleId") Long roleId, ModelMap mmap)
    {
        vitRoles vitRoles = vitRolesService.selectvitRolesById(roleId);
        mmap.put("vitRoles", vitRoles);
        return prefix + "/edit";
    }

    /**
     * 修改保存vitRoles
     */
    @RequiresPermissions("system:vitRoles:edit")
    @Log(title = "vitRoles", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(vitRoles vitRoles)
    {
        return toAjax(vitRolesService.updatevitRoles(vitRoles));
    }

    /**
     * 删除vitRoles
     */
    @RequiresPermissions("system:vitRoles:remove")
    @Log(title = "vitRoles", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vitRolesService.deletevitRolesByIds(ids));
    }
}
