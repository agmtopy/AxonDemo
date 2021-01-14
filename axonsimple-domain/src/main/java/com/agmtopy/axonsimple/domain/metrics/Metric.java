package com.agmtopy.axonsimple.domain.metrics;


import com.alibaba.cola.domain.EntityObject;

/**
 * Metric 指标
 */
public abstract class Metric extends EntityObject implements Measurable{

    /**
     * 度量名称，用于UI显示
     */
    abstract public String getName();

    /**
     * 度量Code，用于数据库存储
     */
    abstract public String getCode();

    @Override
    public String toString(){
        return this.getName();
    }

}
