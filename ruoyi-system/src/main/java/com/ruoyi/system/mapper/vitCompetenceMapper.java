package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.vitCompetence;

/**
 * vitCompetenceMapper接口
 * 
 * @author ruoyi
 * @date 2021-12-08
 */
public interface vitCompetenceMapper 
{
    /**
     * 查询vitCompetence
     * 
     * @param competenceId vitCompetenceID
     * @return vitCompetence
     */
    public vitCompetence selectvitCompetenceById(Long competenceId);

    /**
     * 查询vitCompetence列表
     * 
     * @param vitCompetence vitCompetence
     * @return vitCompetence集合
     */
    public List<vitCompetence> selectvitCompetenceList(vitCompetence vitCompetence);

    /**
     * 新增vitCompetence
     * 
     * @param vitCompetence vitCompetence
     * @return 结果
     */
    public int insertvitCompetence(vitCompetence vitCompetence);

    /**
     * 修改vitCompetence
     * 
     * @param vitCompetence vitCompetence
     * @return 结果
     */
    public int updatevitCompetence(vitCompetence vitCompetence);

    /**
     * 删除vitCompetence
     * 
     * @param competenceId vitCompetenceID
     * @return 结果
     */
    public int deletevitCompetenceById(Long competenceId);

    /**
     * 批量删除vitCompetence
     * 
     * @param competenceIds 需要删除的数据ID
     * @return 结果
     */
    public int deletevitCompetenceByIds(String[] competenceIds);

    public List<vitCompetence> selectvitCompetenceAll();

    public vitCompetence selectvitCompetenceDescription(String competenceDescription);

    public List<vitCompetence> selectvitCompetenceParentId(Long parentId);
}
