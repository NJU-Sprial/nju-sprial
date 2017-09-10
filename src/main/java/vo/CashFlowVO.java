package vo;

import java.util.Date;

/**
 * Created by xiaoJun on 2017/9/10.
 * 现金流明细
 */
public class CashFlowVO {
    int period;         //期数
    Date date;          //日期
    int cash;           //现金流入金额(元)
    int principal;      //本金(元)
    double principalRate;   //本金占比
    int interest;           //利息

    public CashFlowVO(int period, Date date, int cash, int principal, double principalRate, int interest) {
        this.period = period;
        this.date = date;
        this.cash = cash;
        this.principal = principal;
        this.principalRate = principalRate;
        this.interest = interest;
    }

    public int getPeriod() {
        return period;
    }

    public Date getDate() {
        return date;
    }

    public int getCash() {
        return cash;
    }

    public int getPrincipal() {
        return principal;
    }

    public double getPrincipalRate() {
        return principalRate;
    }

    public int getInterest() {
        return interest;
    }
}
