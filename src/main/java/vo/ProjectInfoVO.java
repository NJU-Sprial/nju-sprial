package vo;

import java.time.LocalDate;

/**
 * Created by 铠联 on 2017/9/2.
 * 属性安序分别代表“贷款合同编号”、“提取日本金余额“、”当期年华利率“、”提取日期“、“到期日期”、“利率类型”、“还款方式”
 */
public class ProjectInfoVO {
    private String loanCode;
    private double balance;
    private double rate;
    private LocalDate fetchDate;
    private LocalDate endDate;
    private String rateType;
    private String returnWay;

    public ProjectInfoVO(String loanCode, double balance, double rate, LocalDate fetchDate, LocalDate endDate, String rateType, String returnWay) {
        this.loanCode = loanCode;
        this.balance = balance;
        this.rate = rate;
        this.fetchDate = fetchDate;
        this.endDate = endDate;
        this.rateType = rateType;
        this.returnWay = returnWay;
    }

    public String getloanCode() {
        return loanCode;
    }

    public void setloanCode(String loanCode) {
        this.loanCode = loanCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public LocalDate getFetchDate() {
        return fetchDate;
    }

    public void setFetchDate(LocalDate fetchDate) {
        this.fetchDate = fetchDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public String getReturnWay() {
        return returnWay;
    }

    public void setReturnWay(String returnWay) {
        this.returnWay = returnWay;
    }
}
