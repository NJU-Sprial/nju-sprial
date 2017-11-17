package po;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by yinywf on 2017/10/3
 */
@Entity
@Table(name = "asset_pool_change_log", schema = "sprial")
@DynamicUpdate
@DynamicInsert
public class AssetPoolChangeLogPO implements Serializable {
    private static final long serialVersionUID = 8310836198389153347L;
    private int id;
    private Integer productId;
    private Timestamp announcementDate;
    private Timestamp receiptStartDate;
    private Timestamp receiptEndDate;
    private Double initialPrincipalBalance;
    private Double finalPrincipalBalance;
    private Integer loanNum;
    private Double principalRecoveryBalance;
    private Double interestRecoveryBalance;
    private Double principalRecoveryRate;
    private Double aveLoanRate;
    private Double aveLeftMonth;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_id")
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "announcement_date")
    public Timestamp getAnnouncementDate() {
        return announcementDate;
    }

    public void setAnnouncementDate(Timestamp announcementDate) {
        this.announcementDate = announcementDate;
    }

    @Basic
    @Column(name = "receipt_start_date")
    public Timestamp getReceiptStartDate() {
        return receiptStartDate;
    }

    public void setReceiptStartDate(Timestamp receiptStartDate) {
        this.receiptStartDate = receiptStartDate;
    }

    @Basic
    @Column(name = "receipt_end_date")
    public Timestamp getReceiptEndDate() {
        return receiptEndDate;
    }

    public void setReceiptEndDate(Timestamp receiptEndDate) {
        this.receiptEndDate = receiptEndDate;
    }

    @Basic
    @Column(name = "initial_principal_balance")
    public Double getInitialPrincipalBalance() {
        return initialPrincipalBalance;
    }

    public void setInitialPrincipalBalance(Double initialPrincipalBalance) {
        this.initialPrincipalBalance = initialPrincipalBalance;
    }

    @Basic
    @Column(name = "final_principal_balance")
    public Double getFinalPrincipalBalance() {
        return finalPrincipalBalance;
    }

    public void setFinalPrincipalBalance(Double finalPrincipalBalance) {
        this.finalPrincipalBalance = finalPrincipalBalance;
    }

    @Basic
    @Column(name = "loan_num")
    public Integer getLoanNum() {
        return loanNum;
    }

    public void setLoanNum(Integer loanNum) {
        this.loanNum = loanNum;
    }

    @Basic
    @Column(name = "principal_recovery_balance")
    public Double getPrincipalRecoveryBalance() {
        return principalRecoveryBalance;
    }

    public void setPrincipalRecoveryBalance(Double principalRecoveryBalance) {
        this.principalRecoveryBalance = principalRecoveryBalance;
    }

    @Basic
    @Column(name = "interest_recovery_balance")
    public Double getInterestRecoveryBalance() {
        return interestRecoveryBalance;
    }

    public void setInterestRecoveryBalance(Double interestRecoveryBalance) {
        this.interestRecoveryBalance = interestRecoveryBalance;
    }

    @Basic
    @Column(name = "principal_recovery_rate")
    public Double getPrincipalRecoveryRate() {
        return principalRecoveryRate;
    }

    public void setPrincipalRecoveryRate(Double principalRecoveryRate) {
        this.principalRecoveryRate = principalRecoveryRate;
    }

    @Basic
    @Column(name = "ave_loan_rate")
    public Double getAveLoanRate() {
        return aveLoanRate;
    }

    public void setAveLoanRate(Double aveLoanRate) {
        this.aveLoanRate = aveLoanRate;
    }

    @Basic
    @Column(name = "ave_left_month")
    public Double getAveLeftMonth() {
        return aveLeftMonth;
    }

    public void setAveLeftMonth(Double aveLeftMonth) {
        this.aveLeftMonth = aveLeftMonth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssetPoolChangeLogPO that = (AssetPoolChangeLogPO) o;

        if (id != that.id) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (announcementDate != null ? !announcementDate.equals(that.announcementDate) : that.announcementDate != null)
            return false;
        if (receiptStartDate != null ? !receiptStartDate.equals(that.receiptStartDate) : that.receiptStartDate != null)
            return false;
        if (receiptEndDate != null ? !receiptEndDate.equals(that.receiptEndDate) : that.receiptEndDate != null)
            return false;
        if (initialPrincipalBalance != null ? !initialPrincipalBalance.equals(that.initialPrincipalBalance) : that.initialPrincipalBalance != null)
            return false;
        if (finalPrincipalBalance != null ? !finalPrincipalBalance.equals(that.finalPrincipalBalance) : that.finalPrincipalBalance != null)
            return false;
        if (loanNum != null ? !loanNum.equals(that.loanNum) : that.loanNum != null) return false;
        if (principalRecoveryBalance != null ? !principalRecoveryBalance.equals(that.principalRecoveryBalance) : that.principalRecoveryBalance != null)
            return false;
        if (interestRecoveryBalance != null ? !interestRecoveryBalance.equals(that.interestRecoveryBalance) : that.interestRecoveryBalance != null)
            return false;
        if (principalRecoveryRate != null ? !principalRecoveryRate.equals(that.principalRecoveryRate) : that.principalRecoveryRate != null)
            return false;
        if (aveLoanRate != null ? !aveLoanRate.equals(that.aveLoanRate) : that.aveLoanRate != null) return false;
        if (aveLeftMonth != null ? !aveLeftMonth.equals(that.aveLeftMonth) : that.aveLeftMonth != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (announcementDate != null ? announcementDate.hashCode() : 0);
        result = 31 * result + (receiptStartDate != null ? receiptStartDate.hashCode() : 0);
        result = 31 * result + (receiptEndDate != null ? receiptEndDate.hashCode() : 0);
        result = 31 * result + (initialPrincipalBalance != null ? initialPrincipalBalance.hashCode() : 0);
        result = 31 * result + (finalPrincipalBalance != null ? finalPrincipalBalance.hashCode() : 0);
        result = 31 * result + (loanNum != null ? loanNum.hashCode() : 0);
        result = 31 * result + (principalRecoveryBalance != null ? principalRecoveryBalance.hashCode() : 0);
        result = 31 * result + (interestRecoveryBalance != null ? interestRecoveryBalance.hashCode() : 0);
        result = 31 * result + (principalRecoveryRate != null ? principalRecoveryRate.hashCode() : 0);
        result = 31 * result + (aveLoanRate != null ? aveLoanRate.hashCode() : 0);
        result = 31 * result + (aveLeftMonth != null ? aveLeftMonth.hashCode() : 0);
        return result;
    }
}
