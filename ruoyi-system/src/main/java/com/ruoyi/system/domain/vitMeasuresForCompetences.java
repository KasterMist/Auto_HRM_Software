package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * vitMeasuresForCompetences对象 11_standard_measures_for_competences
 * 
 * @author ruoyi
 * @date 2021-12-15
 */
public class vitMeasuresForCompetences extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** viscountCompetenceId */
    private Long viscountCompetenceId;

    /** viscountCompetenceCode */
    private String viscountCompetenceCode;

    /** competenceDescription */
    @Excel(name = "competenceDescription")
    private String competenceDescription;

    /** target */
    @Excel(name = "target")
    private Long target;

    /** measureTypeCode */
    @Excel(name = "measureTypeCode")
    private Long measureTypeCode;

    /** comment */
    @Excel(name = "comment")
    private String comment;

    /** active */
    @Excel(name = "active")
    private String active;

    public void setViscountCompetenceId(Long viscountCompetenceId) 
    {
        this.viscountCompetenceId = viscountCompetenceId;
    }

    public Long getViscountCompetenceId() 
    {
        return viscountCompetenceId;
    }
    public void setViscountCompetenceCode(String viscountCompetenceCode) 
    {
        this.viscountCompetenceCode = viscountCompetenceCode;
    }

    public String getViscountCompetenceCode() 
    {
        return viscountCompetenceCode;
    }
    public void setCompetenceDescription(String competenceDescription) 
    {
        this.competenceDescription = competenceDescription;
    }

    public String getCompetenceDescription() 
    {
        return competenceDescription;
    }
    public void setTarget(Long target) 
    {
        this.target = target;
    }

    public Long getTarget() 
    {
        return target;
    }
    public void setMeasureTypeCode(Long measureTypeCode) 
    {
        this.measureTypeCode = measureTypeCode;
    }

    public Long getMeasureTypeCode() 
    {
        return measureTypeCode;
    }
    public void setComment(String comment) 
    {
        this.comment = comment;
    }

    public String getComment() 
    {
        return comment;
    }
    public void setActive(String active) 
    {
        this.active = active;
    }

    public String getActive() 
    {
        return active;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("viscountCompetenceId", getViscountCompetenceId())
            .append("viscountCompetenceCode", getViscountCompetenceCode())
            .append("competenceDescription", getCompetenceDescription())
            .append("target", getTarget())
            .append("measureTypeCode", getMeasureTypeCode())
            .append("comment", getComment())
            .append("active", getActive())
            .toString();
    }
}
