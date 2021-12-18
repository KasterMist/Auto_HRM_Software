package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.vitCompetence;
import com.ruoyi.system.domain.vitStaff;
import com.ruoyi.system.mapper.vitCompetenceMapper;
import com.ruoyi.system.mapper.vitRolesHasCompetenceTargetMapper;
import com.ruoyi.system.mapper.vitStaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.vitCurrentCompetenceMapper;
import com.ruoyi.system.domain.vitCurrentCompetence;
import com.ruoyi.system.service.IvitCurrentCompetenceService;
import com.ruoyi.common.core.text.Convert;

/**
 * vitCurrentCompetenceService业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-11
 */
@Service
public class vitCurrentCompetenceServiceImpl implements IvitCurrentCompetenceService 
{
    @Autowired
    private vitCurrentCompetenceMapper vitCurrentCompetenceMapper;


    @Autowired
    private vitStaffMapper vitstaffMapper;

    @Autowired
    private vitCompetenceMapper vitCompetenceMapper;
    /**
     * 查询vitCurrentCompetence
     * 
     * @param currentCompetenceId vitCurrentCompetenceID
     * @return vitCurrentCompetence
     */
    @Override
    public vitCurrentCompetence selectvitCurrentCompetenceById(Long currentCompetenceId)
    {
        return vitCurrentCompetenceMapper.selectvitCurrentCompetenceById(currentCompetenceId);
    }

    /**
     * 查询vitCurrentCompetence列表
     * 
     * @param vitCurrentCompetence vitCurrentCompetence
     * @return vitCurrentCompetence
     */
    @Override
    public List<vitCurrentCompetence> selectvitCurrentCompetenceList(vitCurrentCompetence vitCurrentCompetence)
    {
        return vitCurrentCompetenceMapper.selectvitCurrentCompetenceList(vitCurrentCompetence);
    }

    /**
     * 新增vitCurrentCompetence
     * 
     * @param vitCurrentCompetence vitCurrentCompetence
     * @return 结果
     */
    @Override
    public int insertvitCurrentCompetence(vitCurrentCompetence vitCurrentCompetence)
    {
        vitStaff staff = vitstaffMapper.selectvitStaffByName(vitCurrentCompetence.getName());
        vitCurrentCompetence.setCode(staff.getCode());
        vitCompetence competence = vitCompetenceMapper.selectvitCompetenceDescription(vitCurrentCompetence.getCompetenceDescription());
        vitCurrentCompetence.setViscountCompetenceCode(competence.getViscountCompetenceCode());

        return vitCurrentCompetenceMapper.insertvitCurrentCompetence(vitCurrentCompetence);
    }

    /**
     * 修改vitCurrentCompetence
     * 
     * @param vitCurrentCompetence vitCurrentCompetence
     * @return 结果
     */
    @Override
    public int updatevitCurrentCompetence(vitCurrentCompetence vitCurrentCompetence)
    {
        vitStaff staff = vitstaffMapper.selectvitStaffByName(vitCurrentCompetence.getName());
        vitCurrentCompetence.setCode(staff.getCode());
        vitCompetence competence = vitCompetenceMapper.selectvitCompetenceDescription(vitCurrentCompetence.getCompetenceDescription());
        vitCurrentCompetence.setViscountCompetenceCode(competence.getViscountCompetenceCode());

        return vitCurrentCompetenceMapper.updatevitCurrentCompetence(vitCurrentCompetence);
    }

    /**
     * 删除vitCurrentCompetence对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletevitCurrentCompetenceByIds(String ids)
    {
        return vitCurrentCompetenceMapper.deletevitCurrentCompetenceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除vitCurrentCompetence信息
     * 
     * @param currentCompetenceId vitCurrentCompetenceID
     * @return 结果
     */
    @Override
    public int deletevitCurrentCompetenceById(Long currentCompetenceId)
    {
        return vitCurrentCompetenceMapper.deletevitCurrentCompetenceById(currentCompetenceId);
    }

    @Override
    public List<vitCurrentCompetence> selectvitCurrentCompetenceAll(){
        return vitCurrentCompetenceMapper.selectvitCurrentCompetenceAll();
    }

    @Override
    public List<vitCurrentCompetence> selectvitCurrentCompetenceByCode(String code){
        return vitCurrentCompetenceMapper.selectvitCurrentCompetenceByCode(code);
    }
}
