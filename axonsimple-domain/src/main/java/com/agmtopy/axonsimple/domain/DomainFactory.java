package com.agmtopy.axonsimple.domain;

import com.agmtopy.axonsimple.domain.user.UserProfile;

/**
 * 领域工厂
 */
public class DomainFactory {

    public static UserProfile getUserProfile(){
        return new UserProfile();
    }

}
