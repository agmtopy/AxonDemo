package com.agmtopy.axonsimple.domain;

import com.agmtopy.axonsimple.domain.metrics.techinfluence.InfluenceMetric;
import com.agmtopy.axonsimple.domain.metrics.weight.DevWeight;
import com.agmtopy.axonsimple.domain.user.UserProfile;
import org.junit.Assert;
import org.junit.Test;

public class InfluenceMetricTest {

    @Test
    public void testDevScore(){
        UserProfile userProfile = new UserProfile();
        userProfile.setWeight(new DevWeight());
        InfluenceMetric influenceMetric = new InfluenceMetric(userProfile);
        Assert.assertEquals(124.5, influenceMetric.calculateScore(), 0.01);
    }
}
