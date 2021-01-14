package com.agmtopy.axonsimple.domain.metrics.techinfluence;

import com.agmtopy.axonsimple.domain.metrics.MainMetric;
import com.agmtopy.axonsimple.domain.metrics.MainMetricType;
import lombok.Data;

/**
 * InfluenceMetric
 * 影响力指标
 */
@Data
public class InfluenceMetric extends MainMetric {

    private ATAMetric ataMetric;

    public InfluenceMetric(String ownerId){
        super.ownerId = ownerId;
        this.metricMainType = MainMetricType.TECH_INFLUENCE;
    }
}
