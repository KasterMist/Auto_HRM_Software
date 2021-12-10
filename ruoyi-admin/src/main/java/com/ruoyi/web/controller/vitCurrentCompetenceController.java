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
import com.ruoyi.system.domain.vitCurrentCompetence;
import com.ruoyi.system.service.IvitCurrentCompetenceService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * vitCurrentCompetenceController
 * 
 * @author ruoyi
 * @date 2021-12-10
 */
@Controller
@RequestMapping("/system/vitCurrentCompetence")
public class vitCurrentCompetenceController extends BaseController
{
    private String prefix = "system/vitCurrentCompetence";

    @Autowired
    private IvitCurrentCompetenceService vitCurrentCompetenceService;

    @RequiresPermissions("system:vitCurrentCompetence:view")
    @GetMapping()
    public String vitCurrentCompetence()
    {
        return prefix + "/vitCurrentCompetence";
    }

    /**
     * 查询vitCurrentCompetence列表
     */
    @RequiresPermissions("system:vitCurrentCompetence:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(vitCurrentCompetence vitCurrentCompetence)
    {
        startPage();
        List<vitCurrentCompetence> list = vitCurrentCompetenceService.selectvitCurrentCompetenceList(vitCurrentCompetence);
        return getDataTable(list);
    }

    /**
     * 导出vitCurrentCompetence列表
     */
    @RequiresPermissions("system:vitCurrentCompetence:export")
    @Log(title = "vitCurrentCompetence", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(vitCurrentCompetence vitCurrentCompetence)
    {
        List<vitCurrentCompetence> list = vitCurrentCompetenceService.selectvitCurrentCompetenceList(vitCurrentCompetence);
        ExcelUtil<vitCurrentCompetence> util = new ExcelUtil<vitCurrentCompetence>(vitCurrentCompetence.class);
        return util.exportExcel(list, "vitCurrentCompetence");
    }

    /**
     * 新增vitCurrentCompetence
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存vitCurrentCompetence
     */
    @RequiresPermissions("system:vitCurrentCompetence:add")
    @Log(title = "vitCurrentCompetence", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(vitCurrentCompetence vitCurrentCompetence)
    {
        return toAjax(vitCurrentCompetenceService.insertvitCurrentCompetence(vitCurrentCompetence));
    }

    /**
     * 修改vitCurrentCompetence
     */
    @GetMapping("/edit/{currentCompetenceId}")
    public String edit(@PathVariable("currentCompetenceId") Long currentCompetenceId, ModelMap mmap)
    {
        vitCurrentCompetence vitCurrentCompetence = vitCurrentCompetenceService.selectvitCurrentCompetenceById(currentCompetenceId);
        mmap.put("vitCurrentCompetence", vitCurrentCompetence);
        return prefix + "/edit";
    }

    /**
     * 修改保存vitCurrentCompetence
     */
    @RequiresPermissions("system:vitCurrentCompetence:edit")
    @Log(title = "vitCurrentCompetence", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(vitCurrentCompetence vitCurrentCompetence)
    {
        return toAjax(vitCurrentCompetenceService.updatevitCurrentCompetence(vitCurrentCompetence));
    }

    /**
     * 删除vitCurrentCompetence
     */
    @RequiresPermissions("system:vitCurrentCompetence:remove")
    @Log(title = "vitCurrentCompetence", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vitCurrentCompetenceService.deletevitCurrentCompetenceByIds(ids));
    }
}
