package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.vitRoleType;

/**
 * vitRoleTypeService接口
 * 
 * @author ruoyi
 * @date 2021-12-10
 */
public interface IvitRoleTypeService 
{
    /**
     * 查询vitRoleType
     * 
     * @param roleTypeCode vitRoleTypeID
     * @return vitRoleType
     */
    public vitRoleType selectvitRoleTypeById(Long roleTypeCode);

    /**
     * 查询vitRoleType列表
     * 
     * @param vitRoleType vitRoleType
     * @return vitRoleType集合
     */
    public List<vitRoleType> selectvitRoleTypeList(vitRoleType vitRoleType);

    /**
     * 新增vitRoleType
     * 
     * @param vitRoleType vitRoleType
     * @return 结果
     */
    public int insertvitRoleType(vitRoleType vitRoleType);

    /**
     * 修改vitRoleType
     * 
     * @param vitRoleType vitRoleType
     * @return 结果
     */
    public int updatevitRoleType(vitRoleType vitRoleType);

    /**
     * 批量删除vitRoleType
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletevitRoleTypeByIds(String ids);

    /**
     * 删除vitRoleType信息
     * 
     * @param roleTypeCode vitRoleTypeID
     * @return 结果
     */
    public int deletevitRoleTypeById(Long roleTypeCode);

    public List<vitRoleType> selectvitRoleTypeAll();
}
