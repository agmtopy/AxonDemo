package com.agmtopy.axonsimple.domain.metrics;

import com.alibaba.cola.domain.EntityObject;
import com.alibaba.cola.logger.Logger;
import com.alibaba.cola.logger.LoggerFactory;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * MetricItem
 */
@Data
public abstract class MetricItem extends EntityObject implements Measurable{

    private static Logger logger = LoggerFactory.getLogger(MetricItem.class);

    /**
     * The metric this MetricItem belongs to
     */
    @JSONField(serialize = false)
    private SubMetric subMetric;

    public void setSubMetric(SubMetric subMetric){
        this.subMetric = subMetric;
    }
    /**
     * 将度量项的转成JSON
     * @return
     */
    public String toJsonString() {
        String jsonStr = JSON.toJSONString(this, JSONPropertyFilter.singleton);
        logger.debug("\n From : " + this + " \n To: " + jsonStr);
        return jsonStr;
    }

}
