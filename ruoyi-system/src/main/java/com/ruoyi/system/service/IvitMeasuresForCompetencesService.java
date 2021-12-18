package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.vitMeasuresForCompetences;

/**
 * vitMeasuresForCompetencesService接口
 * 
 * @author ruoyi
 * @date 2021-12-15
 */
public interface IvitMeasuresForCompetencesService 
{
    /**
     * 查询vitMeasuresForCompetences
     * 
     * @param viscountCompetenceId vitMeasuresForCompetencesID
     * @return vitMeasuresForCompetences
     */
    public vitMeasuresForCompetences selectvitMeasuresForCompetencesById(Long viscountCompetenceId);

    /**
     * 查询vitMeasuresForCompetences列表
     * 
     * @param vitMeasuresForCompetences vitMeasuresForCompetences
     * @return vitMeasuresForCompetences集合
     */
    public List<vitMeasuresForCompetences> selectvitMeasuresForCompetencesList(vitMeasuresForCompetences vitMeasuresForCompetences);

    /**
     * 新增vitMeasuresForCompetences
     * 
     * @param vitMeasuresForCompetences vitMeasuresForCompetences
     * @return 结果
     */
    public int insertvitMeasuresForCompetences(vitMeasuresForCompetences vitMeasuresForCompetences);

    /**
     * 修改vitMeasuresForCompetences
     * 
     * @param vitMeasuresForCompetences vitMeasuresForCompetences
     * @return 结果
     */
    public int updatevitMeasuresForCompetences(vitMeasuresForCompetences vitMeasuresForCompetences);

    /**
     * 批量删除vitMeasuresForCompetences
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletevitMeasuresForCompetencesByIds(String ids);

    /**
     * 删除vitMeasuresForCompetences信息
     * 
     * @param viscountCompetenceId vitMeasuresForCompetencesID
     * @return 结果
     */
    public int deletevitMeasuresForCompetencesById(Long viscountCompetenceId);

    public List<vitMeasuresForCompetences> selectvitMeasuresForCompetencesAll();

    public List<vitMeasuresForCompetences> selectvitMeasuresForCompetencesByDescription(String competenceDescription);

    public List<vitMeasuresForCompetences> selectvitMeasuresForCompetencesByMeasureTypeCode(int measureTypeCode);

    public List<vitMeasuresForCompetences> selectvitMeasuresForCompetencesByCompetenceCode(String viscountCompetenceCode);
}
