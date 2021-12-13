package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.VitDepartment;

/**
 * VitDepartmentMapper接口
 * 
 * @author ruoyi
 * @date 2021-12-13
 */
public interface VitDepartmentMapper 
{
    /**
     * 查询VitDepartment
     * 
     * @param departmentId VitDepartmentID
     * @return VitDepartment
     */
    public VitDepartment selectVitDepartmentById(Long departmentId);

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
     * 删除VitDepartment
     * 
     * @param departmentId VitDepartmentID
     * @return 结果
     */
    public int deleteVitDepartmentById(Long departmentId);

    /**
     * 批量删除VitDepartment
     * 
     * @param departmentIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteVitDepartmentByIds(String[] departmentIds);

    public List<VitDepartment> selectVitDepartmentAll();

    public List<VitDepartment> selectVitDepartmentParentId(Long parentId);
}
