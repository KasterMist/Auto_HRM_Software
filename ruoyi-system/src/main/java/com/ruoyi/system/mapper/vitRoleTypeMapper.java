package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.vitRoleType;

/**
 * vitRoleTypeMapper接口
 * 
 * @author ruoyi
 * @date 2021-12-10
 */
public interface vitRoleTypeMapper 
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
     * 删除vitRoleType
     * 
     * @param roleTypeCode vitRoleTypeID
     * @return 结果
     */
    public int deletevitRoleTypeById(Long roleTypeCode);

    /**
     * 批量删除vitRoleType
     * 
     * @param roleTypeCodes 需要删除的数据ID
     * @return 结果
     */
    public int deletevitRoleTypeByIds(String[] roleTypeCodes);
}
