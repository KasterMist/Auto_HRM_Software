package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.vitStaffHasRole;

/**
 * vitStaffHasRoleService接口
 * 
 * @author ruoyi
 * @date 2021-12-05
 */
public interface IvitStaffHasRoleService 
{
    /**
     * 查询vitStaffHasRole
     * 
     * @param staffHasRoleId vitStaffHasRoleID
     * @return vitStaffHasRole
     */
    public vitStaffHasRole selectvitStaffHasRoleById(Long staffHasRoleId);

    /**
     * 查询vitStaffHasRole列表
     * 
     * @param vitStaffHasRole vitStaffHasRole
     * @return vitStaffHasRole集合
     */
    public List<vitStaffHasRole> selectvitStaffHasRoleList(vitStaffHasRole vitStaffHasRole);

    /**
     * 新增vitStaffHasRole
     * 
     * @param vitStaffHasRole vitStaffHasRole
     * @return 结果
     */
    public int insertvitStaffHasRole(vitStaffHasRole vitStaffHasRole);

    /**
     * 修改vitStaffHasRole
     * 
     * @param vitStaffHasRole vitStaffHasRole
     * @return 结果
     */
    public int updatevitStaffHasRole(vitStaffHasRole vitStaffHasRole);

    /**
     * 批量删除vitStaffHasRole
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletevitStaffHasRoleByIds(String ids);

    /**
     * 删除vitStaffHasRole信息
     * 
     * @param staffHasRoleId vitStaffHasRoleID
     * @return 结果
     */
    public int deletevitStaffHasRoleById(Long staffHasRoleId);
}
