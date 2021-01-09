package com.agmtopy.axonsimple.domain.metrics;

import java.io.Serializable;

/**
 * Measurable 可度量的
 */
public interface Measurable extends Serializable{

    /**
     * 计算分数
     */
    double calculateScore();
}
