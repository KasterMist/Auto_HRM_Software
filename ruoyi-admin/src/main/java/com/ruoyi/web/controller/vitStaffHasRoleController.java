package com.ruoyi.web.controller;

import java.util.List;

import com.ruoyi.system.domain.vitRoles;
import com.ruoyi.system.domain.vitStaff;
import com.ruoyi.system.service.IvitRolesService;
import com.ruoyi.system.service.IvitStaffService;
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
import com.ruoyi.system.domain.vitStaffHasRole;
import com.ruoyi.system.service.IvitStaffHasRoleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * vitStaffHasRoleController
 * 
 * @author ruoyi
 * @date 2021-12-05
 */
@Controller
@RequestMapping("/system/vitStaffHasRole")
public class vitStaffHasRoleController extends BaseController
{
    private String prefix = "system/vitStaffHasRole";

    @Autowired
    private IvitStaffHasRoleService vitStaffHasRoleService;

    @Autowired
    private IvitStaffService vitStaffService;

    @Autowired
    private IvitRolesService vitRolesService;

    @RequiresPermissions("system:vitStaffHasRole:view")
    @GetMapping()
    public String vitStaffHasRole()
    {
        return prefix + "/vitStaffHasRole";
    }

    /**
     * 查询vitStaffHasRole列表
     */
    @RequiresPermissions("system:vitStaffHasRole:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(vitStaffHasRole vitStaffHasRole)
    {
        startPage();
        List<vitStaffHasRole> list = vitStaffHasRoleService.selectvitStaffHasRoleList(vitStaffHasRole);
        return getDataTable(list);
    }

    /**
     * 导出vitStaffHasRole列表
     */
    @RequiresPermissions("system:vitStaffHasRole:export")
    @Log(title = "vitStaffHasRole", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(vitStaffHasRole vitStaffHasRole)
    {
        List<vitStaffHasRole> list = vitStaffHasRoleService.selectvitStaffHasRoleList(vitStaffHasRole);
        ExcelUtil<vitStaffHasRole> util = new ExcelUtil<vitStaffHasRole>(vitStaffHasRole.class);
        return util.exportExcel(list, "vitStaffHasRole");
    }

    /**
     * 新增vitStaffHasRole
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        List<vitStaff> vitStaffList = vitStaffService.getvitStaffListAll();
        List<vitRoles> vitRolesList = vitRolesService.selectVitRolesAll();
        mmap.put("vitStaffs", vitStaffList);
        mmap.put("vitRoles", vitRolesList);
        return prefix + "/add";
    }

    /**
     * 新增保存vitStaffHasRole
     */
    @RequiresPermissions("system:vitStaffHasRole:add")
    @Log(title = "vitStaffHasRole", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(vitStaffHasRole vitStaffHasRole)
    {
        return toAjax(vitStaffHasRoleService.insertvitStaffHasRole(vitStaffHasRole));
    }

    /**
     * 修改vitStaffHasRole
     */
    @GetMapping("/edit/{staffHasRoleId}")
    public String edit(@PathVariable("staffHasRoleId") Long staffHasRoleId, ModelMap mmap)
    {
        vitStaffHasRole vitStaffHasRole = vitStaffHasRoleService.selectvitStaffHasRoleById(staffHasRoleId);
        mmap.put("vitStaffHasRole", vitStaffHasRole);
        List<vitStaff> vitStaffList = vitStaffService.getvitStaffListAll();
        List<vitRoles> vitRolesList = vitRolesService.selectVitRolesAll();
        mmap.put("vitStaffs", vitStaffList);
        mmap.put("vitRoles", vitRolesList);
        return prefix + "/edit";
    }

    /**
     * 修改保存vitStaffHasRole
     */
    @RequiresPermissions("system:vitStaffHasRole:edit")
    @Log(title = "vitStaffHasRole", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(vitStaffHasRole vitStaffHasRole)
    {
        return toAjax(vitStaffHasRoleService.updatevitStaffHasRole(vitStaffHasRole));
    }

    /**
     * 删除vitStaffHasRole
     */
    @RequiresPermissions("system:vitStaffHasRole:remove")
    @Log(title = "vitStaffHasRole", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vitStaffHasRoleService.deletevitStaffHasRoleByIds(ids));
    }
}
