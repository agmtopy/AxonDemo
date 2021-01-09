package com.agmtopy.axonsimple.domain.metrics.weight;

/**
 * Weight 权重
 *
 * @author Frank Zhang
 * @date 2018-09-13 12:13 PM
 */
public abstract class Weight {

    public static double WEIGHT_PERCENTAGE = 100;

    public abstract double getTechInfluenceWeight();

    public double getUnanimousWeight(){
        return 100/WEIGHT_PERCENTAGE;
    }

}
