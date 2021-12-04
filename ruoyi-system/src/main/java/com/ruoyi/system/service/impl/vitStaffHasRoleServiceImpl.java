package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.vitStaffHasRoleMapper;
import com.ruoyi.system.domain.vitStaffHasRole;
import com.ruoyi.system.service.IvitStaffHasRoleService;
import com.ruoyi.common.core.text.Convert;

/**
 * vitStaffHasRoleService业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-04
 */
@Service
public class vitStaffHasRoleServiceImpl implements IvitStaffHasRoleService 
{
    @Autowired
    private vitStaffHasRoleMapper vitStaffHasRoleMapper;

    /**
     * 查询vitStaffHasRole
     * 
     * @param name vitStaffHasRoleID
     * @return vitStaffHasRole
     */
    @Override
    public vitStaffHasRole selectvitStaffHasRoleById(String name)
    {
        return vitStaffHasRoleMapper.selectvitStaffHasRoleById(name);
    }

    /**
     * 查询vitStaffHasRole列表
     * 
     * @param vitStaffHasRole vitStaffHasRole
     * @return vitStaffHasRole
     */
    @Override
    public List<vitStaffHasRole> selectvitStaffHasRoleList(vitStaffHasRole vitStaffHasRole)
    {
        return vitStaffHasRoleMapper.selectvitStaffHasRoleList(vitStaffHasRole);
    }

    /**
     * 新增vitStaffHasRole
     * 
     * @param vitStaffHasRole vitStaffHasRole
     * @return 结果
     */
    @Override
    public int insertvitStaffHasRole(vitStaffHasRole vitStaffHasRole)
    {
        return vitStaffHasRoleMapper.insertvitStaffHasRole(vitStaffHasRole);
    }

    /**
     * 修改vitStaffHasRole
     * 
     * @param vitStaffHasRole vitStaffHasRole
     * @return 结果
     */
    @Override
    public int updatevitStaffHasRole(vitStaffHasRole vitStaffHasRole)
    {
        return vitStaffHasRoleMapper.updatevitStaffHasRole(vitStaffHasRole);
    }

    /**
     * 删除vitStaffHasRole对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletevitStaffHasRoleByIds(String ids)
    {
        return vitStaffHasRoleMapper.deletevitStaffHasRoleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除vitStaffHasRole信息
     * 
     * @param name vitStaffHasRoleID
     * @return 结果
     */
    @Override
    public int deletevitStaffHasRoleById(String name)
    {
        return vitStaffHasRoleMapper.deletevitStaffHasRoleById(name);
    }
}
