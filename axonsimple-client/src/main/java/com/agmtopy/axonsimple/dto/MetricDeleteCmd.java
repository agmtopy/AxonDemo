package com.agmtopy.axonsimple.dto;

import lombok.Data;

/**
 * MetricDeleteCmd
 */
@Data
public class MetricDeleteCmd extends CommonCommand{
    /**
     * Metric ID
     */
    private String metricId;
}
