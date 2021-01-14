package com.agmtopy.axonsimple.command;

import com.agmtopy.axonsimple.domain.gateway.MetricGateway;
import com.agmtopy.axonsimple.domain.metrics.techinfluence.ATAMetric;
import com.agmtopy.axonsimple.domain.metrics.techinfluence.ATAMetricItem;
import com.agmtopy.axonsimple.domain.metrics.techinfluence.InfluenceMetric;
import com.agmtopy.axonsimple.dto.ATAMetricAddCmd;
import com.alibaba.cola.dto.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 新增
 */
@Component
public class ATAMetricAddCmdExe{

    @Autowired
    private MetricGateway metricGateway;

    public Response execute(ATAMetricAddCmd cmd) {
        ATAMetricItem ataMetricItem = new ATAMetricItem();
        BeanUtils.copyProperties(cmd.getAtaMetricCO(), ataMetricItem);
        ataMetricItem.setSubMetric(new ATAMetric(new InfluenceMetric(cmd.getAtaMetricCO().getOwnerId())));
        metricGateway.save(ataMetricItem);
        return Response.buildSuccess();
    }
}
