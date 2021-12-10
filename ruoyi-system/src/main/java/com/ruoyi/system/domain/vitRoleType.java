package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * vitRoleType对象 19_role_type
 * 
 * @author ruoyi
 * @date 2021-12-10
 */
public class vitRoleType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** roleTypeCode */
    @Excel(name = "roleTypeCode")
    private Long roleTypeCode;

    /** roleTypeDescription */
    @Excel(name = "roleTypeDescription")
    private String roleTypeDescription;

    public void setRoleTypeCode(Long roleTypeCode) 
    {
        this.roleTypeCode = roleTypeCode;
    }

    public Long getRoleTypeCode() 
    {
        return roleTypeCode;
    }
    public void setRoleTypeDescription(String roleTypeDescription) 
    {
        this.roleTypeDescription = roleTypeDescription;
    }

    public String getRoleTypeDescription() 
    {
        return roleTypeDescription;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("roleTypeCode", getRoleTypeCode())
            .append("roleTypeDescription", getRoleTypeDescription())
            .toString();
    }
}
