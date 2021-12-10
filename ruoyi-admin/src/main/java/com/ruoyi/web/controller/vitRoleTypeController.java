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
import com.ruoyi.system.domain.vitRoleType;
import com.ruoyi.system.service.IvitRoleTypeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * vitRoleTypeController
 * 
 * @author ruoyi
 * @date 2021-12-10
 */
@Controller
@RequestMapping("/system/vitRoleType")
public class vitRoleTypeController extends BaseController
{
    private String prefix = "system/vitRoleType";

    @Autowired
    private IvitRoleTypeService vitRoleTypeService;

    @RequiresPermissions("system:vitRoleType:view")
    @GetMapping()
    public String vitRoleType()
    {
        return prefix + "/vitRoleType";
    }

    /**
     * 查询vitRoleType列表
     */
    @RequiresPermissions("system:vitRoleType:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(vitRoleType vitRoleType)
    {
        startPage();
        List<vitRoleType> list = vitRoleTypeService.selectvitRoleTypeList(vitRoleType);
        return getDataTable(list);
    }

    /**
     * 导出vitRoleType列表
     */
    @RequiresPermissions("system:vitRoleType:export")
    @Log(title = "vitRoleType", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(vitRoleType vitRoleType)
    {
        List<vitRoleType> list = vitRoleTypeService.selectvitRoleTypeList(vitRoleType);
        ExcelUtil<vitRoleType> util = new ExcelUtil<vitRoleType>(vitRoleType.class);
        return util.exportExcel(list, "vitRoleType");
    }

    /**
     * 新增vitRoleType
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存vitRoleType
     */
    @RequiresPermissions("system:vitRoleType:add")
    @Log(title = "vitRoleType", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(vitRoleType vitRoleType)
    {
        return toAjax(vitRoleTypeService.insertvitRoleType(vitRoleType));
    }

    /**
     * 修改vitRoleType
     */
    @GetMapping("/edit/{roleTypeCode}")
    public String edit(@PathVariable("roleTypeCode") Long roleTypeCode, ModelMap mmap)
    {
        vitRoleType vitRoleType = vitRoleTypeService.selectvitRoleTypeById(roleTypeCode);
        mmap.put("vitRoleType", vitRoleType);
        return prefix + "/edit";
    }

    /**
     * 修改保存vitRoleType
     */
    @RequiresPermissions("system:vitRoleType:edit")
    @Log(title = "vitRoleType", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(vitRoleType vitRoleType)
    {
        return toAjax(vitRoleTypeService.updatevitRoleType(vitRoleType));
    }

    /**
     * 删除vitRoleType
     */
    @RequiresPermissions("system:vitRoleType:remove")
    @Log(title = "vitRoleType", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vitRoleTypeService.deletevitRoleTypeByIds(ids));
    }
}
