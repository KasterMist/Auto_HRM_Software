package com.ruoyi.web.controller;

import java.util.List;

import com.ruoyi.system.domain.vitCompetence;
import com.ruoyi.system.domain.vitMeasureSteps;
import com.ruoyi.system.domain.vitMeasureType;
import com.ruoyi.system.service.IvitCompetenceService;
import com.ruoyi.system.service.IvitMeasureStepsService;
import com.ruoyi.system.service.IvitMeasureTypeService;
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
import com.ruoyi.system.domain.vitMeasuresForCompetences;
import com.ruoyi.system.service.IvitMeasuresForCompetencesService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * vitMeasuresForCompetencesController
 * 
 * @author ruoyi
 * @date 2021-12-15
 */
@Controller
@RequestMapping("/system/vitMeasuresForCompetences")
public class vitMeasuresForCompetencesController extends BaseController
{
    private String prefix = "system/vitMeasuresForCompetences";

    @Autowired
    private IvitMeasuresForCompetencesService vitMeasuresForCompetencesService;

    @Autowired
    private IvitCompetenceService vitCompetenceService;

    @Autowired
    private IvitMeasureStepsService vitMeasureStepsService;

    @Autowired
    private IvitMeasureTypeService vitMeasureTypeService;


    @RequiresPermissions("system:vitMeasuresForCompetences:view")
    @GetMapping()
    public String vitMeasuresForCompetences()
    {
        return prefix + "/vitMeasuresForCompetences";
    }

    /**
     * 查询vitMeasuresForCompetences列表
     */
    @RequiresPermissions("system:vitMeasuresForCompetences:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(vitMeasuresForCompetences vitMeasuresForCompetences)
    {
        startPage();
        List<vitMeasuresForCompetences> list = vitMeasuresForCompetencesService.selectvitMeasuresForCompetencesList(vitMeasuresForCompetences);
        return getDataTable(list);
    }

    /**
     * 导出vitMeasuresForCompetences列表
     */
    @RequiresPermissions("system:vitMeasuresForCompetences:export")
    @Log(title = "vitMeasuresForCompetences", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(vitMeasuresForCompetences vitMeasuresForCompetences)
    {
        List<vitMeasuresForCompetences> list = vitMeasuresForCompetencesService.selectvitMeasuresForCompetencesList(vitMeasuresForCompetences);
        ExcelUtil<vitMeasuresForCompetences> util = new ExcelUtil<vitMeasuresForCompetences>(vitMeasuresForCompetences.class);
        return util.exportExcel(list, "vitMeasuresForCompetences");
    }

    /**
     * 新增vitMeasuresForCompetences
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        List<vitCompetence> competenceList = vitCompetenceService.selectvitCompetenceAll();
        mmap.put("vitCompetences", competenceList);
        List<vitMeasureSteps> measureStepsList = vitMeasureStepsService.selectvitMeasureStepsAll();
        mmap.put("vitMeasureSteps", measureStepsList);
        List<vitMeasureType> measureTypeList = vitMeasureTypeService.selectvitMeasureTypeAll();
        mmap.put("vitMeasureTypes", measureTypeList);

        return prefix + "/add";
    }

    /**
     * 新增保存vitMeasuresForCompetences
     */
    @RequiresPermissions("system:vitMeasuresForCompetences:add")
    @Log(title = "vitMeasuresForCompetences", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(vitMeasuresForCompetences vitMeasuresForCompetences)
    {
        return toAjax(vitMeasuresForCompetencesService.insertvitMeasuresForCompetences(vitMeasuresForCompetences));
    }

    /**
     * 修改vitMeasuresForCompetences
     */
    @GetMapping("/edit/{viscountCompetenceId}")
    public String edit(@PathVariable("viscountCompetenceId") Long viscountCompetenceId, ModelMap mmap)
    {
        vitMeasuresForCompetences vitMeasuresForCompetences = vitMeasuresForCompetencesService.selectvitMeasuresForCompetencesById(viscountCompetenceId);
        mmap.put("vitMeasuresForCompetences", vitMeasuresForCompetences);

        List<vitCompetence> competenceList = vitCompetenceService.selectvitCompetenceAll();
        mmap.put("vitCompetences", competenceList);

        List<vitMeasureSteps> measureStepsList = vitMeasureStepsService.selectvitMeasureStepsAll();
        mmap.put("vitMeasureSteps", measureStepsList);

        List<vitMeasureType> measureTypeList = vitMeasureTypeService.selectvitMeasureTypeAll();
        mmap.put("vitMeasureTypes", measureTypeList);
        return prefix + "/edit";
    }

    /**
     * 修改保存vitMeasuresForCompetences
     */
    @RequiresPermissions("system:vitMeasuresForCompetences:edit")
    @Log(title = "vitMeasuresForCompetences", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(vitMeasuresForCompetences vitMeasuresForCompetences)
    {
        return toAjax(vitMeasuresForCompetencesService.updatevitMeasuresForCompetences(vitMeasuresForCompetences));
    }

    /**
     * 删除vitMeasuresForCompetences
     */
    @RequiresPermissions("system:vitMeasuresForCompetences:remove")
    @Log(title = "vitMeasuresForCompetences", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vitMeasuresForCompetencesService.deletevitMeasuresForCompetencesByIds(ids));
    }
}
