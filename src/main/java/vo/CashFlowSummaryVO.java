package vo;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaoJun on 2017/9/10.
 * 现金流汇总
 */
public class CashFlowSummaryVO {
    String packageProperty;     //资产包性质
    Date date;                  //封包日期
    int assetNumber;            //资产数量
    double rate;                //加权平均利率
    double remainTerm;          //加权剩余期限(月)
    int total;                  //现金流入总额(元)
    int interest;               //利息总额(元)
    Map<Date, Integer> cashInflow;  //各期现金流入金额，Date为对应日期，Integer为金额

    public CashFlowSummaryVO(String packageProperty, Date date, int assetNumber, double rate, double remainTerm, int total, int interest, Map<Date, Integer> cashInflow) {
        this.packageProperty = packageProperty;
        this.date = date;
        this.assetNumber = assetNumber;
        this.rate = rate;
        this.remainTerm = remainTerm;
        this.total = total;
        this.interest = interest;
        this.cashInflow = cashInflow;
    }

    public String getPackageProperty() {
        return packageProperty;
    }

    public Date getDate() {
        return date;
    }

    public int getAssetNumber() {
        return assetNumber;
    }

    public double getRate() {
        return rate;
    }

    public double getRemainTerm() {
        return remainTerm;
    }

    public int getTotal() {
        return total;
    }

    public int getInterest() {
        return interest;
    }

    public Map<Date, Integer> getCashInflow() {
        return cashInflow;
    }
}
