package com.agmtopy.axonsimple.command;

import com.alibaba.cola.dto.Response;
import com.agmtopy.axonsimple.convertor.UserProfileConvertor;
import com.agmtopy.axonsimple.domain.user.UserProfile;
import com.agmtopy.axonsimple.dto.UserProfileUpdateCmd;
import com.agmtopy.axonsimple.domain.gateway.UserProfileGateway;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserProfileUpdateCmdExe{

    @Resource
    private UserProfileGateway userProfileGateway;

    public Response execute(UserProfileUpdateCmd cmd) {
        UserProfile userProfile = UserProfileConvertor.toEntity(cmd.getUserProfileCO());
        userProfileGateway.update(userProfile);
        return Response.buildSuccess();
    }
}