package vo;

import enums.BondType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 铠联 on 2017/9/3.
 * 分档证券信息包括证券类型、试算优先级、证券简称、发行金额占比（%）、发行金额、付息频率、试算利率
 */
@Data
@NoArgsConstructor
public class ProductStrategyVO {
    private BondType bondType;
    private int priority;
    private String bondNameForShort;
    private double releaseMoneyPercentage;
    private double releaseMoney;
    private double interestPayFrequency;
    private double estimatedInterestRate;

    public ProductStrategyVO(BondType bondType, int priority, String bondNameForShort, double releaseMoneyPercentage,
                             double releaseMoney, double interestPayFrequency, double estimatedInterestRate) {
        this.bondType = bondType;
        this.priority = priority;
        this.bondNameForShort = bondNameForShort;
        this.releaseMoneyPercentage = releaseMoneyPercentage;
        this.releaseMoney = releaseMoney;
        this.interestPayFrequency = interestPayFrequency;
        this.estimatedInterestRate = estimatedInterestRate;
    }

    public BondType getBondType() {
        return bondType;
    }

    public int getPriority() {
        return priority;
    }

    public String getBondNameForShort() {
        return bondNameForShort;
    }

    public double getReleaseMoneyPercentage() {
        return releaseMoneyPercentage;
    }

    public double getReleaseMoney() {
        return releaseMoney;
    }

    public double getInterestPayFrequency() {
        return interestPayFrequency;
    }

    public double getEstimatedInterestRate() {
        return estimatedInterestRate;
    }
}
