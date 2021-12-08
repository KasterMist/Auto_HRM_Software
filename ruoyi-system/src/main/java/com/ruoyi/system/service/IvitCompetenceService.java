package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.vitCompetence;
import com.ruoyi.common.core.domain.Ztree;

/**
 * vitCompetenceService接口
 * 
 * @author ruoyi
 * @date 2021-12-08
 */
public interface IvitCompetenceService 
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
     * 批量删除vitCompetence
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletevitCompetenceByIds(String ids);

    /**
     * 删除vitCompetence信息
     * 
     * @param competenceId vitCompetenceID
     * @return 结果
     */
    public int deletevitCompetenceById(Long competenceId);

    /**
     * 查询vitCompetence树列表
     * 
     * @return 所有vitCompetence信息
     */
    public List<Ztree> selectvitCompetenceTree();

    public List<vitCompetence> selectvitCompetenceAll();

    public vitCompetence selectvitCompetenceDescription(String competenceDescription);

    public List<vitCompetence> selectvitCompetenceParentId(Long parentId);
}
