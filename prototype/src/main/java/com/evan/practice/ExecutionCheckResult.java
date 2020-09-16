package com.evan.practice;

import java.io.Serializable;

/**
 * 核对结果实体
 */
public class ExecutionCheckResult implements Cloneable, Serializable {

    /**
     * 核对前的成交信息
     */
    private SecurityExecution executionBefore;
    /**
     * 核对后的成交信息
     */
    private SecurityExecution executionAfter;
    /**
     * 核对结果
     */
    private String checkResult;

    public SecurityExecution getExecutionBefore() {
        return executionBefore;
    }

    public void setExecutionBefore(SecurityExecution executionBefore) {
        this.executionBefore = executionBefore;
    }

    public SecurityExecution getExecutionAfter() {
        return executionAfter;
    }

    public void setExecutionAfter(SecurityExecution executionAfter) {
        this.executionAfter = executionAfter;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return DeepCloneUtils.deepClone(this);
    }

}
