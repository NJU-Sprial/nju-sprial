package vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by zjy on 2017/9/2.
 * 单个产品的信息
 */
@Data
public class ProductVO {
    public String productID;
    public String productName;//产品名称
    public String quantity;//发行总额
    public double interestUpperBound;//利率区间上界
    public double interestLowerBound;//利率区间下界
    public String ratingResult;//评级结果
    public String sponsor;//发起机构
    public String issuer;//发行机构
    public String assetType;//资产类型
    public String tradingPlace;//交易场所
    public Date estimatedMaturityDate;//预计到期日
    public Date termOfRecruitment;//募集期限
}
