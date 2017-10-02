package po;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by yinywf on 2017/10/3
 */
@Entity
@Table(name = "securities_repayment", schema = "sprial")
@DynamicUpdate
@DynamicInsert
public class SecuritiesRepaymentPO {
    private int id;
    private Integer productId;
    private Timestamp payDate;
    private Timestamp interestStartDate;
    private Timestamp interestEndDate;
    private Double initialPrincipal;
    private Double paidPrincipal;
    private Double paidInterest;
    private Double couponRate;

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
    @Column(name = "pay_date")
    public Timestamp getPayDate() {
        return payDate;
    }

    public void setPayDate(Timestamp payDate) {
        this.payDate = payDate;
    }

    @Basic
    @Column(name = "interest_start_date")
    public Timestamp getInterestStartDate() {
        return interestStartDate;
    }

    public void setInterestStartDate(Timestamp interestStartDate) {
        this.interestStartDate = interestStartDate;
    }

    @Basic
    @Column(name = "interest_end_date")
    public Timestamp getInterestEndDate() {
        return interestEndDate;
    }

    public void setInterestEndDate(Timestamp interestEndDate) {
        this.interestEndDate = interestEndDate;
    }

    @Basic
    @Column(name = "initial_principal")
    public Double getInitialPrincipal() {
        return initialPrincipal;
    }

    public void setInitialPrincipal(Double initialPrincipal) {
        this.initialPrincipal = initialPrincipal;
    }

    @Basic
    @Column(name = "paid_principal")
    public Double getPaidPrincipal() {
        return paidPrincipal;
    }

    public void setPaidPrincipal(Double paidPrincipal) {
        this.paidPrincipal = paidPrincipal;
    }

    @Basic
    @Column(name = "paid_interest")
    public Double getPaidInterest() {
        return paidInterest;
    }

    public void setPaidInterest(Double paidInterest) {
        this.paidInterest = paidInterest;
    }

    @Basic
    @Column(name = "coupon_rate")
    public Double getCouponRate() {
        return couponRate;
    }

    public void setCouponRate(Double couponRate) {
        this.couponRate = couponRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SecuritiesRepaymentPO that = (SecuritiesRepaymentPO) o;

        if (id != that.id) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (payDate != null ? !payDate.equals(that.payDate) : that.payDate != null) return false;
        if (interestStartDate != null ? !interestStartDate.equals(that.interestStartDate) : that.interestStartDate != null)
            return false;
        if (interestEndDate != null ? !interestEndDate.equals(that.interestEndDate) : that.interestEndDate != null)
            return false;
        if (initialPrincipal != null ? !initialPrincipal.equals(that.initialPrincipal) : that.initialPrincipal != null)
            return false;
        if (paidPrincipal != null ? !paidPrincipal.equals(that.paidPrincipal) : that.paidPrincipal != null)
            return false;
        if (paidInterest != null ? !paidInterest.equals(that.paidInterest) : that.paidInterest != null) return false;
        if (couponRate != null ? !couponRate.equals(that.couponRate) : that.couponRate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (payDate != null ? payDate.hashCode() : 0);
        result = 31 * result + (interestStartDate != null ? interestStartDate.hashCode() : 0);
        result = 31 * result + (interestEndDate != null ? interestEndDate.hashCode() : 0);
        result = 31 * result + (initialPrincipal != null ? initialPrincipal.hashCode() : 0);
        result = 31 * result + (paidPrincipal != null ? paidPrincipal.hashCode() : 0);
        result = 31 * result + (paidInterest != null ? paidInterest.hashCode() : 0);
        result = 31 * result + (couponRate != null ? couponRate.hashCode() : 0);
        return result;
    }
}
