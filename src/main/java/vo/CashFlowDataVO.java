package vo;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by 铠联 on 2017/9/3.
 * “现金流汇总”包括：封包日期、资产数量（笔）、加权平均利率、加权剩余期限（月）、现金流入总额（元）、本金总额（元）、利息总额（元）
 * “各期现金流明细”包括：期数、日期、现金流入金额（元）、本金（元）、本金占比、利息（元）
 */
public class CashFlowDataVO {
    //现金流汇总
    private LocalDate packageDate;
    private int propertyNum;
    private double averageRate;
    private double averageTimeLeft;
    private double cashFlowInSum;
    private double capitalSum;
    private double interestSum;

    //“各期现金流明细”
    List<EachCycleData> eachCycleDataList;

    public class EachCycleData{
        private int cycleNum;
        private LocalDate date;
        private double cashFlowInSum;
        private double capital;
        private double capitalRate;
        private double interest;
    }
}
