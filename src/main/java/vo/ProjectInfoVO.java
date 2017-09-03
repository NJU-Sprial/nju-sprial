package vo;

import lombok.Data;

import java.time.LocalDate;

/**
 * Created by 铠联 on 2017/9/2.
 * 属性安序分别代表“贷款合同编号”、“提取日本金余额“、”当期年华利率“、”提取日期“、“到期日期”、“利率类型”、“还款方式”
 */
@Data
public class ProjectInfoVO {
    private String loanCode;
    private double balance;
    private double rate;
    private LocalDate fetchDate;
    private LocalDate endDate;
    private String rateType;
    private String returnWay;
}
