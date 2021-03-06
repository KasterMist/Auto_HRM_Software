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
import com.ruoyi.system.domain.VitDepartment;
import com.ruoyi.system.service.IVitDepartmentService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.core.domain.Ztree;

/**
 * VitDepartmentController
 * 
 * @author ruoyi
 * @date 2021-12-13
 */
@Controller
@RequestMapping("/system/VitDepartment")
public class VitDepartmentController extends BaseController
{
    private String prefix = "system/VitDepartment";

    @Autowired
    private IVitDepartmentService vitDepartmentService;

    @RequiresPermissions("system:VitDepartment:view")
    @GetMapping()
    public String VitDepartment()
    {
        return prefix + "/VitDepartment";
    }

    /**
     * 查询VitDepartment树列表
     */
    @RequiresPermissions("system:VitDepartment:list")
    @PostMapping("/list")
    @ResponseBody
    public List<VitDepartment> list(VitDepartment vitDepartment)
    {
        List<VitDepartment> list = vitDepartmentService.selectVitDepartmentList(vitDepartment);
        return list;
    }

    /**
     * 导出VitDepartment列表
     */
    @RequiresPermissions("system:VitDepartment:export")
    @Log(title = "VitDepartment", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(VitDepartment vitDepartment)
    {
        List<VitDepartment> list = vitDepartmentService.selectVitDepartmentList(vitDepartment);
        ExcelUtil<VitDepartment> util = new ExcelUtil<VitDepartment>(VitDepartment.class);
        return util.exportExcel(list, "VitDepartment");
    }

    /**
     * 新增VitDepartment
     */
    @GetMapping(value = { "/add/{departmentId}", "/add/" })
    public String add(@PathVariable(value = "departmentId", required = false) Long departmentId, ModelMap mmap)
    {
        if (StringUtils.isNotNull(departmentId))
        {
            mmap.put("vitDepartment", vitDepartmentService.selectVitDepartmentById(departmentId));
        }
        return prefix + "/add";
    }

    /**
     * 新增保存VitDepartment
     */
    @RequiresPermissions("system:VitDepartment:add")
    @Log(title = "VitDepartment", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(VitDepartment vitDepartment)
    {
        return toAjax(vitDepartmentService.insertVitDepartment(vitDepartment));
    }

    /**
     * 修改VitDepartment
     */
    @GetMapping("/edit/{departmentId}")
    public String edit(@PathVariable("departmentId") Long departmentId, ModelMap mmap)
    {
        VitDepartment vitDepartment = vitDepartmentService.selectVitDepartmentById(departmentId);
        mmap.put("vitDepartment", vitDepartment);
        return prefix + "/edit";
    }

    /**
     * 修改保存VitDepartment
     */
    @RequiresPermissions("system:VitDepartment:edit")
    @Log(title = "VitDepartment", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(VitDepartment vitDepartment)
    {
        return toAjax(vitDepartmentService.updateVitDepartment(vitDepartment));
    }

    /**
     * 删除
     */
    @RequiresPermissions("system:VitDepartment:remove")
    @Log(title = "VitDepartment", businessType = BusinessType.DELETE)
    @GetMapping("/remove/{departmentId}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("departmentId") Long departmentId)
    {
        return toAjax(vitDepartmentService.deleteVitDepartmentById(departmentId));
    }

    /**
     * 选择VitDepartment树
     */
    @GetMapping(value = { "/selectVitDepartmentTree/{departmentId}", "/selectVitDepartmentTree/" })
    public String selectVitDepartmentTree(@PathVariable(value = "departmentId", required = false) Long departmentId, ModelMap mmap)
    {
        if (StringUtils.isNotNull(departmentId))
        {
            mmap.put("vitDepartment", vitDepartmentService.selectVitDepartmentById(departmentId));
        }
        return prefix + "/tree";
    }

    /**
     * 加载VitDepartment树列表
     */
    @GetMapping("/treeData")
    @ResponseBody
    public List<Ztree> treeData()
    {
        List<Ztree> ztrees = vitDepartmentService.selectVitDepartmentTree();
        return ztrees;
    }
}
