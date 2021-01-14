package com.agmtopy.axonsimple.convertor;

import com.agmtopy.axonsimple.domain.metrics.MetricItem;
import com.agmtopy.axonsimple.gatewayimpl.database.dataobject.MetricDO;

/**
 * 领域对象转换成为具体的PO对象
 */
public class MetricConvertor{

    public static MetricDO toDataObject(MetricItem metricItem){
        MetricDO metricDO = new MetricDO();
        metricDO.setMainMetric(metricItem.getSubMetric().getParent().getCode());
        metricDO.setSubMetric(metricItem.getSubMetric().getCode());
        metricDO.setMetricItem(metricItem.toJsonString());
        return metricDO;
    }
}
