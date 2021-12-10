package com.ruoyi.system.service.impl;

import java.util.List;
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
 * @date 2021-12-10
 */
@Service
public class vitCurrentCompetenceServiceImpl implements IvitCurrentCompetenceService 
{
    @Autowired
    private vitCurrentCompetenceMapper vitCurrentCompetenceMapper;

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
}
