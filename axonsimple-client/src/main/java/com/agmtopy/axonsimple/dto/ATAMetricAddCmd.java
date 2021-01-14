package com.agmtopy.axonsimple.dto;

import com.agmtopy.axonsimple.dto.clientobject.ATAMetricCO;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * ATAMetricAddCmd
 */
@Data
public class ATAMetricAddCmd extends CommonCommand{
    @NotNull
    private ATAMetricCO ataMetricCO;
}
