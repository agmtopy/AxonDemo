package com.agmtopy.axonsimple.controller;

import com.agmtopy.axonsimple.dto.ATAMetricAddCmd;
import com.agmtopy.axonsimple.dto.ATAMetricQry;
import com.agmtopy.axonsimple.dto.clientobject.ATAMetricCO;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.agmtopy.axonsimple.api.MetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MetricsController {

    @Autowired
    private MetricsService metricsService;

    /**
     * 查询方法
     */
    @GetMapping(value = "/metrics/ata")
    public MultiResponse<ATAMetricCO> listATAMetrics(@RequestParam String ownerId){
        ATAMetricQry ataMetricQry = new ATAMetricQry();
        ataMetricQry.setOwnerId(ownerId);
        return metricsService.listATAMetrics(ataMetricQry);
    }

    /**
     * 新增方法
     */
    @PostMapping(value = "/metrics/ata")
    public Response addATAMetric(@RequestBody ATAMetricAddCmd ataMetricAddCmd){
        return metricsService.addATAMetric(ataMetricAddCmd);
    }
}
