package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * vitStaffHasRole对象 03_staff_has_role
 * 
 * @author ruoyi
 * @date 2021-12-05
 */
public class vitStaffHasRole extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** staffHasRoleId */
    private Long staffHasRoleId;

    /** name */
    @Excel(name = "name")
    private String name;

    /** code */
    private String code;

    /** viscountRolesId */
    private String viscountRolesId;

    /** roleDescription */
    @Excel(name = "roleDescription")
    private String roleDescription;

    /** active */
    @Excel(name = "active")
    private String active;

    /** roleTypeCode */
    @Excel(name = "roleTypeCode")
    private Long roleTypeCode;

    /** comment */
    @Excel(name = "comment")
    private String comment;

    public void setStaffHasRoleId(Long staffHasRoleId) 
    {
        this.staffHasRoleId = staffHasRoleId;
    }

    public Long getStaffHasRoleId() 
    {
        return staffHasRoleId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
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
    public void setActive(String active) 
    {
        this.active = active;
    }

    public String getActive() 
    {
        return active;
    }
    public void setRoleTypeCode(Long roleTypeCode) 
    {
        this.roleTypeCode = roleTypeCode;
    }

    public Long getRoleTypeCode() 
    {
        return roleTypeCode;
    }
    public void setComment(String comment) 
    {
        this.comment = comment;
    }

    public String getComment() 
    {
        return comment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("staffHasRoleId", getStaffHasRoleId())
            .append("name", getName())
            .append("code", getCode())
            .append("viscountRolesId", getViscountRolesId())
            .append("roleDescription", getRoleDescription())
            .append("active", getActive())
            .append("roleTypeCode", getRoleTypeCode())
            .append("comment", getComment())
            .toString();
    }
}
