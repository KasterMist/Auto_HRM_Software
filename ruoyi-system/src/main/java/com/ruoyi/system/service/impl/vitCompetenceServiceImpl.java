package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.system.domain.vitRoles;
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
 * @date 2021-12-08
 */
@Service
public class vitCompetenceServiceImpl implements IvitCompetenceService 
{
    @Autowired
    private vitCompetenceMapper vitCompetenceMapper;

    /**
     * 查询vitCompetence
     * 
     * @param competenceId vitCompetenceID
     * @return vitCompetence
     */
    @Override
    public vitCompetence selectvitCompetenceById(Long competenceId)
    {
        return vitCompetenceMapper.selectvitCompetenceById(competenceId);
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

        Long parentID = vitCompetence.getParentId();
        List<vitCompetence> sameParentIdList = selectvitCompetenceParentId(parentID);
        int sizePlusOne = sameParentIdList.size();
        if(parentID == 0){
            vitCompetence.setViscountCompetenceCode(sizePlusOne + ".0");
        }else{
            vitCompetence parentCompetence = selectvitCompetenceById(parentID);
            String targetIndex = "";
            int i = 1;
            while(true){
                boolean flag = true;
                for (vitCompetence competence : sameParentIdList) {
                    String[] competenceIdList = competence.getViscountCompetenceCode().split("\\.");
                    String index = competenceIdList[competenceIdList.length - 1];
                    if(index.equals(String.valueOf(i))){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    targetIndex = String.valueOf(i);
                    break;
                }
                i++;
            }
            if(parentCompetence.getParentId() == 0){
                vitCompetence.setViscountCompetenceCode(parentCompetence.getViscountCompetenceCode().split("\\.")[0] + "." + targetIndex);
            }else{
                vitCompetence.setViscountCompetenceCode(parentCompetence.getViscountCompetenceCode() + "." + targetIndex);
            }
        }

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
        Long parentID = vitCompetence.getParentId();
        List<vitCompetence> sameParentIdList = selectvitCompetenceParentId(parentID);
        int sizePlusOne = sameParentIdList.size();

        for(vitCompetence isItself: sameParentIdList){
            if(Objects.equals(isItself.getCompetenceId(), vitCompetence.getCompetenceId())){
                vitCompetence.setViscountCompetenceCode(isItself.getViscountCompetenceCode());
                return vitCompetenceMapper.updatevitCompetence(vitCompetence);
            }
        }

        if(parentID == 0){
            vitCompetence.setViscountCompetenceCode(sizePlusOne + ".0");
        }else{
            vitCompetence parentCompetence = selectvitCompetenceById(parentID);
            String targetIndex = "";
            int i = 1;
            while(true){
                boolean flag = true;
                for (vitCompetence competence : sameParentIdList) {
                    String[] competenceIdList = competence.getViscountCompetenceCode().split("\\.");
                    String index = competenceIdList[competenceIdList.length - 1];
                    if(index.equals(String.valueOf(i))){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    targetIndex = String.valueOf(i);
                    break;
                }
                i++;
            }
            if(parentCompetence.getParentId() == 0){
                vitCompetence.setViscountCompetenceCode(parentCompetence.getViscountCompetenceCode().split("\\.")[0] + "." + targetIndex);
            }else{
                vitCompetence.setViscountCompetenceCode(parentCompetence.getViscountCompetenceCode() + "." + targetIndex);
            }
        }

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
     * @param competenceId vitCompetenceID
     * @return 结果
     */
    @Override
    public int deletevitCompetenceById(Long competenceId)
    {
        return vitCompetenceMapper.deletevitCompetenceById(competenceId);
    }

    /**
     * 查询vitCompetence树列表
     * 
     * @return 所有vitCompetence信息
     */
    @Override
    public List<Ztree> selectvitCompetenceTree()
    {
        List<vitCompetence> vitCompetenceList = vitCompetenceMapper.selectvitCompetenceList(new vitCompetence());
        List<Ztree> ztrees = new ArrayList<Ztree>();
        for (vitCompetence vitCompetence : vitCompetenceList)
        {
            Ztree ztree = new Ztree();
            ztree.setId(vitCompetence.getCompetenceId());
            ztree.setpId(vitCompetence.getParentId());
            ztree.setName(vitCompetence.getCompetenceDescription());
            ztree.setTitle(vitCompetence.getCompetenceDescription());
            ztrees.add(ztree);
        }
        return ztrees;
    }

    @Override
    public List<vitCompetence> selectvitCompetenceAll(){
        return vitCompetenceMapper.selectvitCompetenceAll();
    }


    @Override
    public vitCompetence selectvitCompetenceDescription(String competenceDescription){
        return vitCompetenceMapper.selectvitCompetenceDescription(competenceDescription);
    }

    @Override
    public List<vitCompetence> selectvitCompetenceParentId(Long parentId){
        return vitCompetenceMapper.selectvitCompetenceParentId(parentId);
    }
}
