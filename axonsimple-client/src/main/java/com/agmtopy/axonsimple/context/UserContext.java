package com.agmtopy.axonsimple.context;

import lombok.Data;

/**
 * UserContext
 */
@Data
public class UserContext {
    private String operator;
    private String loginUserId;
    private String loginUserName;
    private String loginUserRole;
    private String loginUserPrivilege;
}
