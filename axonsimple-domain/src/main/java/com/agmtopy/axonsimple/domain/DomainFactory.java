package com.agmtopy.axonsimple.domain;

import com.agmtopy.axonsimple.domain.user.UserProfile;

public class DomainFactory {

    public static UserProfile getUserProfile(){
        return new UserProfile();
    }

}
