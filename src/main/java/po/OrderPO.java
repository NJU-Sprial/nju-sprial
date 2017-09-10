package po;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by yinywf on 2017/9/7
 */
@Entity
@Table(name = "order", schema = "sprial")
@DynamicUpdate
@DynamicInsert
public class OrderPO implements Serializable {
    private static final long serialVersionUID = -2979844900021702033L;
    private int orderId;
    private LocalDateTime orderDate;
    private Integer productId;
    private String productName;
    private String username;
    private Double amount;
    private Double interestRate;
    private Boolean hasDeposit;
    private Boolean bid;
    private Double incomeEstimation;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "order_id")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "order_date")
    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
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
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "interest_rate")
    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Basic
    @Column(name = "has_deposit")
    public Boolean getHasDeposit() {
        return hasDeposit;
    }

    public void setHasDeposit(Boolean hasDeposit) {
        this.hasDeposit = hasDeposit;
    }

    @Basic
    @Column(name = "bid")
    public Boolean getBid() {
        return bid;
    }

    public void setBid(Boolean bid) {
        this.bid = bid;
    }

    @Basic
    @Column(name = "income_estimation")
    public Double getIncomeEstimation() {
        return incomeEstimation;
    }

    public void setIncomeEstimation(Double incomeEstimation) {
        this.incomeEstimation = incomeEstimation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPO orderPO = (OrderPO) o;

        if (orderId != orderPO.orderId) return false;
        if (orderDate != null ? !orderDate.equals(orderPO.orderDate) : orderPO.orderDate != null) return false;
        if (productId != null ? !productId.equals(orderPO.productId) : orderPO.productId != null) return false;
        if (productName != null ? !productName.equals(orderPO.productName) : orderPO.productName != null) return false;
        if (username != null ? !username.equals(orderPO.username) : orderPO.username != null) return false;
        if (amount != null ? !amount.equals(orderPO.amount) : orderPO.amount != null) return false;
        if (interestRate != null ? !interestRate.equals(orderPO.interestRate) : orderPO.interestRate != null)
            return false;
        if (hasDeposit != null ? !hasDeposit.equals(orderPO.hasDeposit) : orderPO.hasDeposit != null) return false;
        if (bid != null ? !bid.equals(orderPO.bid) : orderPO.bid != null) return false;
        if (incomeEstimation != null ? !incomeEstimation.equals(orderPO.incomeEstimation) : orderPO.incomeEstimation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (interestRate != null ? interestRate.hashCode() : 0);
        result = 31 * result + (hasDeposit != null ? hasDeposit.hashCode() : 0);
        result = 31 * result + (bid != null ? bid.hashCode() : 0);
        result = 31 * result + (incomeEstimation != null ? incomeEstimation.hashCode() : 0);
        return result;
    }
}
