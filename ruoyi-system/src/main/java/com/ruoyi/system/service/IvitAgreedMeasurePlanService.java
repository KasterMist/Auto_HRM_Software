package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.vitAgreedMeasurePlan;

/**
 * vitAgreedMeasurePlanService接口
 * 
 * @author ruoyi
 * @date 2021-12-18
 */
public interface IvitAgreedMeasurePlanService 
{
    /**
     * 查询vitAgreedMeasurePlan
     * 
     * @param measurePlanId vitAgreedMeasurePlanID
     * @return vitAgreedMeasurePlan
     */
    public vitAgreedMeasurePlan selectvitAgreedMeasurePlanById(Long measurePlanId);

    /**
     * 查询vitAgreedMeasurePlan列表
     * 
     * @param vitAgreedMeasurePlan vitAgreedMeasurePlan
     * @return vitAgreedMeasurePlan集合
     */
    public List<vitAgreedMeasurePlan> selectvitAgreedMeasurePlanList(vitAgreedMeasurePlan vitAgreedMeasurePlan);

    /**
     * 新增vitAgreedMeasurePlan
     * 
     * @param vitAgreedMeasurePlan vitAgreedMeasurePlan
     * @return 结果
     */
    public int insertvitAgreedMeasurePlan(vitAgreedMeasurePlan vitAgreedMeasurePlan);

    /**
     * 修改vitAgreedMeasurePlan
     * 
     * @param vitAgreedMeasurePlan vitAgreedMeasurePlan
     * @return 结果
     */
    public int updatevitAgreedMeasurePlan(vitAgreedMeasurePlan vitAgreedMeasurePlan);

    /**
     * 批量删除vitAgreedMeasurePlan
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletevitAgreedMeasurePlanByIds(String ids);

    /**
     * 删除vitAgreedMeasurePlan信息
     * 
     * @param measurePlanId vitAgreedMeasurePlanID
     * @return 结果
     */
    public int deletevitAgreedMeasurePlanById(Long measurePlanId);
}
