package po;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "project_info", schema = "sprial")
public class ProjectInfoPO implements Serializable {
    private static final long serialVersionUID = 6799548975346354747L;
    private String loanCode;
    private Double balance;
    private Double rate;
    private Timestamp fetchDate;
    private Timestamp endDate;
    private String rateType;
    private String returnWay;

    @Id
    @Column(name = "loan_code")
    public String getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(String loanCode) {
        this.loanCode = loanCode;
    }

    @Basic
    @Column(name = "balance")
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "rate")
    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "fetch_date")
    public Timestamp getFetchDate() {
        return fetchDate;
    }

    public void setFetchDate(Timestamp fetchDate) {
        this.fetchDate = fetchDate;
    }

    @Basic
    @Column(name = "end_date")
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "rate_type")
    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    @Basic
    @Column(name = "return_way")
    public String getReturnWay() {
        return returnWay;
    }

    public void setReturnWay(String returnWay) {
        this.returnWay = returnWay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectInfoPO that = (ProjectInfoPO) o;

        if (loanCode != null ? !loanCode.equals(that.loanCode) : that.loanCode != null) return false;
        if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;
        if (fetchDate != null ? !fetchDate.equals(that.fetchDate) : that.fetchDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (rateType != null ? !rateType.equals(that.rateType) : that.rateType != null) return false;
        if (returnWay != null ? !returnWay.equals(that.returnWay) : that.returnWay != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = loanCode != null ? loanCode.hashCode() : 0;
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (fetchDate != null ? fetchDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (rateType != null ? rateType.hashCode() : 0);
        result = 31 * result + (returnWay != null ? returnWay.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProjectInfoPO{" +
                "loanCode='" + loanCode + '\'' +
                ", balance=" + balance +
                ", rate=" + rate +
                ", fetchDate=" + fetchDate +
                ", endDate=" + endDate +
                ", rateType='" + rateType + '\'' +
                ", returnWay='" + returnWay + '\'' +
                '}';
    }
}
