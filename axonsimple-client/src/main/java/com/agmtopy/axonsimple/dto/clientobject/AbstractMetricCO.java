package com.agmtopy.axonsimple.dto.clientobject;

import com.alibaba.cola.dto.ClientObject;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * AbstractMetricCO
 */
@Data
public abstract class AbstractMetricCO extends ClientObject{
    /**
     * The ownerId of this Metric Item
     */
    @NotEmpty
    private String ownerId;
}
