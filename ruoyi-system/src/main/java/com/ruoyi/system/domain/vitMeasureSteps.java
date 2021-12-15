package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * vitMeasureSteps对象 10_measure_steps
 * 
 * @author ruoyi
 * @date 2021-12-14
 */
public class vitMeasureSteps extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** measureId */
    private Long measureId;

    /** target */
    @Excel(name = "target")
    private String target;

    public void setMeasureId(Long measureId) 
    {
        this.measureId = measureId;
    }

    public Long getMeasureId() 
    {
        return measureId;
    }
    public void setTarget(String target) 
    {
        this.target = target;
    }

    public String getTarget() 
    {
        return target;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("measureId", getMeasureId())
            .append("target", getTarget())
            .toString();
    }
}
