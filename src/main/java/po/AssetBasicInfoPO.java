package po;

import lombok.Data;

@Data
public class AssetBasicInfoPO {
    //以下为查询传入的参数 数据库可以判断一下怎么建表...
    private String username;
    private String projectName;
    private String packageId;
    private int type;
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

}
