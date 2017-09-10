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
    private Double interestUpperBound;//利率区间上界,如0.06
    private Double interestLowerBound;//利率区间下界,如0.03
    private String ratingResult;//评级结果
    private String sponsor;//发起机构
    private String issuer;//发行机构
    private String assetType;//资产类型
    private String tradingPlace;//交易场所
    private LocalDateTime estimatedMaturityDate;//预计到期日
    private LocalDateTime termOfRecruitment;//募集期限

    public ProductVO(String productID, String productName, String quantity, Double interestUpperBound, Double interestLowerBound,
                     String ratingResult, String sponsor, String issuer, String assetType, String tradingPlace,
                     LocalDateTime estimatedMaturityDate, LocalDateTime termOfRecruitment) {
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.interestUpperBound = interestUpperBound;
        this.interestLowerBound = interestLowerBound;
        this.ratingResult = ratingResult;
        this.sponsor = sponsor;
        this.issuer = issuer;
        this.assetType = assetType;
        this.tradingPlace = tradingPlace;
        this.estimatedMaturityDate = estimatedMaturityDate;
        this.termOfRecruitment = termOfRecruitment;
    }

    public ProductVO() {
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Double getInterestUpperBound() {
        return interestUpperBound;
    }

    public void setInterestUpperBound(Double interestUpperBound) {
        this.interestUpperBound = interestUpperBound;
    }

    public Double getInterestLowerBound() {
        return interestLowerBound;
    }

    public void setInterestLowerBound(Double interestLowerBound) {
        this.interestLowerBound = interestLowerBound;
    }

    public String getRatingResult() {
        return ratingResult;
    }

    public void setRatingResult(String ratingResult) {
        this.ratingResult = ratingResult;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getTradingPlace() {
        return tradingPlace;
    }

    public void setTradingPlace(String tradingPlace) {
        this.tradingPlace = tradingPlace;
    }

    public LocalDateTime getEstimatedMaturityDate() {
        return estimatedMaturityDate;
    }

    public void setEstimatedMaturityDate(LocalDateTime estimatedMaturityDate) {
        this.estimatedMaturityDate = estimatedMaturityDate;
    }

    public LocalDateTime getTermOfRecruitment() {
        return termOfRecruitment;
    }

    public void setTermOfRecruitment(LocalDateTime termOfRecruitment) {
        this.termOfRecruitment = termOfRecruitment;
    }
}
