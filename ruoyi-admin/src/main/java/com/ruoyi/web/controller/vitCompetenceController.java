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
import com.ruoyi.system.domain.vitCompetence;
import com.ruoyi.system.service.IvitCompetenceService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.core.domain.Ztree;

/**
 * vitCompetenceController
 * 
 * @author ruoyi
 * @date 2021-12-08
 */
@Controller
@RequestMapping("/system/vitCompetence")
public class vitCompetenceController extends BaseController
{
    private String prefix = "system/vitCompetence";

    @Autowired
    private IvitCompetenceService vitCompetenceService;

    @RequiresPermissions("system:vitCompetence:view")
    @GetMapping()
    public String vitCompetence()
    {
        return prefix + "/vitCompetence";
    }

    /**
     * 查询vitCompetence树列表
     */
    @RequiresPermissions("system:vitCompetence:list")
    @PostMapping("/list")
    @ResponseBody
    public List<vitCompetence> list(vitCompetence vitCompetence)
    {
        List<vitCompetence> list = vitCompetenceService.selectvitCompetenceList(vitCompetence);
        return list;
    }

    /**
     * 导出vitCompetence列表
     */
    @RequiresPermissions("system:vitCompetence:export")
    @Log(title = "vitCompetence", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(vitCompetence vitCompetence)
    {
        List<vitCompetence> list = vitCompetenceService.selectvitCompetenceList(vitCompetence);
        ExcelUtil<vitCompetence> util = new ExcelUtil<vitCompetence>(vitCompetence.class);
        return util.exportExcel(list, "vitCompetence");
    }

    /**
     * 新增vitCompetence
     */
    @GetMapping(value = { "/add/{competenceId}", "/add/" })
    public String add(@PathVariable(value = "competenceId", required = false) Long competenceId, ModelMap mmap)
    {
        if (StringUtils.isNotNull(competenceId))
        {
            mmap.put("vitCompetence", vitCompetenceService.selectvitCompetenceById(competenceId));
        }
        return prefix + "/add";
    }

    /**
     * 新增保存vitCompetence
     */
    @RequiresPermissions("system:vitCompetence:add")
    @Log(title = "vitCompetence", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(vitCompetence vitCompetence)
    {
        return toAjax(vitCompetenceService.insertvitCompetence(vitCompetence));
    }

    /**
     * 修改vitCompetence
     */
    @GetMapping("/edit/{competenceId}")
    public String edit(@PathVariable("competenceId") Long competenceId, ModelMap mmap)
    {
        vitCompetence vitCompetence = vitCompetenceService.selectvitCompetenceById(competenceId);
        mmap.put("vitCompetence", vitCompetence);
        return prefix + "/edit";
    }

    /**
     * 修改保存vitCompetence
     */
    @RequiresPermissions("system:vitCompetence:edit")
    @Log(title = "vitCompetence", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(vitCompetence vitCompetence)
    {
        return toAjax(vitCompetenceService.updatevitCompetence(vitCompetence));
    }

    /**
     * 删除
     */
    @RequiresPermissions("system:vitCompetence:remove")
    @Log(title = "vitCompetence", businessType = BusinessType.DELETE)
    @GetMapping("/remove/{competenceId}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("competenceId") Long competenceId)
    {
        return toAjax(vitCompetenceService.deletevitCompetenceById(competenceId));
    }

    /**
     * 选择vitCompetence树
     */
    @GetMapping(value = { "/selectVitCompetenceTree/{competenceId}", "/selectVitCompetenceTree/" })
    public String selectVitCompetenceTree(@PathVariable(value = "competenceId", required = false) Long competenceId, ModelMap mmap)
    {
        if (StringUtils.isNotNull(competenceId))
        {
            mmap.put("vitCompetence", vitCompetenceService.selectvitCompetenceById(competenceId));
        }
        return prefix + "/tree";
    }

    /**
     * 加载vitCompetence树列表
     */
    @GetMapping("/treeData")
    @ResponseBody
    public List<Ztree> treeData()
    {
        List<Ztree> ztrees = vitCompetenceService.selectvitCompetenceTree();
        return ztrees;
    }
}
