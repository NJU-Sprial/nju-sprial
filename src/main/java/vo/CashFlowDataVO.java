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
    private List<EachCycleData> eachCycleDataList;

    public CashFlowDataVO(LocalDate packageDate, int propertyNum, double averageRate, double averageTimeLeft,
                          double cashFlowInSum, double capitalSum, double interestSum, List<EachCycleData> eachCycleDataList) {
        this.packageDate = packageDate;
        this.propertyNum = propertyNum;
        this.averageRate = averageRate;
        this.averageTimeLeft = averageTimeLeft;
        this.cashFlowInSum = cashFlowInSum;
        this.capitalSum = capitalSum;
        this.interestSum = interestSum;
        this.eachCycleDataList = eachCycleDataList;
    }

    public LocalDate getPackageDate() {
        return packageDate;
    }

    public int getPropertyNum() {
        return propertyNum;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public double getAverageTimeLeft() {
        return averageTimeLeft;
    }

    public double getCashFlowInSum() {
        return cashFlowInSum;
    }

    public double getCapitalSum() {
        return capitalSum;
    }

    public double getInterestSum() {
        return interestSum;
    }

    public List<EachCycleData> getEachCycleDataList() {
        return eachCycleDataList;
    }

    public class EachCycleData{
        private int cycleNum;
        private LocalDate date;
        private double cashFlowInSum;
        private double capital;
        private double capitalRate;
        private double interest;

        public EachCycleData(int cycleNum, LocalDate date, double cashFlowInSum, double capital, double capitalRate, double interest) {
            this.cycleNum = cycleNum;
            this.date = date;
            this.cashFlowInSum = cashFlowInSum;
            this.capital = capital;
            this.capitalRate = capitalRate;
            this.interest = interest;
        }

        public int getCycleNum() {
            return cycleNum;
        }

        public LocalDate getDate() {
            return date;
        }

        public double getCashFlowInSum() {
            return cashFlowInSum;
        }

        public double getCapital() {
            return capital;
        }

        public double getCapitalRate() {
            return capitalRate;
        }

        public double getInterest() {
            return interest;
        }
    }
}
