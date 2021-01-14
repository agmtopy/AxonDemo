package com.agmtopy.axonsimple.domain;

import com.agmtopy.axonsimple.domain.metrics.techinfluence.InfluenceMetric;

/**
 * 领域对象工厂
 */
public class DomainFactory {
    /**
     * 示例
     */
    public static InfluenceMetric getInfluenceMetric(){
        return new InfluenceMetric("示例");
    }

}
