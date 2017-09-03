package vo;

import lombok.Data;

import java.time.LocalDate;

/**
 * Created by 铠联 on 2017/9/3.
 * 属性安序分别为资产包编号、资产数量、封包日期、资产包封包本金金额、封包利率
 */
@Data
public class PropertyPackageVO {
    private String pname;
    private String packageNumber;
    private int propertyNum;
    private LocalDate packageDate;
    private double packageCapital;
    private double packageRate;
}
