package com.agmtopy.axonsimple.command.query;

import com.alibaba.cola.dto.MultiResponse;
import com.agmtopy.axonsimple.domain.metrics.SubMetricType;
import com.agmtopy.axonsimple.dto.ATAMetricQry;
import com.agmtopy.axonsimple.dto.clientobject.ATAMetricCO;
import com.agmtopy.axonsimple.gatewayimpl.database.MetricMapper;
import com.agmtopy.axonsimple.gatewayimpl.database.dataobject.MetricDO;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class ATAMetricQryExe{

    @Resource
    private MetricMapper metricMapper;

    public MultiResponse<ATAMetricCO> execute(ATAMetricQry cmd) {
        List<MetricDO> metricDOList = metricMapper.listBySubMetric(cmd.getOwnerId(), SubMetricType.ATA.getMetricSubTypeCode());
        List<ATAMetricCO> ataMetricCOList = new ArrayList<>();
        metricDOList.forEach(metricDO -> {
            ATAMetricCO ataMetricCO = JSON.parseObject(metricDO.getMetricItem(), ATAMetricCO.class);
            ataMetricCO.setOwnerId(metricDO.getUserId());
            ataMetricCOList.add(ataMetricCO);
        });
        return MultiResponse.ofWithoutTotal(ataMetricCOList);
    }

}
