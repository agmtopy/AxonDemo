package com.agmtopy.axonsimple.gatewayimpl.database;

import com.agmtopy.axonsimple.gatewayimpl.database.dataobject.MetricDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MetricMapper {

    /**
     * insert
     */
    int create(MetricDO dataObject);

    /**
     * 根据userId查询
     */
    List<MetricDO> listBySubMetric(@Param("userId") String userId, @Param("subMetric") String subMetric);
}
