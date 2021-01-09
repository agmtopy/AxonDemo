package com.agmtopy.axonsimple.domain.user;

import com.agmtopy.axonsimple.domain.metrics.techinfluence.InfluenceMetric;
import com.agmtopy.axonsimple.domain.metrics.weight.Weight;
import com.alibaba.cola.domain.EntityObject;
import com.alibaba.cola.logger.Logger;
import com.alibaba.cola.logger.LoggerFactory;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工档案
 */
@Data
@NoArgsConstructor
public class UserProfile extends EntityObject {
    private static Logger logger = LoggerFactory.getLogger(UserProfile.class);

    private String userId;
    private Weight weight;

    private InfluenceMetric influenceMetric;

    private static double MAXIMUM_SCORE = 100;
    private static double MINIMUM_SCORE = 0;

    public UserProfile(String userId){
        this.userId = userId;
    }
}
