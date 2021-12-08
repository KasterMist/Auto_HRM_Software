package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.vitRoles;
import com.ruoyi.common.core.domain.Ztree;

/**
 * vitRolesService接口
 * 
 * @author ruoyi
 * @date 2021-12-08
 */
public interface IvitRolesService 
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
     * 批量删除vitRoles
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletevitRolesByIds(String ids);

    /**
     * 删除vitRoles信息
     * 
     * @param roleId vitRolesID
     * @return 结果
     */
    public int deletevitRolesById(Long roleId);

    /**
     * 查询vitRoles树列表
     * 
     * @return 所有vitRoles信息
     */
    public List<Ztree> selectvitRolesTree();

    public List<vitRoles> selectVitRolesAll();

    public vitRoles selectVitRolesDescription(String roleDescription);

    public List<vitRoles> selectVitRolesParentId(Long parentId);
}
