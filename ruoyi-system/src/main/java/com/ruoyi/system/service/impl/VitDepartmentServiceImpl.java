package com.ruoyi.system.service.impl;

import java.util.List;
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
 * @date 2021-11-21
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
    public VitDepartment selectVitDepartmentById(Integer departmentId)
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
    public int deleteVitDepartmentById(Integer departmentId)
    {
        return vitDepartmentMapper.deleteVitDepartmentById(departmentId);
    }
}
