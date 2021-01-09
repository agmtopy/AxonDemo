package com.agmtopy.axonsimple.api;

import com.agmtopy.axonsimple.dto.ATAMetricAddCmd;
import com.agmtopy.axonsimple.dto.ATAMetricQry;
import com.agmtopy.axonsimple.dto.clientobject.ATAMetricCO;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;

/**
 * client端暴露出来的Service接口
 */
public interface MetricsService {

    /**
     * 新增方法
     */
    Response addATAMetric(ATAMetricAddCmd cmd);

    /**
     * 查询方法
     */
    MultiResponse<ATAMetricCO> listATAMetrics(ATAMetricQry ataMetricQry);
}
