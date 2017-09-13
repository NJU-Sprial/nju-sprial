package vo;

import java.time.LocalDate;

/**
 * Created by zjy on 2017/9/12.
 * 证券偿付情况的一条记录
 */
public class SecuritiesRepaymentVO {
    private LocalDate payDate;
    private LocalDate interestStartDate;
    private LocalDate interestEndDate;
    private double initialPrincipal;
    private double paidPrincipal;
    private double paidInterest;
    private double couponRate;

    /**
     *
     * @param payDate 支付日
     * @param interestStartDate 计息起始日
     * @param interestEndDate 计息结束日
     * @param initialPrincipal 本金期初金额（元）
     * @param paidPrincipal 支付本金（元）
     * @param paidInterest 支付利息（元）
     * @param couponRate 票面利率(0-1),如0.03
     */
    public SecuritiesRepaymentVO(LocalDate payDate, LocalDate interestStartDate, LocalDate interestEndDate, double initialPrincipal,
                                 double paidPrincipal, double paidInterest, double couponRate) {
        this.payDate = payDate;
        this.interestStartDate = interestStartDate;
        this.interestEndDate = interestEndDate;
        this.initialPrincipal = initialPrincipal;
        this.paidPrincipal = paidPrincipal;
        this.paidInterest = paidInterest;
        this.couponRate = couponRate;
    }
}
