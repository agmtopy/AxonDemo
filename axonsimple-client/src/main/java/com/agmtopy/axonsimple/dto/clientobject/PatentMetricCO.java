package com.agmtopy.axonsimple.dto.clientobject;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * PatentMetricCO
 */
@Data
public class PatentMetricCO  extends AbstractMetricCO {
    public static final String FIRST_AUTHOR_TYPE = "FIRST_AUTHOR";
    public static final String OTHER_AUTHOR_TYPE = "OTHER_AUTHOR";

    @NotEmpty
    private String patentName;
    private String patentDesc;
    private String patentNo;
    private String patentUrl;
    private String authorType;
}
