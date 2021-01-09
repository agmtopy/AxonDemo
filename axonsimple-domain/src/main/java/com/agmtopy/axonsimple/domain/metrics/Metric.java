package com.agmtopy.axonsimple.domain.metrics;


import com.agmtopy.axonsimple.domain.user.UserProfile;
import com.alibaba.cola.domain.EntityObject;
import lombok.Getter;
import lombok.Setter;

/**
 * Metric 指标
 */
public abstract class Metric extends EntityObject implements Measurable{

    private double score;

    @Getter
    @Setter
    protected UserProfile metricOwner;

    public Metric(){

    }

    /**
     * 度量名称，用于UI显示
     */
    abstract public String getName();

    /**
     * 度量Code，用于数据库存储
     */
    abstract public String getCode();

    abstract public double getWeight();

    @Override
    public String toString(){
        return this.getName() + " " + this.score;
    }

}
