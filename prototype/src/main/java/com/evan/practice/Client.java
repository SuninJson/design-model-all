package com.evan.practice;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        SecurityExecution execution = new SecurityExecution();
        execution.setExecutionCode("0001");
        execution.setExecutionDate(new Date().getTime());
        execution.setSecurityCode("0001Bond");
        execution.setMarketCode("SZ");
        execution.setOurSecuritiesAccountCode("ZH0001");
        execution.setCounterpartySecuritiesAccountCode("ZH0002");
        execution.setExecutionAmount(88D);

        new ExecutionChecker().doCheck(execution);
    }
}
