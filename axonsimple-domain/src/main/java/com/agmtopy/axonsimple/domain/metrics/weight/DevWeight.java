package com.agmtopy.axonsimple.domain.metrics.weight;

/**
 * 开发的总分计算权重
 */
public class DevWeight extends Weight{

    public static DevWeight singleton= new DevWeight();

    @Override
    public double getTechInfluenceWeight() {
        return 30 / WEIGHT_PERCENTAGE;
    }
}
