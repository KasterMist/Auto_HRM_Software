package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.vitMeasureStepsMapper;
import com.ruoyi.system.domain.vitMeasureSteps;
import com.ruoyi.system.service.IvitMeasureStepsService;
import com.ruoyi.common.core.text.Convert;

/**
 * vitMeasureStepsService业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-14
 */
@Service
public class vitMeasureStepsServiceImpl implements IvitMeasureStepsService 
{
    @Autowired
    private vitMeasureStepsMapper vitMeasureStepsMapper;

    /**
     * 查询vitMeasureSteps
     * 
     * @param measureId vitMeasureStepsID
     * @return vitMeasureSteps
     */
    @Override
    public vitMeasureSteps selectvitMeasureStepsById(Long measureId)
    {
        return vitMeasureStepsMapper.selectvitMeasureStepsById(measureId);
    }

    /**
     * 查询vitMeasureSteps列表
     * 
     * @param vitMeasureSteps vitMeasureSteps
     * @return vitMeasureSteps
     */
    @Override
    public List<vitMeasureSteps> selectvitMeasureStepsList(vitMeasureSteps vitMeasureSteps)
    {
        return vitMeasureStepsMapper.selectvitMeasureStepsList(vitMeasureSteps);
    }

    /**
     * 新增vitMeasureSteps
     * 
     * @param vitMeasureSteps vitMeasureSteps
     * @return 结果
     */
    @Override
    public int insertvitMeasureSteps(vitMeasureSteps vitMeasureSteps)
    {
        return vitMeasureStepsMapper.insertvitMeasureSteps(vitMeasureSteps);
    }

    /**
     * 修改vitMeasureSteps
     * 
     * @param vitMeasureSteps vitMeasureSteps
     * @return 结果
     */
    @Override
    public int updatevitMeasureSteps(vitMeasureSteps vitMeasureSteps)
    {
        return vitMeasureStepsMapper.updatevitMeasureSteps(vitMeasureSteps);
    }

    /**
     * 删除vitMeasureSteps对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletevitMeasureStepsByIds(String ids)
    {
        return vitMeasureStepsMapper.deletevitMeasureStepsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除vitMeasureSteps信息
     * 
     * @param measureId vitMeasureStepsID
     * @return 结果
     */
    @Override
    public int deletevitMeasureStepsById(Long measureId)
    {
        return vitMeasureStepsMapper.deletevitMeasureStepsById(measureId);
    }

    @Override
    public List<vitMeasureSteps> selectvitMeasureStepsAll(){
        return vitMeasureStepsMapper.selectvitMeasureStepsAll();
    }

}
