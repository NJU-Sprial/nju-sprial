package vo;

/**
 * Created by zjy on 2017/9/10.
 * 投资者 > 浏览产品 > 资产池信息的内容
 */
public class AssetPoolVO {
    private String productID;
    private String quantity;//发行总额
    private String leftQuantity;//剩余额度
    private int numOfBorrowers;//借款人数量
    private int numOfLoan;//交易场所贷款笔数
    private double highestAmount;//单笔贷款最高金额
    private double aveAmount;//单笔贷款平均金额
    private double highestRate;//单笔贷款最高利率
    private double aveRate;//加权平均贷款利率
    private double highestLeftMonth;//单笔贷款最长剩余期限（月）
    private double aveMonth;//加权平均贷款合同期限（月）
    private double aveLeftMonth;//加权平均最长剩余期限（月）

    /**
     *
     * @param productID 产品ID
     * @param quantity 发行总额（元），如"￥10000"
     * @param leftQuantity 剩余额度（元），如"￥5000"
     * @param numOfBorrowers 借款人数量，如48
     * @param numOfLoan 交易场所贷款笔数，如116
     * @param highestAmount 单笔贷款最高金额（元），如2000
     * @param aveAmount 单笔贷款平均金额（元），如1000
     * @param highestRate 单笔贷款最高利率，如0.105
     * @param aveRate 加权平均贷款利率，如0.0792
     * @param highestLeftMonth 单笔贷款最长剩余期限（月），如15
     * @param aveMonth 加权平均贷款合同期限（月），如7.3
     * @param aveLeftMonth 加权平均最长剩余期限（月），如4.3
     */
    public AssetPoolVO(String productID, String quantity, String leftQuantity, int numOfBorrowers,
                       int numOfLoan, double highestAmount, double aveAmount, double highestRate,
                       double aveRate, double highestLeftMonth, double aveMonth, double aveLeftMonth) {
        this.productID = productID;
        this.quantity = quantity;
        this.leftQuantity = leftQuantity;
        this.numOfBorrowers = numOfBorrowers;
        this.numOfLoan = numOfLoan;
        this.highestAmount = highestAmount;
        this.aveAmount = aveAmount;
        this.highestRate = highestRate;
        this.aveRate = aveRate;
        this.highestLeftMonth = highestLeftMonth;
        this.aveMonth = aveMonth;
        this.aveLeftMonth = aveLeftMonth;
    }

    public String getProductID() {
        return productID;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getLeftQuantity() {
        return leftQuantity;
    }

    public int getNumOfBorrowers() {
        return numOfBorrowers;
    }

    public int getNumOfLoan() {
        return numOfLoan;
    }

    public double getHighestAmount() {
        return highestAmount;
    }

    public double getAveAmount() {
        return aveAmount;
    }

    public double getHighestRate() {
        return highestRate;
    }

    public double getAveRate() {
        return aveRate;
    }

    public double getHighestLeftMonth() {
        return highestLeftMonth;
    }

    public double getAveMonth() {
        return aveMonth;
    }

    public double getAveLeftMonth() {
        return aveLeftMonth;
    }
}
