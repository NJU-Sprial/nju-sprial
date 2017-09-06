package vo;

/**
 * Created by zjy on 2017/9/6.
 * 产品在线设计>产品设计>方案设计 点击分析方案后得到的一系列参数
 */
public class ConceptualParameterVO {

    private String securityType;
    private String priority;
    private String securityAbbreviation;
    private String issueAmountProportion;
    private String issueAmount;
    private String interestPaymentFrequency;
    private String interestRate;

    /**
     *
     * @param securityType 证券类型
     * @param priority 优先级
     * @param securityAbbreviation 证券简称
     * @param issueAmountProportion 发行金额占比（%），如"35.5%"
     * @param issueAmount 发行金额，如"￥100000"，或者"5 万元"，格式自定
     * @param interestPaymentFrequency 付息频率，如"每月1次"，格式自定
     * @param interestRate 试算利率，如"5.6% - 7.9%"，格式自定
     */
    public ConceptualParameterVO(String securityType, String priority, String securityAbbreviation, String issueAmountProportion,
                                 String issueAmount, String interestPaymentFrequency, String interestRate) {
        this.securityType = securityType;
        this.priority = priority;
        this.securityAbbreviation = securityAbbreviation;
        this.issueAmountProportion = issueAmountProportion;
        this.issueAmount = issueAmount;
        this.interestPaymentFrequency = interestPaymentFrequency;
        this.interestRate = interestRate;
    }

    public String getSecurityType() {
        return securityType;
    }

    public String getPriority() {
        return priority;
    }

    public String getSecurityAbbreviation() {
        return securityAbbreviation;
    }

    public String getIssueAmountProportion() {
        return issueAmountProportion;
    }

    public String getIssueAmount() {
        return issueAmount;
    }

    public String getInterestPaymentFrequency() {
        return interestPaymentFrequency;
    }

    public String getInterestRate() {
        return interestRate;
    }
}
