package com.agmtopy.axonsimple.command;

import com.alibaba.cola.dto.Response;
import com.agmtopy.axonsimple.dto.MetricDeleteCmd;
import com.agmtopy.axonsimple.gatewayimpl.database.MetricMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * MetricDeleteCmdExe
 *
 * @author Frank Zhang
 * @date 2019-03-04 3:01 PM
 */
@Component
public class MetricDeleteCmdExe{

    @Resource
    private MetricMapper metricMapper;

    public Response execute(MetricDeleteCmd cmd) {

        metricMapper.delete(cmd.getMetricId(), cmd.getOperater());

        return Response.buildSuccess();
    }
}