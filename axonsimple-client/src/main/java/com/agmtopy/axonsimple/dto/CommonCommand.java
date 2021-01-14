package com.agmtopy.axonsimple.dto;

import com.alibaba.cola.dto.Command;

/**
 * 整个应用通用的Command
 */
public class CommonCommand extends Command{
    private String operater;
    private boolean needsOperator;

    public String getOperater() {
        return this.operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
        needsOperator = true;
    }

    public boolean isNeedsOperator(){
        return needsOperator;
    }
}
