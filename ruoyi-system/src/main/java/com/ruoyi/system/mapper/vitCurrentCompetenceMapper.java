package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.vitCurrentCompetence;

/**
 * vitCurrentCompetenceMapper接口
 * 
 * @author ruoyi
 * @date 2021-12-11
 */
public interface vitCurrentCompetenceMapper 
{
    /**
     * 查询vitCurrentCompetence
     * 
     * @param currentCompetenceId vitCurrentCompetenceID
     * @return vitCurrentCompetence
     */
    public vitCurrentCompetence selectvitCurrentCompetenceById(Long currentCompetenceId);

    /**
     * 查询vitCurrentCompetence列表
     * 
     * @param vitCurrentCompetence vitCurrentCompetence
     * @return vitCurrentCompetence集合
     */
    public List<vitCurrentCompetence> selectvitCurrentCompetenceList(vitCurrentCompetence vitCurrentCompetence);

    /**
     * 新增vitCurrentCompetence
     * 
     * @param vitCurrentCompetence vitCurrentCompetence
     * @return 结果
     */
    public int insertvitCurrentCompetence(vitCurrentCompetence vitCurrentCompetence);

    /**
     * 修改vitCurrentCompetence
     * 
     * @param vitCurrentCompetence vitCurrentCompetence
     * @return 结果
     */
    public int updatevitCurrentCompetence(vitCurrentCompetence vitCurrentCompetence);

    /**
     * 删除vitCurrentCompetence
     * 
     * @param currentCompetenceId vitCurrentCompetenceID
     * @return 结果
     */
    public int deletevitCurrentCompetenceById(Long currentCompetenceId);

    /**
     * 批量删除vitCurrentCompetence
     * 
     * @param currentCompetenceIds 需要删除的数据ID
     * @return 结果
     */
    public int deletevitCurrentCompetenceByIds(String[] currentCompetenceIds);
}
