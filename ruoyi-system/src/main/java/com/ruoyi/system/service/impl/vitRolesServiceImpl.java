package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

import com.ruoyi.common.core.domain.Ztree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.vitRolesMapper;
import com.ruoyi.system.domain.vitRoles;
import com.ruoyi.system.service.IvitRolesService;
import com.ruoyi.common.core.text.Convert;

/**
 * vitRolesService业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-08
 */
@Service
public class vitRolesServiceImpl implements IvitRolesService 
{
    @Autowired
    private vitRolesMapper vitRolesMapper;

    /**
     * 查询vitRoles
     * 
     * @param roleId vitRolesID
     * @return vitRoles
     */
    @Override
    public vitRoles selectvitRolesById(Long roleId)
    {
        return vitRolesMapper.selectvitRolesById(roleId);
    }

    /**
     * 查询vitRoles列表
     * 
     * @param vitRoles vitRoles
     * @return vitRoles
     */
    @Override
    public List<vitRoles> selectvitRolesList(vitRoles vitRoles)
    {
        return vitRolesMapper.selectvitRolesList(vitRoles);
    }

    /**
     * 新增vitRoles
     * 
     * @param vitRoles vitRoles
     * @return 结果
     */
    @Override
    public int insertvitRoles(vitRoles vitRoles)
    {
        Long parentID = vitRoles.getParentId();
        List<vitRoles> sameParentIdList = selectVitRolesParentId(parentID);
        int sizePlusOne = sameParentIdList.size();
        if(parentID == 0){
            vitRoles.setViscountRolesId(sizePlusOne + ".0");
        }else{
            vitRoles parentRole = selectvitRolesById(parentID);
            String targetIndex = "";
            int i = 1;
            while(true){
                boolean flag = true;
                for (vitRoles role : sameParentIdList) {
                    String[] RolesIdList = role.getViscountRolesId().split("\\.");
                    String index = RolesIdList[RolesIdList.length - 1];
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
            if(parentRole.getParentId() == 0){
                vitRoles.setViscountRolesId(parentRole.getViscountRolesId().split("\\.")[0] + "." + targetIndex);
            }else{
                vitRoles.setViscountRolesId(parentRole.getViscountRolesId() + "." + targetIndex);
            }
        }
        return vitRolesMapper.insertvitRoles(vitRoles);
    }

    /**
     * 修改vitRoles
     * 
     * @param vitRoles vitRoles
     * @return 结果
     */
    @Override
    public int updatevitRoles(vitRoles vitRoles)
    {
        Long parentID = vitRoles.getParentId();
        List<vitRoles> sameParentIdList = selectVitRolesParentId(parentID);
        int sizePlusOne = sameParentIdList.size();

        for(vitRoles isItself: sameParentIdList){
            if(Objects.equals(isItself.getRoleId(), vitRoles.getRoleId())){
                vitRoles.setViscountRolesId(isItself.getViscountRolesId());
                return vitRolesMapper.updatevitRoles(vitRoles);
            }
        }
        if(parentID == 0){
            vitRoles.setViscountRolesId(sizePlusOne + ".0");
        }else{
            vitRoles parentRole = selectvitRolesById(parentID);
            String targetIndex = "";
            int i = 1;
            while(true){
                boolean flag = true;
                for (vitRoles role : sameParentIdList) {
                    String[] RolesIdList = role.getViscountRolesId().split("\\.");
                    String index = RolesIdList[RolesIdList.length - 1];
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
            if(parentRole.getParentId() == 0){
                vitRoles.setViscountRolesId(parentRole.getViscountRolesId().split("\\.")[0] + "." + targetIndex);
            }else{
                vitRoles.setViscountRolesId(parentRole.getViscountRolesId() + "." + targetIndex);
            }
        }
        return vitRolesMapper.updatevitRoles(vitRoles);
    }

    /**
     * 删除vitRoles对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletevitRolesByIds(String ids)
    {
        return vitRolesMapper.deletevitRolesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除vitRoles信息
     * 
     * @param roleId vitRolesID
     * @return 结果
     */
    @Override
    public int deletevitRolesById(Long roleId)
    {
        return vitRolesMapper.deletevitRolesById(roleId);
    }

    /**
     * 查询vitRoles树列表
     * 
     * @return 所有vitRoles信息
     */
    @Override
    public List<Ztree> selectvitRolesTree()
    {
        List<vitRoles> vitRolesList = vitRolesMapper.selectvitRolesList(new vitRoles());
        List<Ztree> ztrees = new ArrayList<Ztree>();
        for (vitRoles vitRoles : vitRolesList)
        {
            Ztree ztree = new Ztree();
            ztree.setId(vitRoles.getRoleId());
            ztree.setpId(vitRoles.getParentId());
            ztree.setName(vitRoles.getRoleDescription());
            ztree.setTitle(vitRoles.getRoleDescription());
            ztrees.add(ztree);

        }
        return ztrees;
    }

    @Override
    public List<vitRoles> selectVitRolesAll(){
        return vitRolesMapper.selectVitRolesAll();
    }

    @Override
    public vitRoles selectVitRolesDescription(String roleDescription){
        return vitRolesMapper.selectVitRolesDescription(roleDescription);
    }

    @Override
    public List<vitRoles> selectVitRolesParentId(Long parentId){
        return vitRolesMapper.selectVitRolesParentId(parentId);
    }
}
