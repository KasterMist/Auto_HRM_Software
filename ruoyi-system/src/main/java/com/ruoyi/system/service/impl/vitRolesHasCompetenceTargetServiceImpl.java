package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.vitCompetence;
import com.ruoyi.system.domain.vitRoles;
import com.ruoyi.system.mapper.vitCompetenceMapper;
import com.ruoyi.system.mapper.vitRolesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.vitRolesHasCompetenceTargetMapper;
import com.ruoyi.system.domain.vitRolesHasCompetenceTarget;
import com.ruoyi.system.service.IvitRolesHasCompetenceTargetService;
import com.ruoyi.common.core.text.Convert;

/**
 * vitRolesHasCompetenceTargetService业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-07
 */
@Service
public class vitRolesHasCompetenceTargetServiceImpl implements IvitRolesHasCompetenceTargetService 
{
    @Autowired
    private vitRolesHasCompetenceTargetMapper vitRolesHasCompetenceTargetMapper;

    @Autowired
    private vitRolesMapper vitRolesMapper;

    @Autowired
    private vitCompetenceMapper vitCompetenceMapper;

    /**
     * 查询vitRolesHasCompetenceTarget
     * 
     * @param rolesHasCompetenceTargetId vitRolesHasCompetenceTargetID
     * @return vitRolesHasCompetenceTarget
     */
    @Override
    public vitRolesHasCompetenceTarget selectvitRolesHasCompetenceTargetById(Long rolesHasCompetenceTargetId)
    {
        return vitRolesHasCompetenceTargetMapper.selectvitRolesHasCompetenceTargetById(rolesHasCompetenceTargetId);
    }

    /**
     * 查询vitRolesHasCompetenceTarget列表
     * 
     * @param vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget
     * @return vitRolesHasCompetenceTarget
     */
    @Override
    public List<vitRolesHasCompetenceTarget> selectvitRolesHasCompetenceTargetList(vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget)
    {
        return vitRolesHasCompetenceTargetMapper.selectvitRolesHasCompetenceTargetList(vitRolesHasCompetenceTarget);
    }

    /**
     * 新增vitRolesHasCompetenceTarget
     * 
     * @param vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget
     * @return 结果
     */
    @Override
    public int insertvitRolesHasCompetenceTarget(vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget)
    {
        vitRoles role = vitRolesMapper.selectVitRolesDescription(vitRolesHasCompetenceTarget.getRolesDescription());
        vitCompetence competence = vitCompetenceMapper.selectvitCompetenceDescription(vitRolesHasCompetenceTarget.getCompetenceDescription());
        vitRolesHasCompetenceTarget.setViscountRolesId(role.getViscountRolesId());
        vitRolesHasCompetenceTarget.setViscountCompetenceCode(competence.getViscountCompetenceCode());
        return vitRolesHasCompetenceTargetMapper.insertvitRolesHasCompetenceTarget(vitRolesHasCompetenceTarget);
    }

    /**
     * 修改vitRolesHasCompetenceTarget
     * 
     * @param vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget
     * @return 结果
     */
    @Override
    public int updatevitRolesHasCompetenceTarget(vitRolesHasCompetenceTarget vitRolesHasCompetenceTarget)
    {
        vitRoles role = vitRolesMapper.selectVitRolesDescription(vitRolesHasCompetenceTarget.getRolesDescription());
        System.out.println(vitRolesHasCompetenceTarget.getRolesDescription());

        vitCompetence competence = vitCompetenceMapper.selectvitCompetenceDescription(vitRolesHasCompetenceTarget.getCompetenceDescription());
        vitRolesHasCompetenceTarget.setViscountRolesId(role.getViscountRolesId());
        vitRolesHasCompetenceTarget.setViscountCompetenceCode(competence.getViscountCompetenceCode());
        return vitRolesHasCompetenceTargetMapper.updatevitRolesHasCompetenceTarget(vitRolesHasCompetenceTarget);
    }

    /**
     * 删除vitRolesHasCompetenceTarget对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletevitRolesHasCompetenceTargetByIds(String ids)
    {
        return vitRolesHasCompetenceTargetMapper.deletevitRolesHasCompetenceTargetByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除vitRolesHasCompetenceTarget信息
     * 
     * @param rolesHasCompetenceTargetId vitRolesHasCompetenceTargetID
     * @return 结果
     */
    @Override
    public int deletevitRolesHasCompetenceTargetById(Long rolesHasCompetenceTargetId)
    {
        return vitRolesHasCompetenceTargetMapper.deletevitRolesHasCompetenceTargetById(rolesHasCompetenceTargetId);
    }
}
