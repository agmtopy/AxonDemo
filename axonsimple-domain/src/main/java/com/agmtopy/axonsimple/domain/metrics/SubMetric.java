package com.agmtopy.axonsimple.domain.metrics;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Sub Metric,  一个主度量（MainMetric）可以有一个或者多个子度量（SubMetric）组成的。
 */
@Data
public abstract class SubMetric extends Metric {

    protected SubMetricType subMetricType;

    protected MainMetric parent;

    @Getter
    private List<MetricItem> metricItemList = new ArrayList<>();

    public SubMetric(){

    }

    /**
     * set 父类
     */
    public void setParent(MainMetric parent){
        this.parent = parent;
        parent.addSubMetric(this);
    }

    /**
     * 增加元素
     */
    public void addMetricItem(MetricItem metricItem){
        metricItemList.add(metricItem);
    }

    @Override
    public String getName() {
        return subMetricType.getMetricSubTypeName();
    }

    @Override
    public String getCode(){
        return subMetricType.getMetricSubTypeCode();
    }

    @Override
    public double calculateScore() {
        double subMetricScore = 0;
        for (MetricItem metricItem : metricItemList) {
            subMetricScore = subMetricScore + metricItem.calculateScore();
        }
        return subMetricScore;
    }
}
