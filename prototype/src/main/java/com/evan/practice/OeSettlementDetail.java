package com.evan.practice;

/**
 * 结算明细实体
 */
public class OeSettlementDetail {

    /**
     * 成交编号
     */
    private String executionCode;
    /**
     * 成交金额
     */
    private double executionAmount;

    public String getExecutionCode() {
        return executionCode;
    }

    public void setExecutionCode(String executionCode) {
        this.executionCode = executionCode;
    }

    public double getExecutionAmount() {
        return executionAmount;
    }

    public void setExecutionAmount(double executionAmount) {
        this.executionAmount = executionAmount;
    }
}
