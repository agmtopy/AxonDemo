package com.agmtopy.axonsimple.service;

import com.agmtopy.axonsimple.command.query.ATAMetricQryExe;
import com.agmtopy.axonsimple.dto.clientobject.ATAMetricCO;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.agmtopy.axonsimple.api.MetricsService;
import com.agmtopy.axonsimple.command.*;
import com.agmtopy.axonsimple.dto.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * MetricsServiceImpl
 * Service的实现作为Face
 */
@Service
public class MetricsServiceImpl implements MetricsService {

    @Resource
    private ATAMetricQryExe ataMetricQryExe;
    @Resource
    private ATAMetricAddCmdExe ataMetricAddCmdExe;

    /**
     * 新增方法
     */
    @Override
    public Response addATAMetric(ATAMetricAddCmd cmd) {
        return ataMetricAddCmdExe.execute(cmd);
    }

    /**
     * 查询方法
     */
    @Override
    public MultiResponse<ATAMetricCO> listATAMetrics(ATAMetricQry ataMetricQry) {
        return ataMetricQryExe.execute(ataMetricQry);
    }
}
