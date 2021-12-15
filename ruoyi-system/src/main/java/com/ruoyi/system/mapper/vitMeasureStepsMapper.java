package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.vitMeasureSteps;

/**
 * vitMeasureStepsMapper接口
 * 
 * @author ruoyi
 * @date 2021-12-14
 */
public interface vitMeasureStepsMapper 
{
    /**
     * 查询vitMeasureSteps
     * 
     * @param measureId vitMeasureStepsID
     * @return vitMeasureSteps
     */
    public vitMeasureSteps selectvitMeasureStepsById(Long measureId);

    /**
     * 查询vitMeasureSteps列表
     * 
     * @param vitMeasureSteps vitMeasureSteps
     * @return vitMeasureSteps集合
     */
    public List<vitMeasureSteps> selectvitMeasureStepsList(vitMeasureSteps vitMeasureSteps);

    /**
     * 新增vitMeasureSteps
     * 
     * @param vitMeasureSteps vitMeasureSteps
     * @return 结果
     */
    public int insertvitMeasureSteps(vitMeasureSteps vitMeasureSteps);

    /**
     * 修改vitMeasureSteps
     * 
     * @param vitMeasureSteps vitMeasureSteps
     * @return 结果
     */
    public int updatevitMeasureSteps(vitMeasureSteps vitMeasureSteps);

    /**
     * 删除vitMeasureSteps
     * 
     * @param measureId vitMeasureStepsID
     * @return 结果
     */
    public int deletevitMeasureStepsById(Long measureId);

    /**
     * 批量删除vitMeasureSteps
     * 
     * @param measureIds 需要删除的数据ID
     * @return 结果
     */
    public int deletevitMeasureStepsByIds(String[] measureIds);

    public List<vitMeasureSteps> selectvitMeasureStepsAll();
}
