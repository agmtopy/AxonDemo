package com.agmtopy.axonsimple.dto;

import com.agmtopy.axonsimple.dto.clientobject.PaperMetricCO;
import com.agmtopy.axonsimple.dto.clientobject.PatentMetricCO;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * PaperMetricAddCmd
 *
 * @author Frank Zhang
 * @date 2019-03-03 11:38 AM
 */
@Data
public class PaperMetricAddCmd extends CommonCommand{
    @NotNull
    private PaperMetricCO paperMetricCO;
}