package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * vitCurrentCompetence对象 06_current_competence
 * 
 * @author ruoyi
 * @date 2021-12-11
 */
public class vitCurrentCompetence extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** currentCompetenceId */
    private Long currentCompetenceId;

    /** name */
    @Excel(name = "name")
    private String name;

    /** code */
    private String code;

    /** viscountCompetenceCode */
    private String viscountCompetenceCode;

    /** competenceDescription */
    @Excel(name = "competenceDescription")
    private String competenceDescription;

    /** theCurrentValue */
    @Excel(name = "theCurrentValue")
    private Long theCurrentValue;

    /** theLastValue */
    @Excel(name = "theLastValue")
    private Long theLastValue;

    /** comment */
    @Excel(name = "comment")
    private String comment;

    public void setCurrentCompetenceId(Long currentCompetenceId) 
    {
        this.currentCompetenceId = currentCompetenceId;
    }

    public Long getCurrentCompetenceId() 
    {
        return currentCompetenceId;
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
    public void setTheCurrentValue(Long theCurrentValue) 
    {
        this.theCurrentValue = theCurrentValue;
    }

    public Long getTheCurrentValue() 
    {
        return theCurrentValue;
    }
    public void setTheLastValue(Long theLastValue) 
    {
        this.theLastValue = theLastValue;
    }

    public Long getTheLastValue() 
    {
        return theLastValue;
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
            .append("currentCompetenceId", getCurrentCompetenceId())
            .append("name", getName())
            .append("code", getCode())
            .append("viscountCompetenceCode", getViscountCompetenceCode())
            .append("competenceDescription", getCompetenceDescription())
            .append("theCurrentValue", getTheCurrentValue())
            .append("theLastValue", getTheLastValue())
            .append("comment", getComment())
            .toString();
    }
}
