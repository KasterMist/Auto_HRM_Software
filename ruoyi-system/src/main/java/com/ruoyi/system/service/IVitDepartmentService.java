package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.VitDepartment;

/**
 * VitDepartmentService接口
 * 
 * @author ruoyi
 * @date 2021-11-21
 */
public interface IVitDepartmentService 
{
    /**
     * 查询VitDepartment
     * 
     * @param departmentId VitDepartmentID
     * @return VitDepartment
     */
    public VitDepartment selectVitDepartmentById(Integer departmentId);

    /**
     * 查询VitDepartment列表
     * 
     * @param vitDepartment VitDepartment
     * @return VitDepartment集合
     */
    public List<VitDepartment> selectVitDepartmentList(VitDepartment vitDepartment);

    /**
     * 新增VitDepartment
     * 
     * @param vitDepartment VitDepartment
     * @return 结果
     */
    public int insertVitDepartment(VitDepartment vitDepartment);

    /**
     * 修改VitDepartment
     * 
     * @param vitDepartment VitDepartment
     * @return 结果
     */
    public int updateVitDepartment(VitDepartment vitDepartment);

    /**
     * 批量删除VitDepartment
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteVitDepartmentByIds(String ids);

    /**
     * 删除VitDepartment信息
     * 
     * @param departmentId VitDepartmentID
     * @return 结果
     */
    public int deleteVitDepartmentById(Integer departmentId);

    public List<VitDepartment> selectVitDepartmentAll();
}
