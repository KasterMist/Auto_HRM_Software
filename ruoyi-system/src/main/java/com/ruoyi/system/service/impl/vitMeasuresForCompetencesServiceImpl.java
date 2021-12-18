package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.vitCompetence;
import com.ruoyi.system.mapper.vitCompetenceMapper;
import com.ruoyi.system.mapper.vitStaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.vitMeasuresForCompetencesMapper;
import com.ruoyi.system.domain.vitMeasuresForCompetences;
import com.ruoyi.system.service.IvitMeasuresForCompetencesService;
import com.ruoyi.common.core.text.Convert;

/**
 * vitMeasuresForCompetencesService业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-15
 */
@Service
public class vitMeasuresForCompetencesServiceImpl implements IvitMeasuresForCompetencesService 
{

    @Autowired
    private vitCompetenceMapper vitCompetenceMapper;


    @Autowired
    private vitMeasuresForCompetencesMapper vitMeasuresForCompetencesMapper;

    /**
     * 查询vitMeasuresForCompetences
     * 
     * @param viscountCompetenceId vitMeasuresForCompetencesID
     * @return vitMeasuresForCompetences
     */
    @Override
    public vitMeasuresForCompetences selectvitMeasuresForCompetencesById(Long viscountCompetenceId)
    {
        return vitMeasuresForCompetencesMapper.selectvitMeasuresForCompetencesById(viscountCompetenceId);
    }

    /**
     * 查询vitMeasuresForCompetences列表
     * 
     * @param vitMeasuresForCompetences vitMeasuresForCompetences
     * @return vitMeasuresForCompetences
     */
    @Override
    public List<vitMeasuresForCompetences> selectvitMeasuresForCompetencesList(vitMeasuresForCompetences vitMeasuresForCompetences)
    {
        return vitMeasuresForCompetencesMapper.selectvitMeasuresForCompetencesList(vitMeasuresForCompetences);
    }

    /**
     * 新增vitMeasuresForCompetences
     * 
     * @param vitMeasuresForCompetences vitMeasuresForCompetences
     * @return 结果
     */
    @Override
    public int insertvitMeasuresForCompetences(vitMeasuresForCompetences vitMeasuresForCompetences)
    {
        vitCompetence competence = vitCompetenceMapper.selectvitCompetenceDescription(vitMeasuresForCompetences.getCompetenceDescription());
        vitMeasuresForCompetences.setViscountCompetenceCode(competence.getViscountCompetenceCode());

        return vitMeasuresForCompetencesMapper.insertvitMeasuresForCompetences(vitMeasuresForCompetences);
    }

    /**
     * 修改vitMeasuresForCompetences
     * 
     * @param vitMeasuresForCompetences vitMeasuresForCompetences
     * @return 结果
     */
    @Override
    public int updatevitMeasuresForCompetences(vitMeasuresForCompetences vitMeasuresForCompetences)
    {
        vitCompetence competence = vitCompetenceMapper.selectvitCompetenceDescription(vitMeasuresForCompetences.getCompetenceDescription());
        vitMeasuresForCompetences.setViscountCompetenceCode(competence.getViscountCompetenceCode());

        return vitMeasuresForCompetencesMapper.updatevitMeasuresForCompetences(vitMeasuresForCompetences);
    }

    /**
     * 删除vitMeasuresForCompetences对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletevitMeasuresForCompetencesByIds(String ids)
    {
        return vitMeasuresForCompetencesMapper.deletevitMeasuresForCompetencesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除vitMeasuresForCompetences信息
     * 
     * @param viscountCompetenceId vitMeasuresForCompetencesID
     * @return 结果
     */
    @Override
    public int deletevitMeasuresForCompetencesById(Long viscountCompetenceId)
    {
        return vitMeasuresForCompetencesMapper.deletevitMeasuresForCompetencesById(viscountCompetenceId);
    }

    @Override
    public List<vitMeasuresForCompetences> selectvitMeasuresForCompetencesAll(){
        return vitMeasuresForCompetencesMapper.selectvitMeasuresForCompetencesAll();
    }

    @Override
    public List<vitMeasuresForCompetences> selectvitMeasuresForCompetencesByDescription(String competenceDescription){
        return vitMeasuresForCompetencesMapper.selectvitMeasuresForCompetencesByDescription(competenceDescription);
    }

    @Override
    public List<vitMeasuresForCompetences> selectvitMeasuresForCompetencesByMeasureTypeCode(int measureTypeCode){
        return vitMeasuresForCompetencesMapper.selectvitMeasuresForCompetencesByMeasureTypeCode(measureTypeCode);
    }

    @Override
    public List<vitMeasuresForCompetences> selectvitMeasuresForCompetencesByCompetenceCode(String viscountCompetenceCode){
        return vitMeasuresForCompetencesMapper.selectvitMeasuresForCompetencesByCompetenceCode(viscountCompetenceCode);
    }

}
