package com.agmtopy.axonsimple.gatewayimpl.database.dataobject;

/**
 * BaseDO
 */
public class BaseDO {
    private String creator;
    private String modifier;

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
}
