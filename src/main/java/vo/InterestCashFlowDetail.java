package vo;

import java.time.LocalDate;

/**
 * Created by zjy on 2017/9/8.
 * 利息现金流明细,包括“期数”、“日期”、“利息现金流”
 */
public class InterestCashFlowDetail{
    private int cycleNum;
    private LocalDate date;
    private String interestCashFlow;

    public InterestCashFlowDetail(int cycleNum, LocalDate date, String interestCashFlow) {
        this.cycleNum = cycleNum;
        this.date = date;
        this.interestCashFlow = interestCashFlow;
    }

    public int getCycleNum() {
        return cycleNum;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getInterestCashFlow() {
        return interestCashFlow;
    }
}
