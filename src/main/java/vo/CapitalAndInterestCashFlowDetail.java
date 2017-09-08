package vo;

import java.time.LocalDate;

/**
 * Created by zjy on 2017/9/8.
 * 本息现金流明细,包括“期数”、“日期”、“本息现金流”
 */
public class CapitalAndInterestCashFlowDetail{
    private int cycleNum;
    private LocalDate date;
    private String capitalAndInterestCashFlow;

    public CapitalAndInterestCashFlowDetail(int cycleNum, LocalDate date, String capitalAndInterestCashFlow) {
        this.cycleNum = cycleNum;
        this.date = date;
        this.capitalAndInterestCashFlow = capitalAndInterestCashFlow;
    }

    public int getCycleNum() {
        return cycleNum;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCapitalAndInterestCashFlow() {
        return capitalAndInterestCashFlow;
    }
}
