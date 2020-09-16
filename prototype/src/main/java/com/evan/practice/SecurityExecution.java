package com.evan.practice;

import java.io.*;

/**
 * 证券成交实体
 */
public class SecurityExecution implements Cloneable, Serializable {
    /**
     * 成交编号
     */
    private String executionCode;
    /**
     * 成交日期
     */
    private Long executionDate;
    /**
     * 成交的证券代码
     */
    private String securityCode;
    /**
     * 交易场所代码
     */
    private String marketCode;
    /**
     * 我方证券账户编号
     */
    private String ourSecuritiesAccountCode;
    /**
     * 交易对手方证券账户编号
     */
    private String counterpartySecuritiesAccountCode;

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

    public Long getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Long executionDate) {
        this.executionDate = executionDate;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode;
    }

    public String getOurSecuritiesAccountCode() {
        return ourSecuritiesAccountCode;
    }

    public void setOurSecuritiesAccountCode(String ourSecuritiesAccountCode) {
        this.ourSecuritiesAccountCode = ourSecuritiesAccountCode;
    }

    public String getCounterpartySecuritiesAccountCode() {
        return counterpartySecuritiesAccountCode;
    }

    public void setCounterpartySecuritiesAccountCode(String counterpartySecuritiesAccountCode) {
        this.counterpartySecuritiesAccountCode = counterpartySecuritiesAccountCode;
    }

    public double getExecutionAmount() {
        return executionAmount;
    }

    public void setExecutionAmount(double executionAmount) {
        this.executionAmount = executionAmount;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deepClone();
    }

    private Object deepClone() {
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);

            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);

            return oi.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("复制当前实例备份失败：\n ");
        }
    }
}
