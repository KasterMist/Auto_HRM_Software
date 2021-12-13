package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.TreeEntity;

/**
 * VitDepartment对象 23_department
 * 
 * @author ruoyi
 * @date 2021-12-13
 */
public class VitDepartment extends TreeEntity
{
    private static final long serialVersionUID = 1L;

    /** Department ID */
    private Long departmentId;

    /** Department Code */
    private String departmentCode;

    /** Department Name */
    @Excel(name = "Department Name")
    private String departmentName;

    /** Comment */
    @Excel(name = "Comment")
    private String comment;

    public void setDepartmentId(Long departmentId) 
    {
        this.departmentId = departmentId;
    }

    public Long getDepartmentId() 
    {
        return departmentId;
    }
    public void setDepartmentCode(String departmentCode) 
    {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentCode() 
    {
        return departmentCode;
    }
    public void setDepartmentName(String departmentName) 
    {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() 
    {
        return departmentName;
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
            .append("departmentId", getDepartmentId())
            .append("departmentCode", getDepartmentCode())
            .append("parentId", getParentId())
            .append("departmentName", getDepartmentName())
            .append("comment", getComment())
            .toString();
    }
}
