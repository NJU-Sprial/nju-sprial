package po;

import lombok.Data;

/**
 * Created by yinywf on 2017/9/7
 */
@Data
public class RecruitmentSituationPO {

    public String investor;//投资人
    public String amount;//投资金额
    public String rate;//投资利率

    public RecruitmentSituationPO() {

    }

    public RecruitmentSituationPO(String investor, String amount, String rate) {
        this.investor = investor;
        this.amount = amount;
        this.rate = rate;
    }
}
