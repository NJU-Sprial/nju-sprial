package vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by zjy on 2017/9/2.
 * 单个产品的信息
 */
@Data
public class ProductVO {
    private String productID;
    private String productName;//产品名称
    private String quantity;//发行总额
    private Double interestUpperBound;//利率区间上界
    private Double interestLowerBound;//利率区间下界
    private String ratingResult;//评级结果
    private String sponsor;//发起机构
    private String issuer;//发行机构
    private String assetType;//资产类型
    private String tradingPlace;//交易场所
    private LocalDateTime estimatedMaturityDate;//预计到期日
    private LocalDateTime termOfRecruitment;//募集期限
}
