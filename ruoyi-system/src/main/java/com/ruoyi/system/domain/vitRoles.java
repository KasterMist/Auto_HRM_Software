package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.TreeEntity;

/**
 * vitRoles对象 02_roles
 * 
 * @author ruoyi
 * @date 2021-12-08
 */
public class vitRoles extends TreeEntity
{
    private static final long serialVersionUID = 1L;

    /** roleID */
    private Long roleId;

    /** viscountRolesId */
    @Excel(name = "viscountRolesId")
    private String viscountRolesId;

    /** roleDescription */
    @Excel(name = "roleDescription")
    private String roleDescription;

    /** autoRoleBreakdown */
    @Excel(name = "autoRoleBreakdown")
    private Long autoRoleBreakdown;

    public void setRoleId(Long roleId) 
    {
        this.roleId = roleId;
    }

    public Long getRoleId() 
    {
        return roleId;
    }
    public void setViscountRolesId(String viscountRolesId) 
    {
        this.viscountRolesId = viscountRolesId;
    }

    public String getViscountRolesId() 
    {
        return viscountRolesId;
    }
    public void setRoleDescription(String roleDescription) 
    {
        this.roleDescription = roleDescription;
    }

    public String getRoleDescription() 
    {
        return roleDescription;
    }
    public void setAutoRoleBreakdown(Long autoRoleBreakdown) 
    {
        this.autoRoleBreakdown = autoRoleBreakdown;
    }

    public Long getAutoRoleBreakdown() 
    {
        return autoRoleBreakdown;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("roleId", getRoleId())
            .append("viscountRolesId", getViscountRolesId())
            .append("parentId", getParentId())
            .append("roleDescription", getRoleDescription())
            .append("autoRoleBreakdown", getAutoRoleBreakdown())
            .toString();
    }
}
