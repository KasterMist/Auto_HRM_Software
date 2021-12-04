package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.vitStaffHasRole;

/**
 * vitStaffHasRoleMapper接口
 * 
 * @author ruoyi
 * @date 2021-12-04
 */
public interface vitStaffHasRoleMapper 
{
    /**
     * 查询vitStaffHasRole
     * 
     * @param name vitStaffHasRoleID
     * @return vitStaffHasRole
     */
    public vitStaffHasRole selectvitStaffHasRoleById(String name);

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
     * 删除vitStaffHasRole
     * 
     * @param name vitStaffHasRoleID
     * @return 结果
     */
    public int deletevitStaffHasRoleById(String name);

    /**
     * 批量删除vitStaffHasRole
     * 
     * @param names 需要删除的数据ID
     * @return 结果
     */
    public int deletevitStaffHasRoleByIds(String[] names);
}
