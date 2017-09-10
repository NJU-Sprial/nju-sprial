package po;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;


/**
 * Created by yinywf on 2017/9/7
 */
@Entity
@Table(name = "loan", schema = "sprial")
@DynamicUpdate
@DynamicInsert
public class LoanPO implements Serializable {
    private static final long serialVersionUID = 8950856623294834521L;
    private String loanCode;
    private Double balance;
    private Double rate;
    private LocalDateTime fetchDate;
    private LocalDateTime endDate;
    private String rateType;
    private String returnWay;
    private Integer propertyPackageId;
    private Integer projectId;


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
    public LocalDateTime getFetchDate() {
        return fetchDate;
    }

    public void setFetchDate(LocalDateTime fetchDate) {
        this.fetchDate = fetchDate;
    }

    @Basic
    @Column(name = "end_date")
    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
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

    @Basic
    @Column(name = "property_package_id")
    public Integer getPropertyPackageId() {
        return propertyPackageId;
    }

    public void setPropertyPackageId(Integer propertyPackageId) {
        this.propertyPackageId = propertyPackageId;
    }

    @Basic
    @Column(name = "project_id")
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoanPO loanPO = (LoanPO) o;

        if (loanCode != null ? !loanCode.equals(loanPO.loanCode) : loanPO.loanCode != null) return false;
        if (balance != null ? !balance.equals(loanPO.balance) : loanPO.balance != null) return false;
        if (rate != null ? !rate.equals(loanPO.rate) : loanPO.rate != null) return false;
        if (fetchDate != null ? !fetchDate.equals(loanPO.fetchDate) : loanPO.fetchDate != null) return false;
        if (endDate != null ? !endDate.equals(loanPO.endDate) : loanPO.endDate != null) return false;
        if (rateType != null ? !rateType.equals(loanPO.rateType) : loanPO.rateType != null) return false;
        if (returnWay != null ? !returnWay.equals(loanPO.returnWay) : loanPO.returnWay != null) return false;
        if (propertyPackageId != null ? !propertyPackageId.equals(loanPO.propertyPackageId) : loanPO.propertyPackageId != null)
            return false;
        return projectId != null ? projectId.equals(loanPO.projectId) : loanPO.projectId == null;
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
        result = 31 * result + (propertyPackageId != null ? propertyPackageId.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        return result;
    }
}
