package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * vitCompetence对象 04_competence
 * 
 * @author ruoyi
 * @date 2021-12-02
 */
public class vitCompetence extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** viscountCompetenceCode */
    @Excel(name = "viscountCompetenceCode")
    private String viscountCompetenceCode;

    /** competenceDescription */
    @Excel(name = "competenceDescription")
    private String competenceDescription;

    /** titleCompetence */
    @Excel(name = "titleCompetence")
    private String titleCompetence;

    /** stdAutoCompetence */
    @Excel(name = "stdAutoCompetence")
    private String stdAutoCompetence;

    /** autoCompetenceCategoryId */
    @Excel(name = "autoCompetenceCategoryId")
    private Long autoCompetenceCategoryId;

    /** sapModuleId */
    @Excel(name = "sapModuleId")
    private Long sapModuleId;

    /** autoProcessId */
    @Excel(name = "autoProcessId")
    private Long autoProcessId;

    /** comment */
    @Excel(name = "comment")
    private String comment;

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
    public void setTitleCompetence(String titleCompetence) 
    {
        this.titleCompetence = titleCompetence;
    }

    public String getTitleCompetence() 
    {
        return titleCompetence;
    }
    public void setStdAutoCompetence(String stdAutoCompetence) 
    {
        this.stdAutoCompetence = stdAutoCompetence;
    }

    public String getStdAutoCompetence() 
    {
        return stdAutoCompetence;
    }
    public void setAutoCompetenceCategoryId(Long autoCompetenceCategoryId) 
    {
        this.autoCompetenceCategoryId = autoCompetenceCategoryId;
    }

    public Long getAutoCompetenceCategoryId() 
    {
        return autoCompetenceCategoryId;
    }
    public void setSapModuleId(Long sapModuleId) 
    {
        this.sapModuleId = sapModuleId;
    }

    public Long getSapModuleId() 
    {
        return sapModuleId;
    }
    public void setAutoProcessId(Long autoProcessId) 
    {
        this.autoProcessId = autoProcessId;
    }

    public Long getAutoProcessId() 
    {
        return autoProcessId;
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
            .append("viscountCompetenceCode", getViscountCompetenceCode())
            .append("competenceDescription", getCompetenceDescription())
            .append("titleCompetence", getTitleCompetence())
            .append("stdAutoCompetence", getStdAutoCompetence())
            .append("autoCompetenceCategoryId", getAutoCompetenceCategoryId())
            .append("sapModuleId", getSapModuleId())
            .append("autoProcessId", getAutoProcessId())
            .append("comment", getComment())
            .toString();
    }
}
