package po;

import enums.BondType;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yinywf on 2017/10/8
 */
@Entity
@Table(name = "product_strategy", schema = "sprial")

@DynamicUpdate
@DynamicInsert
public class ProductStrategyPO implements Serializable {
    private static final long serialVersionUID = -4959343057865943465L;
    private int productId;
    private BondType bondType;
    private Integer priority;
    private String bondNameForShort;
    private Double releaseMoneyPercentage;
    private Double releaseMoney;
    private Double interestPayFrequency;
    private Double estimatedInterestRate;

    @Id
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "bond_type")
    public BondType getBondType() {
        return bondType;
    }

    public void setBondType(BondType bondType) {
        this.bondType = bondType;
    }

    @Basic
    @Column(name = "priority")
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "bond_name_for_short")
    public String getBondNameForShort() {
        return bondNameForShort;
    }

    public void setBondNameForShort(String bondNameForShort) {
        this.bondNameForShort = bondNameForShort;
    }

    @Basic
    @Column(name = "release_money_percentage")
    public Double getReleaseMoneyPercentage() {
        return releaseMoneyPercentage;
    }

    public void setReleaseMoneyPercentage(Double releaseMoneyPercentage) {
        this.releaseMoneyPercentage = releaseMoneyPercentage;
    }

    @Basic
    @Column(name = "release_money")
    public Double getReleaseMoney() {
        return releaseMoney;
    }

    public void setReleaseMoney(Double releaseMoney) {
        this.releaseMoney = releaseMoney;
    }

    @Basic
    @Column(name = "interest_pay_frequency")
    public Double getInterestPayFrequency() {
        return interestPayFrequency;
    }

    public void setInterestPayFrequency(Double interestPayFrequency) {
        this.interestPayFrequency = interestPayFrequency;
    }

    @Basic
    @Column(name = "estimated_interest_rate")
    public Double getEstimatedInterestRate() {
        return estimatedInterestRate;
    }

    public void setEstimatedInterestRate(Double estimatedInterestRate) {
        this.estimatedInterestRate = estimatedInterestRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductStrategyPO that = (ProductStrategyPO) o;

        if (productId != that.productId) return false;
        if (bondType != null ? !bondType.equals(that.bondType) : that.bondType != null) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (bondNameForShort != null ? !bondNameForShort.equals(that.bondNameForShort) : that.bondNameForShort != null)
            return false;
        if (releaseMoneyPercentage != null ? !releaseMoneyPercentage.equals(that.releaseMoneyPercentage) : that.releaseMoneyPercentage != null)
            return false;
        if (releaseMoney != null ? !releaseMoney.equals(that.releaseMoney) : that.releaseMoney != null) return false;
        if (interestPayFrequency != null ? !interestPayFrequency.equals(that.interestPayFrequency) : that.interestPayFrequency != null)
            return false;
        if (estimatedInterestRate != null ? !estimatedInterestRate.equals(that.estimatedInterestRate) : that.estimatedInterestRate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (bondType != null ? bondType.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (bondNameForShort != null ? bondNameForShort.hashCode() : 0);
        result = 31 * result + (releaseMoneyPercentage != null ? releaseMoneyPercentage.hashCode() : 0);
        result = 31 * result + (releaseMoney != null ? releaseMoney.hashCode() : 0);
        result = 31 * result + (interestPayFrequency != null ? interestPayFrequency.hashCode() : 0);
        result = 31 * result + (estimatedInterestRate != null ? estimatedInterestRate.hashCode() : 0);
        return result;
    }
}
