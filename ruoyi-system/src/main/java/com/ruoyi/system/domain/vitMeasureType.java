package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * vitMeasureType对象 09_measure_type
 * 
 * @author ruoyi
 * @date 2021-12-14
 */
public class vitMeasureType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** measureTypeId */
    private Long measureTypeId;

    /** measureDescription */
    @Excel(name = "measureDescription")
    private String measureDescription;

    /** offWork */
    @Excel(name = "offWork")
    private String offWork;

    /** selfEffort */
    @Excel(name = "selfEffort")
    private String selfEffort;

    /** comment */
    @Excel(name = "comment")
    private String comment;

    public void setMeasureTypeId(Long measureTypeId) 
    {
        this.measureTypeId = measureTypeId;
    }

    public Long getMeasureTypeId() 
    {
        return measureTypeId;
    }
    public void setMeasureDescription(String measureDescription) 
    {
        this.measureDescription = measureDescription;
    }

    public String getMeasureDescription() 
    {
        return measureDescription;
    }
    public void setOffWork(String offWork) 
    {
        this.offWork = offWork;
    }

    public String getOffWork() 
    {
        return offWork;
    }
    public void setSelfEffort(String selfEffort) 
    {
        this.selfEffort = selfEffort;
    }

    public String getSelfEffort() 
    {
        return selfEffort;
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
            .append("measureTypeId", getMeasureTypeId())
            .append("measureDescription", getMeasureDescription())
            .append("offWork", getOffWork())
            .append("selfEffort", getSelfEffort())
            .append("comment", getComment())
            .toString();
    }
}
