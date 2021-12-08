package com.ruoyi.web.controller;

import java.util.List;

import com.ruoyi.system.domain.vitCompetence;
import com.ruoyi.system.domain.vitRoles;
import com.ruoyi.system.service.IvitCompetenceService;
import com.ruoyi.system.service.IvitRolesService;
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
import com.ruoyi.system.domain.vitRolesHasCompetenceTarget;
import com.ruoyi.system.service.IvitRolesHasCompetenceTargetService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * vitRolesHasCompetenceTargetController
 * 
 * @author ruoyi
 * @date 2021-12-07
 */
@Controller
@RequestMapping("/system/vitRolesHasCompetenceTarget")
public class vitRolesHasCompetenceTargetController extends BaseController
{
    private String prefix = "system/vitRolesHasCompetenceTarget";

    @Autowired
    private IvitRolesHasCompetenceTargetService vitRolesHasCompetenceTargetService;

    @Autowired
    private IvitRolesService vitRolesService;

    @Autowired
    private IvitCompetenceService vitCompetenceService;

    @RequiresPermissions("system:vitRolesHasCompetenceTarget:view")
    @GetMapping()
    public String vitRolesHasCompetenceTarget()
    {
        return prefix + "/vitRolesHasCompetenceTarget";
    }

    /**
     * 查询vitRolesHasCompetenceTarget列表
     */
    @RequiresPermissions("system:vitRolesHasCompetenceTarget:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget)
    {
        startPage();
        List<vitRolesHasCompetenceTarget> list = vitRolesHasCompetenceTargetService.selectvitRolesHasCompetenceTargetList(vitRolesHasCompetenceTarget);
        return getDataTable(list);
    }

    /**
     * 导出vitRolesHasCompetenceTarget列表
     */
    @RequiresPermissions("system:vitRolesHasCompetenceTarget:export")
    @Log(title = "vitRolesHasCompetenceTarget", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget)
    {
        List<vitRolesHasCompetenceTarget> list = vitRolesHasCompetenceTargetService.selectvitRolesHasCompetenceTargetList(vitRolesHasCompetenceTarget);
        ExcelUtil<vitRolesHasCompetenceTarget> util = new ExcelUtil<vitRolesHasCompetenceTarget>(vitRolesHasCompetenceTarget.class);
        return util.exportExcel(list, "vitRolesHasCompetenceTarget");
    }

    /**
     * 新增vitRolesHasCompetenceTarget
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        List<vitRoles> vitRolesList = vitRolesService.selectVitRolesAll();
        List<vitCompetence> vitCompetenceList = vitCompetenceService.selectvitCompetenceAll();
        mmap.put("vitRoles", vitRolesList);
        mmap.put("vitCompetences", vitCompetenceList);
        return prefix + "/add";
    }

    /**
     * 新增保存vitRolesHasCompetenceTarget
     */
    @RequiresPermissions("system:vitRolesHasCompetenceTarget:add")
    @Log(title = "vitRolesHasCompetenceTarget", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget)
    {
        return toAjax(vitRolesHasCompetenceTargetService.insertvitRolesHasCompetenceTarget(vitRolesHasCompetenceTarget));
    }

    /**
     * 修改vitRolesHasCompetenceTarget
     */
    @GetMapping("/edit/{rolesHasCompetenceTargetId}")
    public String edit(@PathVariable("rolesHasCompetenceTargetId") Long rolesHasCompetenceTargetId, ModelMap mmap)
    {
        vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget = vitRolesHasCompetenceTargetService.selectvitRolesHasCompetenceTargetById(rolesHasCompetenceTargetId);
        mmap.put("vitRolesHasCompetenceTarget", vitRolesHasCompetenceTarget);
        List<vitRoles> vitRolesList = vitRolesService.selectVitRolesAll();
        List<vitCompetence> vitCompetenceList = vitCompetenceService.selectvitCompetenceAll();
        mmap.put("vitRoles", vitRolesList);
        mmap.put("vitCompetences", vitCompetenceList);
        return prefix + "/edit";
    }

    /**
     * 修改保存vitRolesHasCompetenceTarget
     */
    @RequiresPermissions("system:vitRolesHasCompetenceTarget:edit")
    @Log(title = "vitRolesHasCompetenceTarget", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget)
    {
        return toAjax(vitRolesHasCompetenceTargetService.updatevitRolesHasCompetenceTarget(vitRolesHasCompetenceTarget));
    }

    /**
     * 删除vitRolesHasCompetenceTarget
     */
    @RequiresPermissions("system:vitRolesHasCompetenceTarget:remove")
    @Log(title = "vitRolesHasCompetenceTarget", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vitRolesHasCompetenceTargetService.deletevitRolesHasCompetenceTargetByIds(ids));
    }
}
