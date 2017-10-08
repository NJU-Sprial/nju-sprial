package po;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * Created by yinywf on 2017/10/8
 */
@Entity
@Table(name = "asset_pool", schema = "sprial")

@DynamicUpdate
@DynamicInsert
public class AssetPoolPO {
    private int productId;
    private String quantity;
    private String leftQuantity;
    private Integer numOfBorrowers;
    private Integer numOfLoan;
    private Double highesAmount;
    private Double aveAmount;
    private Double highestRate;
    private Double aveRate;
    private Double highestLeftMonth;
    private Double aveMonth;
    private Double aveLeftMonth;

    @Id
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "quantity")
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "left_quantity")
    public String getLeftQuantity() {
        return leftQuantity;
    }

    public void setLeftQuantity(String leftQuantity) {
        this.leftQuantity = leftQuantity;
    }

    @Basic
    @Column(name = "num_of_borrowers")
    public Integer getNumOfBorrowers() {
        return numOfBorrowers;
    }

    public void setNumOfBorrowers(Integer numOfBorrowers) {
        this.numOfBorrowers = numOfBorrowers;
    }

    @Basic
    @Column(name = "num_of_loan")
    public Integer getNumOfLoan() {
        return numOfLoan;
    }

    public void setNumOfLoan(Integer numOfLoan) {
        this.numOfLoan = numOfLoan;
    }

    @Basic
    @Column(name = "highes_amount")
    public Double getHighesAmount() {
        return highesAmount;
    }

    public void setHighesAmount(Double highesAmount) {
        this.highesAmount = highesAmount;
    }

    @Basic
    @Column(name = "ave_amount")
    public Double getAveAmount() {
        return aveAmount;
    }

    public void setAveAmount(Double aveAmount) {
        this.aveAmount = aveAmount;
    }

    @Basic
    @Column(name = "highest_rate")
    public Double getHighestRate() {
        return highestRate;
    }

    public void setHighestRate(Double highestRate) {
        this.highestRate = highestRate;
    }

    @Basic
    @Column(name = "ave_rate")
    public Double getAveRate() {
        return aveRate;
    }

    public void setAveRate(Double aveRate) {
        this.aveRate = aveRate;
    }

    @Basic
    @Column(name = "highest_left_month")
    public Double getHighestLeftMonth() {
        return highestLeftMonth;
    }

    public void setHighestLeftMonth(Double highestLeftMonth) {
        this.highestLeftMonth = highestLeftMonth;
    }

    @Basic
    @Column(name = "ave_month")
    public Double getAveMonth() {
        return aveMonth;
    }

    public void setAveMonth(Double aveMonth) {
        this.aveMonth = aveMonth;
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

        AssetPoolPO that = (AssetPoolPO) o;

        if (productId != that.productId) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (leftQuantity != null ? !leftQuantity.equals(that.leftQuantity) : that.leftQuantity != null) return false;
        if (numOfBorrowers != null ? !numOfBorrowers.equals(that.numOfBorrowers) : that.numOfBorrowers != null)
            return false;
        if (numOfLoan != null ? !numOfLoan.equals(that.numOfLoan) : that.numOfLoan != null) return false;
        if (highesAmount != null ? !highesAmount.equals(that.highesAmount) : that.highesAmount != null) return false;
        if (aveAmount != null ? !aveAmount.equals(that.aveAmount) : that.aveAmount != null) return false;
        if (highestRate != null ? !highestRate.equals(that.highestRate) : that.highestRate != null) return false;
        if (aveRate != null ? !aveRate.equals(that.aveRate) : that.aveRate != null) return false;
        if (highestLeftMonth != null ? !highestLeftMonth.equals(that.highestLeftMonth) : that.highestLeftMonth != null)
            return false;
        if (aveMonth != null ? !aveMonth.equals(that.aveMonth) : that.aveMonth != null) return false;
        if (aveLeftMonth != null ? !aveLeftMonth.equals(that.aveLeftMonth) : that.aveLeftMonth != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (leftQuantity != null ? leftQuantity.hashCode() : 0);
        result = 31 * result + (numOfBorrowers != null ? numOfBorrowers.hashCode() : 0);
        result = 31 * result + (numOfLoan != null ? numOfLoan.hashCode() : 0);
        result = 31 * result + (highesAmount != null ? highesAmount.hashCode() : 0);
        result = 31 * result + (aveAmount != null ? aveAmount.hashCode() : 0);
        result = 31 * result + (highestRate != null ? highestRate.hashCode() : 0);
        result = 31 * result + (aveRate != null ? aveRate.hashCode() : 0);
        result = 31 * result + (highestLeftMonth != null ? highestLeftMonth.hashCode() : 0);
        result = 31 * result + (aveMonth != null ? aveMonth.hashCode() : 0);
        result = 31 * result + (aveLeftMonth != null ? aveLeftMonth.hashCode() : 0);
        return result;
    }
}
