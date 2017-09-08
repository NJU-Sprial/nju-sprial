package vo;

import java.time.LocalDate;

/**
 * Created by zjy on 2017/9/8.
 * 现金流对比分析图上的一个点
 */
public class CashFlowComparativeAnalysisPoint{
    private int cycleNum;
    private LocalDate date;

    /**
     *
     * @param cycleNum 期数，如3
     * @param date 日期
     */
    public CashFlowComparativeAnalysisPoint(int cycleNum, LocalDate date) {
        this.cycleNum = cycleNum;
        this.date = date;
    }

    public int getCycleNum() {
        return cycleNum;
    }

    public LocalDate getDate() {
        return date;
    }
}
