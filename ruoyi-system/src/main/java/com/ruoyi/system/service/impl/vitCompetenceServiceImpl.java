package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.vitCompetenceMapper;
import com.ruoyi.system.domain.vitCompetence;
import com.ruoyi.system.service.IvitCompetenceService;
import com.ruoyi.common.core.text.Convert;

/**
 * vitCompetenceService业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-02
 */
@Service
public class vitCompetenceServiceImpl implements IvitCompetenceService 
{
    @Autowired
    private vitCompetenceMapper vitCompetenceMapper;

    /**
     * 查询vitCompetence
     * 
     * @param viscountCompetenceCode vitCompetenceID
     * @return vitCompetence
     */
    @Override
    public vitCompetence selectvitCompetenceById(String viscountCompetenceCode)
    {
        return vitCompetenceMapper.selectvitCompetenceById(viscountCompetenceCode);
    }

    /**
     * 查询vitCompetence列表
     * 
     * @param vitCompetence vitCompetence
     * @return vitCompetence
     */
    @Override
    public List<vitCompetence> selectvitCompetenceList(vitCompetence vitCompetence)
    {
        return vitCompetenceMapper.selectvitCompetenceList(vitCompetence);
    }

    /**
     * 新增vitCompetence
     * 
     * @param vitCompetence vitCompetence
     * @return 结果
     */
    @Override
    public int insertvitCompetence(vitCompetence vitCompetence)
    {
        return vitCompetenceMapper.insertvitCompetence(vitCompetence);
    }

    /**
     * 修改vitCompetence
     * 
     * @param vitCompetence vitCompetence
     * @return 结果
     */
    @Override
    public int updatevitCompetence(vitCompetence vitCompetence)
    {
        return vitCompetenceMapper.updatevitCompetence(vitCompetence);
    }

    /**
     * 删除vitCompetence对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletevitCompetenceByIds(String ids)
    {
        return vitCompetenceMapper.deletevitCompetenceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除vitCompetence信息
     * 
     * @param viscountCompetenceCode vitCompetenceID
     * @return 结果
     */
    @Override
    public int deletevitCompetenceById(String viscountCompetenceCode)
    {
        return vitCompetenceMapper.deletevitCompetenceById(viscountCompetenceCode);
    }
}
