package com.agmtopy.axonsimple.gatewayimpl;

import com.agmtopy.axonsimple.gatewayimpl.database.MetricMapper;
import com.agmtopy.axonsimple.gatewayimpl.database.dataobject.MetricDO;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * MybatisTest
 *
 * @author Frank Zhang
 * @date 2019-02-27 4:38 PM
 */
public class MybatisTest {
    SqlSession sqlSession;
    MetricMapper metricMapper;

    @Before
    public void before() {
        sqlSession = Mybatis3Utils.getCurrentSqlSession();
        metricMapper = sqlSession.getMapper(MetricMapper.class);
    }

    @After
    public void after() {
        Mybatis3Utils.closeCurrentSession();
    }

    @Test
    public void insert() {
        MetricDO metricDO = new MetricDO();
        metricDO.setMainMetric("mainTest");
        metricDO.setSubMetric("subTest");
        metricDO.setUserId("12345");
        metricDO.setCreator("Frank");
        metricDO.setModifier("Frank");
        metricDO.setMetricItem("{\"patentName\": \"Leads重构\", \"level\": \"PROJECT\"}");
        metricMapper.create(metricDO);
        sqlSession.commit();

        MetricDO byUserId = metricMapper.getByUserId("12345");
        assertThat(byUserId).isNotNull()
                .hasFieldOrPropertyWithValue("userId", "12345")
                .hasFieldOrPropertyWithValue("creator", "Frank")
                .hasFieldOrPropertyWithValue("modifier", "Frank");
    }

}
