package vo;

import java.time.LocalDate;

/**
 * Created by zjy on 2017/9/8.
 * 本金现金流明细,期数”、“日期”、“本金现金流”
 */
public class CapitalCashFlowDetail{
    private int cycleNum;
    private LocalDate date;
    private String capitalCashFlow;

    public CapitalCashFlowDetail(int cycleNum, LocalDate date, String capitalCashFlow) {
        this.cycleNum = cycleNum;
        this.date = date;
        this.capitalCashFlow = capitalCashFlow;
    }

    public int getCycleNum() {
        return cycleNum;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCapitalCashFlow() {
        return capitalCashFlow;
    }
}
