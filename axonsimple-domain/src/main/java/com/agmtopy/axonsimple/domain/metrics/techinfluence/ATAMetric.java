package com.agmtopy.axonsimple.domain.metrics.techinfluence;

import com.agmtopy.axonsimple.domain.metrics.*;

/**
 * ATA文章指标
 */
public class ATAMetric extends SubMetric {

    public ATAMetric(){
        this.subMetricType = SubMetricType.ATA;
    }

    public ATAMetric(MainMetric parent) {
        this.parent = parent;
        parent.addSubMetric(this);
        this.subMetricType = SubMetricType.ATA;
    }

    @Override
    public double getWeight() {
        return  parent.getMetricOwner().getWeight().getUnanimousWeight();
    }
}
