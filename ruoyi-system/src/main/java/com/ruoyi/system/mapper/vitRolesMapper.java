package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.vitRoles;

/**
 * vitRolesMapper接口
 * 
 * @author ruoyi
 * @date 2021-12-02
 */
public interface vitRolesMapper 
{
    /**
     * 查询vitRoles
     * 
     * @param roleId vitRolesID
     * @return vitRoles
     */
    public vitRoles selectvitRolesById(Long roleId);

    /**
     * 查询vitRoles列表
     * 
     * @param vitRoles vitRoles
     * @return vitRoles集合
     */
    public List<vitRoles> selectvitRolesList(vitRoles vitRoles);

    /**
     * 新增vitRoles
     * 
     * @param vitRoles vitRoles
     * @return 结果
     */
    public int insertvitRoles(vitRoles vitRoles);

    /**
     * 修改vitRoles
     * 
     * @param vitRoles vitRoles
     * @return 结果
     */
    public int updatevitRoles(vitRoles vitRoles);

    /**
     * 删除vitRoles
     * 
     * @param roleId vitRolesID
     * @return 结果
     */
    public int deletevitRolesById(Long roleId);

    /**
     * 批量删除vitRoles
     * 
     * @param roleIds 需要删除的数据ID
     * @return 结果
     */
    public int deletevitRolesByIds(String[] roleIds);

    public List<vitRoles> selectVitRolesAll();

    public vitRoles selectVitRolesDescription(String roleDescription);
}
