package com.agmtopy.axonsimple.domain.gateway;

import com.agmtopy.axonsimple.domain.metrics.MetricItem;

/**
 * MetricGateway
 */
public interface MetricGateway {
    void save(MetricItem metricItem);
}
