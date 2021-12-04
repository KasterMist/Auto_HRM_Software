package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.List;

/**
 * vitStaff对象 01_staff
 * 
 * @author ruoyi
 * @date 2021-12-04
 */
public class vitStaff extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** staffId */
    private Long staffId;

    /** name */
    @Excel(name = "name")
    private String name;

    /** code */
    private String code;

    /** department */
    @Excel(name = "department")
    private String department;

    /** employeeId */
    @Excel(name = "employeeId")
    private String employeeId;

    /** emailAddress */
    @Excel(name = "emailAddress")
    private String emailAddress;

    /** authority */
    @Excel(name = "authority")
    private String authority;

    public void setStaffId(Long staffId)
    {
        this.staffId = staffId;
    }

    public Long getStaffId() 
    {
        return staffId;
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
    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getDepartment() 
    {
        return department;
    }
    public void setEmployeeId(String employeeId) 
    {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() 
    {
        return employeeId;
    }
    public void setEmailAddress(String emailAddress) 
    {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() 
    {
        return emailAddress;
    }
    public void setAuthority(String authority) 
    {
        this.authority = authority;
    }

    public String getAuthority() 
    {
        return authority;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("staffId", getStaffId())
            .append("name", getName())
            .append("code", getCode())
            .append("department", getDepartment())
            .append("employeeId", getEmployeeId())
            .append("emailAddress", getEmailAddress())
            .append("authority", getAuthority())
            .toString();
    }
}
