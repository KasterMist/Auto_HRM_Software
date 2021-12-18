package com.ruoyi.web.controller;

import java.util.ArrayList;
import java.util.List;

import com.ruoyi.system.domain.*;
import com.ruoyi.system.service.*;
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
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * vitAgreedMeasurePlanController
 * 
 * @author ruoyi
 * @date 2021-12-18
 */
@Controller
@RequestMapping("/system/vitAgreedMeasurePlan")
public class vitAgreedMeasurePlanController extends BaseController
{
    private String prefix = "system/vitAgreedMeasurePlan";

    @Autowired
    private IvitAgreedMeasurePlanService vitAgreedMeasurePlanService;

    @Autowired
    private IvitStaffService vitStaffService;

    @Autowired
    private IvitCurrentCompetenceService vitCurrentCompetenceService;

    @Autowired
    private IvitCompetenceService vitCompetenceService;

    @Autowired
    private IvitMeasureTypeService vitMeasureTypeService;

    @Autowired
    private IvitMeasureStepsService vitMeasureStepsService;

    @Autowired
    private IvitMeasuresForCompetencesService vitMeasuresForCompetencesService;

    @RequiresPermissions("system:vitAgreedMeasurePlan:view")
    @GetMapping()
    public String vitAgreedMeasurePlan()
    {
        return prefix + "/vitAgreedMeasurePlan";
    }

    /**
     * 查询vitAgreedMeasurePlan列表
     */
    @RequiresPermissions("system:vitAgreedMeasurePlan:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(vitAgreedMeasurePlan vitAgreedMeasurePlan)
    {
        startPage();
        List<vitAgreedMeasurePlan> list = vitAgreedMeasurePlanService.selectvitAgreedMeasurePlanList(vitAgreedMeasurePlan);
        return getDataTable(list);
    }


    @GetMapping("/select1")
    @ResponseBody
    public List<String> getCompetenceDescriptionByStaffCode(String code) {
        List<vitCurrentCompetence> currentCompetenceList = vitCurrentCompetenceService.selectvitCurrentCompetenceByCode(code);
        List<String> competenceList = new ArrayList<String>();
        for(vitCurrentCompetence t: currentCompetenceList){
            competenceList.add(t.getCompetenceDescription() + "," + t.getViscountCompetenceCode());
        }
        return competenceList;
    }

    @GetMapping("/select2")
    @ResponseBody
    public List<String> getmeasureTypeByCompetenceDescription(String viscountCompetenceCode) {
        List<vitMeasuresForCompetences> measuresForCompetencesList = vitMeasuresForCompetencesService.selectvitMeasuresForCompetencesByCompetenceCode(viscountCompetenceCode);
        List<String> measureTypeCodeList = new ArrayList<String>();
        for(vitMeasuresForCompetences t: measuresForCompetencesList){
            Long id = t.getMeasureTypeCode();
            if(!measureTypeCodeList.contains(vitMeasureTypeService.selectvitMeasureTypeById(id).getMeasureDescription() + "," + id)){
                measureTypeCodeList.add(vitMeasureTypeService.selectvitMeasureTypeById(id).getMeasureDescription() + "," + id);
            }
        }
        return measureTypeCodeList;
    }

    @GetMapping("/select3")
    @ResponseBody
    public List<Long> getmeasureTargetByMeasureTypeCode(String viscountCompetenceCode, int measureTypeCode) {
        List<vitMeasuresForCompetences> measuresForCompetencesList = vitMeasuresForCompetencesService.selectvitMeasuresForCompetencesByCompetenceCode(viscountCompetenceCode);
        List<vitMeasuresForCompetences> updatemeasuresForCompetencesList = new ArrayList<vitMeasuresForCompetences>();
        for(vitMeasuresForCompetences t: measuresForCompetencesList){
            if(t.getMeasureTypeCode() == measureTypeCode){
                updatemeasuresForCompetencesList.add(t);
            }
        }
        List<Long> targetList = new ArrayList<Long>();
        for(vitMeasuresForCompetences t: updatemeasuresForCompetencesList){
            if(!targetList.contains(t.getTarget())){
                targetList.add(t.getTarget());
            }
        }

        try{
            for(int i = 0; i < targetList.size(); i++){
                for(int j = 0; j < targetList.size() - i - 1; j++){
                    if(targetList.get(j) > targetList.get(j + 1)){
                        Long change = targetList.get(j);
                        targetList.set(j, targetList.get(j + 1));
                        targetList.set(j + 1, change);
                    }
                }
            }
        }catch(Exception e){

        }

        return targetList;
    }


    /**
     * 导出vitAgreedMeasurePlan列表
     */
    @RequiresPermissions("system:vitAgreedMeasurePlan:export")
    @Log(title = "vitAgreedMeasurePlan", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(vitAgreedMeasurePlan vitAgreedMeasurePlan)
    {
        List<vitAgreedMeasurePlan> list = vitAgreedMeasurePlanService.selectvitAgreedMeasurePlanList(vitAgreedMeasurePlan);
        ExcelUtil<vitAgreedMeasurePlan> util = new ExcelUtil<vitAgreedMeasurePlan>(vitAgreedMeasurePlan.class);
        return util.exportExcel(list, "vitAgreedMeasurePlan");
    }

    /**
     * 新增vitAgreedMeasurePlan
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        List<vitCurrentCompetence> vitCurrentCompetenceList = vitCurrentCompetenceService.selectvitCurrentCompetenceAll();
        List<vitMeasuresForCompetences> vitMeasuresForCompetencesList = vitMeasuresForCompetencesService.selectvitMeasuresForCompetencesAll();
        List<vitStaff> vitStaffList = vitStaffService.getvitStaffListAll();
        List<vitMeasureType> vitMeasureTypeList = vitMeasureTypeService.selectvitMeasureTypeAll();
        List<vitMeasureSteps> vitMeasureStepsList = vitMeasureStepsService.selectvitMeasureStepsAll();
        mmap.put("vitCurrentCompetences", vitCurrentCompetenceList);
        mmap.put("vitMeasuresForCompetences", vitMeasuresForCompetencesList);
        mmap.put("vitStaffs", vitStaffList);
        mmap.put("vitMeasureTypes", vitMeasureTypeList);
        mmap.put("vitMeasureSteps", vitMeasureStepsList);
        return prefix + "/add";
    }

    /**
     * 新增保存vitAgreedMeasurePlan
     */
    @RequiresPermissions("system:vitAgreedMeasurePlan:add")
    @Log(title = "vitAgreedMeasurePlan", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(vitAgreedMeasurePlan vitAgreedMeasurePlan)
    {
        return toAjax(vitAgreedMeasurePlanService.insertvitAgreedMeasurePlan(vitAgreedMeasurePlan));
    }

    /**
     * 修改vitAgreedMeasurePlan
     */
    @GetMapping("/edit/{measurePlanId}")
    public String edit(@PathVariable("measurePlanId") Long measurePlanId, ModelMap mmap)
    {
        vitAgreedMeasurePlan vitAgreedMeasurePlan = vitAgreedMeasurePlanService.selectvitAgreedMeasurePlanById(measurePlanId);
        mmap.put("vitAgreedMeasurePlan", vitAgreedMeasurePlan);

        List<vitCurrentCompetence> vitCurrentCompetenceList = vitCurrentCompetenceService.selectvitCurrentCompetenceAll();
        List<vitMeasuresForCompetences> vitMeasuresForCompetencesList = vitMeasuresForCompetencesService.selectvitMeasuresForCompetencesAll();
        List<vitStaff> vitStaffList = vitStaffService.getvitStaffListAll();
        List<vitMeasureType> vitMeasureTypeList = vitMeasureTypeService.selectvitMeasureTypeAll();
        List<vitMeasureSteps> vitMeasureStepsList = vitMeasureStepsService.selectvitMeasureStepsAll();
        mmap.put("vitCurrentCompetences", vitCurrentCompetenceList);
        mmap.put("vitMeasuresForCompetences", vitMeasuresForCompetencesList);
        mmap.put("vitStaffs", vitStaffList);
        mmap.put("vitMeasureTypes", vitMeasureTypeList);
        mmap.put("vitMeasureSteps", vitMeasureStepsList);
        return prefix + "/edit";
    }

    /**
     * 修改保存vitAgreedMeasurePlan
     */
    @RequiresPermissions("system:vitAgreedMeasurePlan:edit")
    @Log(title = "vitAgreedMeasurePlan", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(vitAgreedMeasurePlan vitAgreedMeasurePlan)
    {
        return toAjax(vitAgreedMeasurePlanService.updatevitAgreedMeasurePlan(vitAgreedMeasurePlan));
    }

    /**
     * 删除vitAgreedMeasurePlan
     */
    @RequiresPermissions("system:vitAgreedMeasurePlan:remove")
    @Log(title = "vitAgreedMeasurePlan", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vitAgreedMeasurePlanService.deletevitAgreedMeasurePlanByIds(ids));
    }
}
