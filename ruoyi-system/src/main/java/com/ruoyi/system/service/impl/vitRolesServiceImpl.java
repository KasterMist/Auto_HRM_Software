package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.vitRolesMapper;
import com.ruoyi.system.domain.vitRoles;
import com.ruoyi.system.service.IvitRolesService;
import com.ruoyi.common.core.text.Convert;

/**
 * vitRolesService业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-02
 */
@Service
public class vitRolesServiceImpl implements IvitRolesService 
{
    @Autowired
    private vitRolesMapper vitRolesMapper;

    /**
     * 查询vitRoles
     * 
     * @param roleId vitRolesID
     * @return vitRoles
     */
    @Override
    public vitRoles selectvitRolesById(Long roleId)
    {
        return vitRolesMapper.selectvitRolesById(roleId);
    }

    /**
     * 查询vitRoles列表
     * 
     * @param vitRoles vitRoles
     * @return vitRoles
     */
    @Override
    public List<vitRoles> selectvitRolesList(vitRoles vitRoles)
    {
        return vitRolesMapper.selectvitRolesList(vitRoles);
    }

    /**
     * 新增vitRoles
     * 
     * @param vitRoles vitRoles
     * @return 结果
     */
    @Override
    public int insertvitRoles(vitRoles vitRoles)
    {
        return vitRolesMapper.insertvitRoles(vitRoles);
    }

    /**
     * 修改vitRoles
     * 
     * @param vitRoles vitRoles
     * @return 结果
     */
    @Override
    public int updatevitRoles(vitRoles vitRoles)
    {
        return vitRolesMapper.updatevitRoles(vitRoles);
    }

    /**
     * 删除vitRoles对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletevitRolesByIds(String ids)
    {
        return vitRolesMapper.deletevitRolesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除vitRoles信息
     * 
     * @param roleId vitRolesID
     * @return 结果
     */
    @Override
    public int deletevitRolesById(Long roleId)
    {
        return vitRolesMapper.deletevitRolesById(roleId);
    }
}
