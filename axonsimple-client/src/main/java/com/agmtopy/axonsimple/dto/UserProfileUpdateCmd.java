package com.agmtopy.axonsimple.dto;

import com.agmtopy.axonsimple.dto.clientobject.UserProfileCO;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserProfileUpdateCmd extends CommonCommand {

    @NotNull
    private UserProfileCO userProfileCO;
}
