package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.vitRoles;
import com.ruoyi.system.domain.vitStaff;
import com.ruoyi.system.mapper.vitRolesMapper;
import com.ruoyi.system.mapper.vitStaffMapper;
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
 * @date 2021-12-05
 */
@Service
public class vitStaffHasRoleServiceImpl implements IvitStaffHasRoleService 
{
    @Autowired
    private vitStaffHasRoleMapper vitStaffHasRoleMapper;

    @Autowired
    private vitStaffMapper vitstaffMapper;

    @Autowired
    private vitRolesMapper vitrolesMapper;

    /**
     * 查询vitStaffHasRole
     * 
     * @param staffHasRoleId vitStaffHasRoleID
     * @return vitStaffHasRole
     */
    @Override
    public vitStaffHasRole selectvitStaffHasRoleById(Long staffHasRoleId)
    {
        return vitStaffHasRoleMapper.selectvitStaffHasRoleById(staffHasRoleId);
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
        vitStaff staff = vitstaffMapper.selectvitStaffByName(vitStaffHasRole.getName());
//        System.out.println(vitStaffHasRole.getRoleDescription());
        vitRoles role = vitrolesMapper.selectVitRolesDescription(vitStaffHasRole.getRoleDescription());
        vitStaffHasRole.setCode(staff.getCode());
        vitStaffHasRole.setViscountRolesId(role.getViscountRolesId());
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
        vitStaff staff = vitstaffMapper.selectvitStaffByName(vitStaffHasRole.getName());
        vitRoles role = vitrolesMapper.selectVitRolesDescription(vitStaffHasRole.getRoleDescription());
        vitStaffHasRole.setCode(staff.getCode());
        vitStaffHasRole.setViscountRolesId(role.getViscountRolesId());
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
     * @param staffHasRoleId vitStaffHasRoleID
     * @return 结果
     */
    @Override
    public int deletevitStaffHasRoleById(Long staffHasRoleId)
    {
        return vitStaffHasRoleMapper.deletevitStaffHasRoleById(staffHasRoleId);
    }

    @Override
    public List<vitStaffHasRole> selectvitStaffHasRoleByName(String name){
        return vitStaffHasRoleMapper.selectvitStaffHasRoleByName(name);
    }
}
