package vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Created by zjy on 2017/9/12.
 * 资产池变动情况的一条记录
 */
@Data
@NoArgsConstructor
public class AssetPoolChangeLogVO {
    private LocalDate announcementDate;
    private LocalDate receiptStartDate;
    private LocalDate receiptEndDate;
    private double initialPrincipalBalance;
    private double finalPrincipalBalance;
    private int loanNum;
    private double principalRecoveryBalance;
    private double interestRecoveryBalance;
    private double principalRecoveryRate;
    private double aveLoanRate;
    private double aveLeftMonth;

    /**
     *
     * @param announcementDate 公告日期
     * @param receiptStartDate 收款起始日
     * @param receiptEndDate 收款截止日
     * @param initialPrincipalBalance 期初本金余额（元）
     * @param finalPrincipalBalance 期末本金余额（元）
     * @param loanNum 贷款笔数
     * @param principalRecoveryBalance 本金回收金额（元）
     * @param interestRecoveryBalance 利息回收金额（元）
     * @param principalRecoveryRate 本金回收占比（0-1），如0.05
     * @param aveLoanRate 加权平均贷款利率（0-1），如0.05
     * @param aveLeftMonth 加权平均剩余期限（月），如11.47
     */
    public AssetPoolChangeLogVO(LocalDate announcementDate, LocalDate receiptStartDate, LocalDate receiptEndDate,
                                double initialPrincipalBalance, double finalPrincipalBalance, int loanNum,
                                double principalRecoveryBalance, double interestRecoveryBalance, double principalRecoveryRate,
                                double aveLoanRate, double aveLeftMonth) {
        this.announcementDate = announcementDate;
        this.receiptStartDate = receiptStartDate;
        this.receiptEndDate = receiptEndDate;
        this.initialPrincipalBalance = initialPrincipalBalance;
        this.finalPrincipalBalance = finalPrincipalBalance;
        this.loanNum = loanNum;
        this.principalRecoveryBalance = principalRecoveryBalance;
        this.interestRecoveryBalance = interestRecoveryBalance;
        this.principalRecoveryRate = principalRecoveryRate;
        this.aveLoanRate = aveLoanRate;
        this.aveLeftMonth = aveLeftMonth;
    }
}
