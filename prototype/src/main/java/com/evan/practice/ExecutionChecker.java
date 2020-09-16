package com.evan.practice;

import com.alibaba.fastjson.JSON;

public class ExecutionChecker {

    public void doCheck(SecurityExecution execution) {
        //核对成交信息
        ExecutionCheckResult checkResult = checkExecution(execution);
        //存储成交核对结果信息
        saveExecutionResult(checkResult);
    }

    /**
     * 核对成交信息
     *
     * @param execution
     * @return 成交核对结果信息
     */
    private ExecutionCheckResult checkExecution(SecurityExecution execution) {
        //获取交易所文件中准确的交易结算明细数据
        OeSettlementDetail settlementDetail = getOeSettlementDetail(execution.getExecutionCode());
        //以交易所结算明细数据核对成交
        ExecutionCheckResult checkResult = checkOurExecutionBySettlementDetail(execution, settlementDetail);
        return checkResult;
    }

    private ExecutionCheckResult checkOurExecutionBySettlementDetail(SecurityExecution execution, OeSettlementDetail settlementDetail) {
        ExecutionCheckResult checkResult = new ExecutionCheckResult();
        checkResult.setExecutionBefore(execution);
        if (execution.getExecutionAmount() != settlementDetail.getExecutionAmount()) {
            try {
                SecurityExecution executionAfter = (SecurityExecution) execution.clone();
                executionAfter.setExecutionAmount(settlementDetail.getExecutionAmount());
                checkResult.setExecutionAfter(executionAfter);
                checkResult.setCheckResult("成交不一致");
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        return checkResult;
    }

    private OeSettlementDetail getOeSettlementDetail(String executionCode) {
        OeSettlementDetail detail = new OeSettlementDetail();
        detail.setExecutionCode(executionCode);
        detail.setExecutionAmount(66D);
        return detail;

    }

    /**
     * 存储核对结果信息
     *
     * @param checkResult
     */
    private void saveExecutionResult(ExecutionCheckResult checkResult) {
        System.out.println("存储成交核对结果至DB：\n" + JSON.toJSONString(checkResult));
    }
}
