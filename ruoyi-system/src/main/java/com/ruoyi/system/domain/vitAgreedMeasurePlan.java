package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * vitAgreedMeasurePlan对象 12_agreed_measure_plan
 * 
 * @author ruoyi
 * @date 2021-12-18
 */
public class vitAgreedMeasurePlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** measurePlanId */
    private Long measurePlanId;

    /** code */
    @Excel(name = "code")
    private String code;

    /** viscountCompetenceCode */
    @Excel(name = "viscountCompetenceCode")
    private String viscountCompetenceCode;

    /** measureTypeSingle */
    @Excel(name = "measureTypeSingle")
    private Long measureTypeSingle;

    /** measureTarget */
    @Excel(name = "measureTarget")
    private String measureTarget;

    /** measureContent */
    @Excel(name = "measureContent")
    private String measureContent;

    /** comment */
    @Excel(name = "comment")
    private String comment;

    /** plannedTime */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "plannedTime", width = 30, dateFormat = "yyyy-MM-dd")
    private Date plannedTime;

    /** executedTime */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "executedTime", width = 30, dateFormat = "yyyy-MM-dd")
    private Date executedTime;

    /** location */
    @Excel(name = "location")
    private String location;

    public void setMeasurePlanId(Long measurePlanId) 
    {
        this.measurePlanId = measurePlanId;
    }

    public Long getMeasurePlanId() 
    {
        return measurePlanId;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setViscountCompetenceCode(String viscountCompetenceCode) 
    {
        this.viscountCompetenceCode = viscountCompetenceCode;
    }

    public String getViscountCompetenceCode() 
    {
        return viscountCompetenceCode;
    }
    public void setMeasureTypeSingle(Long measureTypeSingle) 
    {
        this.measureTypeSingle = measureTypeSingle;
    }

    public Long getMeasureTypeSingle() 
    {
        return measureTypeSingle;
    }
    public void setMeasureTarget(String measureTarget) 
    {
        this.measureTarget = measureTarget;
    }

    public String getMeasureTarget() 
    {
        return measureTarget;
    }
    public void setMeasureContent(String measureContent) 
    {
        this.measureContent = measureContent;
    }

    public String getMeasureContent() 
    {
        return measureContent;
    }
    public void setComment(String comment) 
    {
        this.comment = comment;
    }

    public String getComment() 
    {
        return comment;
    }
    public void setPlannedTime(Date plannedTime) 
    {
        this.plannedTime = plannedTime;
    }

    public Date getPlannedTime() 
    {
        return plannedTime;
    }
    public void setExecutedTime(Date executedTime) 
    {
        this.executedTime = executedTime;
    }

    public Date getExecutedTime() 
    {
        return executedTime;
    }
    public void setLocation(String location) 
    {
        this.location = location;
    }

    public String getLocation() 
    {
        return location;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("measurePlanId", getMeasurePlanId())
            .append("code", getCode())
            .append("viscountCompetenceCode", getViscountCompetenceCode())
            .append("measureTypeSingle", getMeasureTypeSingle())
            .append("measureTarget", getMeasureTarget())
            .append("measureContent", getMeasureContent())
            .append("comment", getComment())
            .append("plannedTime", getPlannedTime())
            .append("executedTime", getExecutedTime())
            .append("location", getLocation())
            .toString();
    }
}
