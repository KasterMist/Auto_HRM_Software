package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

import com.ruoyi.common.core.domain.Ztree;
import com.ruoyi.system.domain.vitRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.VitDepartmentMapper;
import com.ruoyi.system.domain.VitDepartment;
import com.ruoyi.system.service.IVitDepartmentService;
import com.ruoyi.common.core.text.Convert;

/**
 * VitDepartmentService业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-13
 */
@Service
public class VitDepartmentServiceImpl implements IVitDepartmentService 
{
    @Autowired
    private VitDepartmentMapper vitDepartmentMapper;

    /**
     * 查询VitDepartment
     * 
     * @param departmentId VitDepartmentID
     * @return VitDepartment
     */
    @Override
    public VitDepartment selectVitDepartmentById(Long departmentId)
    {
        return vitDepartmentMapper.selectVitDepartmentById(departmentId);
    }

    /**
     * 查询VitDepartment列表
     * 
     * @param vitDepartment VitDepartment
     * @return VitDepartment
     */
    @Override
    public List<VitDepartment> selectVitDepartmentList(VitDepartment vitDepartment)
    {
        return vitDepartmentMapper.selectVitDepartmentList(vitDepartment);
    }

    /**
     * 新增VitDepartment
     * 
     * @param vitDepartment VitDepartment
     * @return 结果
     */
    @Override
    public int insertVitDepartment(VitDepartment vitDepartment)
    {
        Long parentID = vitDepartment.getParentId();
        List<VitDepartment> sameParentIdList = selectVitDepartmentParentId(parentID);
        int sizePlusOne = sameParentIdList.size();
        if(parentID == 0){
            vitDepartment.setDepartmentCode(sizePlusOne + ".0");
        }else{
            VitDepartment parentRole = selectVitDepartmentById(parentID);
            String targetIndex = "";
            int i = 1;
            while(true){
                boolean flag = true;
                for (VitDepartment department : sameParentIdList) {
                    String[] departmentIdList = department.getDepartmentCode().split("\\.");
                    String index = departmentIdList[departmentIdList.length - 1];
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
                vitDepartment.setDepartmentCode(parentRole.getDepartmentCode().split("\\.")[0] + "." + targetIndex);
            }else{
                vitDepartment.setDepartmentCode(parentRole.getDepartmentCode() + "." + targetIndex);
            }
        }


        return vitDepartmentMapper.insertVitDepartment(vitDepartment);
    }

    /**
     * 修改VitDepartment
     * 
     * @param vitDepartment VitDepartment
     * @return 结果
     */
    @Override
    public int updateVitDepartment(VitDepartment vitDepartment)
    {

        Long parentID = vitDepartment.getParentId();
        List<VitDepartment> sameParentIdList = selectVitDepartmentParentId(parentID);
        int sizePlusOne = sameParentIdList.size();

        for(VitDepartment isItself: sameParentIdList){
            if(Objects.equals(isItself.getDepartmentId(), vitDepartment.getDepartmentId())){
                vitDepartment.setDepartmentCode(isItself.getDepartmentCode());
                return vitDepartmentMapper.updateVitDepartment(vitDepartment);
            }
        }
        System.out.println("continue");


        if(parentID == 0){
            vitDepartment.setDepartmentCode(sizePlusOne + ".0");
        }else{
            VitDepartment parentRole = selectVitDepartmentById(parentID);
            String targetIndex = "";
            int i = 1;
            while(true){
                boolean flag = true;
                for (VitDepartment department : sameParentIdList) {
                    String[] departmentIdList = department.getDepartmentCode().split("\\.");
                    String index = departmentIdList[departmentIdList.length - 1];
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
                vitDepartment.setDepartmentCode(parentRole.getDepartmentCode().split("\\.")[0] + "." + targetIndex);
            }else{
                vitDepartment.setDepartmentCode(parentRole.getDepartmentCode() + "." + targetIndex);
            }
        }

        return vitDepartmentMapper.updateVitDepartment(vitDepartment);
    }

    /**
     * 删除VitDepartment对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteVitDepartmentByIds(String ids)
    {
        return vitDepartmentMapper.deleteVitDepartmentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除VitDepartment信息
     * 
     * @param departmentId VitDepartmentID
     * @return 结果
     */
    @Override
    public int deleteVitDepartmentById(Long departmentId)
    {
        return vitDepartmentMapper.deleteVitDepartmentById(departmentId);
    }


    @Override
    public List<VitDepartment> selectVitDepartmentAll(){
        return vitDepartmentMapper.selectVitDepartmentAll();
    }


    @Override
    public List<VitDepartment> selectVitDepartmentParentId(Long parentId){
        return vitDepartmentMapper.selectVitDepartmentParentId(parentId);
    }

    /**
     * 查询VitDepartment树列表
     * 
     * @return 所有VitDepartment信息
     */
    @Override
    public List<Ztree> selectVitDepartmentTree()
    {
        List<VitDepartment> vitDepartmentList = vitDepartmentMapper.selectVitDepartmentList(new VitDepartment());
        List<Ztree> ztrees = new ArrayList<Ztree>();
        for (VitDepartment vitDepartment : vitDepartmentList)
        {
            Ztree ztree = new Ztree();
            ztree.setId(vitDepartment.getDepartmentId());
            ztree.setpId(vitDepartment.getParentId());
            ztree.setName(vitDepartment.getDepartmentName());
            ztree.setTitle(vitDepartment.getDepartmentName());
            ztrees.add(ztree);
        }
        return ztrees;
    }
}
