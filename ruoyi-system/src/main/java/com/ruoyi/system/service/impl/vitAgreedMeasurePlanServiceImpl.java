package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.vitAgreedMeasurePlanMapper;
import com.ruoyi.system.domain.vitAgreedMeasurePlan;
import com.ruoyi.system.service.IvitAgreedMeasurePlanService;
import com.ruoyi.common.core.text.Convert;

/**
 * vitAgreedMeasurePlanService业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-18
 */
@Service
public class vitAgreedMeasurePlanServiceImpl implements IvitAgreedMeasurePlanService 
{
    @Autowired
    private vitAgreedMeasurePlanMapper vitAgreedMeasurePlanMapper;

    /**
     * 查询vitAgreedMeasurePlan
     * 
     * @param measurePlanId vitAgreedMeasurePlanID
     * @return vitAgreedMeasurePlan
     */
    @Override
    public vitAgreedMeasurePlan selectvitAgreedMeasurePlanById(Long measurePlanId)
    {
        return vitAgreedMeasurePlanMapper.selectvitAgreedMeasurePlanById(measurePlanId);
    }

    /**
     * 查询vitAgreedMeasurePlan列表
     * 
     * @param vitAgreedMeasurePlan vitAgreedMeasurePlan
     * @return vitAgreedMeasurePlan
     */
    @Override
    public List<vitAgreedMeasurePlan> selectvitAgreedMeasurePlanList(vitAgreedMeasurePlan vitAgreedMeasurePlan)
    {
        return vitAgreedMeasurePlanMapper.selectvitAgreedMeasurePlanList(vitAgreedMeasurePlan);
    }

    /**
     * 新增vitAgreedMeasurePlan
     * 
     * @param vitAgreedMeasurePlan vitAgreedMeasurePlan
     * @return 结果
     */
    @Override
    public int insertvitAgreedMeasurePlan(vitAgreedMeasurePlan vitAgreedMeasurePlan)
    {
        return vitAgreedMeasurePlanMapper.insertvitAgreedMeasurePlan(vitAgreedMeasurePlan);
    }

    /**
     * 修改vitAgreedMeasurePlan
     * 
     * @param vitAgreedMeasurePlan vitAgreedMeasurePlan
     * @return 结果
     */
    @Override
    public int updatevitAgreedMeasurePlan(vitAgreedMeasurePlan vitAgreedMeasurePlan)
    {
        return vitAgreedMeasurePlanMapper.updatevitAgreedMeasurePlan(vitAgreedMeasurePlan);
    }

    /**
     * 删除vitAgreedMeasurePlan对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletevitAgreedMeasurePlanByIds(String ids)
    {
        return vitAgreedMeasurePlanMapper.deletevitAgreedMeasurePlanByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除vitAgreedMeasurePlan信息
     * 
     * @param measurePlanId vitAgreedMeasurePlanID
     * @return 结果
     */
    @Override
    public int deletevitAgreedMeasurePlanById(Long measurePlanId)
    {
        return vitAgreedMeasurePlanMapper.deletevitAgreedMeasurePlanById(measurePlanId);
    }
}
