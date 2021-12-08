package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.vitRolesHasCompetenceTarget;

/**
 * vitRolesHasCompetenceTargetMapper接口
 * 
 * @author ruoyi
 * @date 2021-12-07
 */
public interface vitRolesHasCompetenceTargetMapper 
{
    /**
     * 查询vitRolesHasCompetenceTarget
     * 
     * @param rolesHasCompetenceTargetId vitRolesHasCompetenceTargetID
     * @return vitRolesHasCompetenceTarget
     */
    public vitRolesHasCompetenceTarget selectvitRolesHasCompetenceTargetById(Long rolesHasCompetenceTargetId);

    /**
     * 查询vitRolesHasCompetenceTarget列表
     * 
     * @param vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget
     * @return vitRolesHasCompetenceTarget集合
     */
    public List<vitRolesHasCompetenceTarget> selectvitRolesHasCompetenceTargetList(vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget);

    /**
     * 新增vitRolesHasCompetenceTarget
     * 
     * @param vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget
     * @return 结果
     */
    public int insertvitRolesHasCompetenceTarget(vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget);

    /**
     * 修改vitRolesHasCompetenceTarget
     * 
     * @param vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget
     * @return 结果
     */
    public int updatevitRolesHasCompetenceTarget(vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget);

    /**
     * 删除vitRolesHasCompetenceTarget
     * 
     * @param rolesHasCompetenceTargetId vitRolesHasCompetenceTargetID
     * @return 结果
     */
    public int deletevitRolesHasCompetenceTargetById(Long rolesHasCompetenceTargetId);

    /**
     * 批量删除vitRolesHasCompetenceTarget
     * 
     * @param rolesHasCompetenceTargetIds 需要删除的数据ID
     * @return 结果
     */
    public int deletevitRolesHasCompetenceTargetByIds(String[] rolesHasCompetenceTargetIds);
}
