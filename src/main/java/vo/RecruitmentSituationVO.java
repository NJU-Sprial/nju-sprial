package vo;

import lombok.Data;

/**
 * Created by zjy on 2017/9/2.
 * 单个产品的募集情况的单个投资人的投资信息
 */
@Data
public class RecruitmentSituationVO {

    public String investor;//投资人
    public String amount;//投资金额
    public String rate;//投资利率

    public RecruitmentSituationVO() {

    }

    public RecruitmentSituationVO(String investor, String amount, String rate) {
        this.investor = investor;
        this.amount = amount;
        this.rate = rate;
    }
}
