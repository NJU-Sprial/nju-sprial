package vo;

/**
 * Created by xiaoJun on 2017/9/11.
 * 资产基本信息
 */
public class AssetBasicInfoVO {
    /**
     * 入池资产基本信息
     */
    private int outstandingPrincipal;       //资产池未偿本金金额(万元)
    private int totalSecurity;              //证券发行总额(万元)
    private int totalContract;              //合同总金额(万元)
    private int brrowerNumeber;             //借款人数量(户)
    private int loanNumber;                 //贷款笔数(笔)
    private int maxPrincipal;               //单笔贷款最高本金金额(万元)
    private int avgPrincipal;               //单笔贷款平均本金金额(万元)
    private int borrowerAvgPrincipal;        //借款人贷款平均本金金额(万元)
    private int maxContract;                //单笔贷款最高合同金额(万元)
    private int avgContract;                //单笔贷款平均合同金额(万元)

    /**
     * 入池资产期限特征
     */
    private int avgLoanContract;            //加权平均贷款合同期限(年)
    private int avgLoanRemain;              //加权平均贷款剩余期限(年)
    private int avgLoanAge;                 //加权平均贷款账龄(年)
    private int maxRemain;                  //单笔贷款最长剩余期限(年)
    private int minRemain;                  //单笔贷款最短剩余期限(年)

    /**
     * 入池资产信用状况
     */
    private double loanRate;                //正常类贷款占比(%)

    /**
     * 入池资产利率特征
     */
    private double avgLoanRate;             //加权平均贷款年利率(%)
    private double maxLoanRate;             //单笔贷款最高年利率(%)
    private double minLoanRate;             //单笔贷款最低年利率(%)
    private double floatRemainRate;         //浮动利率贷款剩余本金占比(%)

    /**
     * 入池资产集中度
     */
    private double maxFocusRate;            //借款金额最高的前五名借款人集中度(%)
    private double minFocusRate;            //借款金额最低的前十名借款人集中度(%)

    /**
     * 借款人特征
     */
    private int avgBorrowerAge;              //加权平均借款人年龄(岁)
    private double borrowerLoanRate;         //30-40岁借款人贷款金额占比(%)
    private int avgIncome;                  //借款人加权平均年收入(万元)
    private double avgIncomeLoanRate;       //借款人加权平均输入债务比(%)

    /**
     * 入池资产抵押物特征
     */
    private int totalCar;                   //抵押车辆初始合同价值合计(万元)
    private double loanValueRate;           //加权平均初始贷款价值比(LTV)

    public AssetBasicInfoVO(){
    }

    public AssetBasicInfoVO(int outstandingPrincipal, int totalSecurity, int totalContract, int brrowerNumeber,
                            int loanNumber, int maxPrincipal, int avgPrincipal, int borrowerAvgPrincipal, int maxContract,
                            int avgContract, int avgLoanContract, int avgLoanRemain, int avgLoanAge, int maxRemain, int minRemain,
                            double loanRate, double avgLoanRate, double maxLoanRate, double minLoanRate, double floatRemainRate,
                            double maxFocusRate, double minFocusRate, int avgBorrowerAge, double borrowerLoanRate, int avgIncome,
                            double avgIncomeLoanRate, int totalCar, double loanValueRate) {
        this.outstandingPrincipal = outstandingPrincipal;
        this.totalSecurity = totalSecurity;
        this.totalContract = totalContract;
        this.brrowerNumeber = brrowerNumeber;
        this.loanNumber = loanNumber;
        this.maxPrincipal = maxPrincipal;
        this.avgPrincipal = avgPrincipal;
        this.borrowerAvgPrincipal = borrowerAvgPrincipal;
        this.maxContract = maxContract;
        this.avgContract = avgContract;
        this.avgLoanContract = avgLoanContract;
        this.avgLoanRemain = avgLoanRemain;
        this.avgLoanAge = avgLoanAge;
        this.maxRemain = maxRemain;
        this.minRemain = minRemain;
        this.loanRate = loanRate;
        this.avgLoanRate = avgLoanRate;
        this.maxLoanRate = maxLoanRate;
        this.minLoanRate = minLoanRate;
        this.floatRemainRate = floatRemainRate;
        this.maxFocusRate = maxFocusRate;
        this.minFocusRate = minFocusRate;
        this.avgBorrowerAge = avgBorrowerAge;
        this.borrowerLoanRate = borrowerLoanRate;
        this.avgIncome = avgIncome;
        this.avgIncomeLoanRate = avgIncomeLoanRate;
        this.totalCar = totalCar;
        this.loanValueRate = loanValueRate;
    }

    public int getOutstandingPrincipal() {
        return outstandingPrincipal;
    }

    public int getTotalSecurity() {
        return totalSecurity;
    }

    public int getTotalContract() {
        return totalContract;
    }

    public int getBrrowerNumeber() {
        return brrowerNumeber;
    }

    public int getLoanNumber() {
        return loanNumber;
    }

    public int getMaxPrincipal() {
        return maxPrincipal;
    }

    public int getAvgPrincipal() {
        return avgPrincipal;
    }

    public int getBorrowerAvgPrincipal() {
        return borrowerAvgPrincipal;
    }

    public int getMaxContract() {
        return maxContract;
    }

    public int getAvgContract() {
        return avgContract;
    }

    public int getAvgLoanContract() {
        return avgLoanContract;
    }

    public int getAvgLoanRemain() {
        return avgLoanRemain;
    }

    public int getAvgLoanAge() {
        return avgLoanAge;
    }

    public int getMaxRemain() {
        return maxRemain;
    }

    public int getMinRemain() {
        return minRemain;
    }

    public double getLoanRate() {
        return loanRate;
    }

    public double getAvgLoanRate() {
        return avgLoanRate;
    }

    public double getMaxLoanRate() {
        return maxLoanRate;
    }

    public double getMinLoanRate() {
        return minLoanRate;
    }

    public double getFloatRemainRate() {
        return floatRemainRate;
    }

    public double getMaxFocusRate() {
        return maxFocusRate;
    }

    public double getMinFocusRate() {
        return minFocusRate;
    }

    public int getAvgBorrowerAge() {
        return avgBorrowerAge;
    }

    public double getBorrowerLoanRate() {
        return borrowerLoanRate;
    }

    public int getAvgIncome() {
        return avgIncome;
    }

    public double getAvgIncomeLoanRate() {
        return avgIncomeLoanRate;
    }

    public int getTotalCar() {
        return totalCar;
    }

    public double getLoanValueRate() {
        return loanValueRate;
    }
}
