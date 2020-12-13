package com.agmtopy.axonsimple.domain.metrics.appquality;

import com.agmtopy.axonsimple.domain.metrics.MainMetric;
import com.agmtopy.axonsimple.domain.metrics.MainMetricType;
import com.agmtopy.axonsimple.domain.metrics.devquality.BugMetric;
import com.agmtopy.axonsimple.domain.user.UserProfile;

public class AppQualityMetric extends MainMetric {

    private AppMetric appMetric;

    public AppQualityMetric(UserProfile metricOwner){
        this.metricOwner = metricOwner;
        metricOwner.setAppQualityMetric(this);
        this.metricMainType = MainMetricType.APP_QUALITY;
    }

    @Override
    public double getWeight() {
        return metricOwner.getWeight().getAppQualityWeight();
    }
}
