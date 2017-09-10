package vo;

import java.time.LocalDateTime;

/**
 * Created by zjy on 2017/9/10.
 * 投资者提交的订单信息
 */
public class SubmitOrderVO {
    private LocalDateTime time;
    private String productID;
    private String username;
    private double interestRate;
    private double amount;

    /**
     *
     * @param time 下单日期和时间
     * @param productID 产品编号
     * @param username 投资者用户名
     * @param interestRate 投资利率，不能超过1，如0.05，  另外，必须在产品的利率区间内
     * @param amount 投资金额（元），如10000
     */
    public SubmitOrderVO(LocalDateTime time, String productID, String username, double interestRate, double amount) {
        this.time = time;
        this.productID = productID;
        this.username = username;
        this.interestRate = interestRate;
        this.amount = amount;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getProductID() {
        return productID;
    }

    public String getUsername() {
        return username;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getAmount() {
        return amount;
    }
}
