package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * vitRolesHasCompetenceTarget对象 05_roles_has_competence_target
 * 
 * @author ruoyi
 * @date 2021-12-07
 */
public class vitRolesHasCompetenceTarget extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** rolesHasCompetenceTargetId */
    private Long rolesHasCompetenceTargetId;

    /** viscountRolesId */
    private String viscountRolesId;

    /** rolesDescription */
    @Excel(name = "rolesDescription")
    private String rolesDescription;

    /** viscountCompetenceCode */
    private String viscountCompetenceCode;

    /** competenceDescription */
    @Excel(name = "competenceDescription")
    private String competenceDescription;

    /** targetValue */
    @Excel(name = "targetValue")
    private Long targetValue;

    public void setRolesHasCompetenceTargetId(Long rolesHasCompetenceTargetId) 
    {
        this.rolesHasCompetenceTargetId = rolesHasCompetenceTargetId;
    }

    public Long getRolesHasCompetenceTargetId() 
    {
        return rolesHasCompetenceTargetId;
    }
    public void setViscountRolesId(String viscountRolesId) 
    {
        this.viscountRolesId = viscountRolesId;
    }

    public String getViscountRolesId() 
    {
        return viscountRolesId;
    }
    public void setRolesDescription(String rolesDescription) 
    {
        this.rolesDescription = rolesDescription;
    }

    public String getRolesDescription() 
    {
        return rolesDescription;
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
    public void setTargetValue(Long targetValue) 
    {
        this.targetValue = targetValue;
    }

    public Long getTargetValue() 
    {
        return targetValue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("rolesHasCompetenceTargetId", getRolesHasCompetenceTargetId())
            .append("viscountRolesId", getViscountRolesId())
            .append("rolesDescription", getRolesDescription())
            .append("viscountCompetenceCode", getViscountCompetenceCode())
            .append("competenceDescription", getCompetenceDescription())
            .append("targetValue", getTargetValue())
            .toString();
    }
}
