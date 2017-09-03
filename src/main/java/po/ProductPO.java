package po;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "product", schema = "sprial")
public class ProductPO implements Serializable {
    private static final long serialVersionUID = 7899450049039588866L;
    private int productId;
    private String productName;
    private Double quantity;
    private Double interestUpperBound;
    private Double interestLowerBound;
    private String ratingResult;
    private String sponsor;
    private String issuer;
    private String assetType;
    private String tradingPlace;
    private Timestamp estimatedMaturityDate;
    private Timestamp termOfRecruitment;

    @Id
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "quantity")
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "interest_upper_bound")
    public Double getInterestUpperBound() {
        return interestUpperBound;
    }

    public void setInterestUpperBound(Double interestUpperBound) {
        this.interestUpperBound = interestUpperBound;
    }

    @Basic
    @Column(name = "interest_lower_bound")
    public Double getInterestLowerBound() {
        return interestLowerBound;
    }

    public void setInterestLowerBound(Double interestLowerBound) {
        this.interestLowerBound = interestLowerBound;
    }

    @Basic
    @Column(name = "rating_result")
    public String getRatingResult() {
        return ratingResult;
    }

    public void setRatingResult(String ratingResult) {
        this.ratingResult = ratingResult;
    }

    @Basic
    @Column(name = "sponsor")
    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    @Basic
    @Column(name = "issuer")
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Basic
    @Column(name = "asset_type")
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    @Basic
    @Column(name = "trading_place")
    public String getTradingPlace() {
        return tradingPlace;
    }

    public void setTradingPlace(String tradingPlace) {
        this.tradingPlace = tradingPlace;
    }

    @Basic
    @Column(name = "estimated_maturity_date")
    public Timestamp getEstimatedMaturityDate() {
        return estimatedMaturityDate;
    }

    public void setEstimatedMaturityDate(Timestamp estimatedMaturityDate) {
        this.estimatedMaturityDate = estimatedMaturityDate;
    }

    @Basic
    @Column(name = "term_of_recruitment")
    public Timestamp getTermOfRecruitment() {
        return termOfRecruitment;
    }

    public void setTermOfRecruitment(Timestamp termOfRecruitment) {
        this.termOfRecruitment = termOfRecruitment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductPO productPO = (ProductPO) o;

        if (productId != productPO.productId) return false;
        if (productName != null ? !productName.equals(productPO.productName) : productPO.productName != null)
            return false;
        if (quantity != null ? !quantity.equals(productPO.quantity) : productPO.quantity != null) return false;
        if (interestUpperBound != null ? !interestUpperBound.equals(productPO.interestUpperBound) : productPO.interestUpperBound != null)
            return false;
        if (interestLowerBound != null ? !interestLowerBound.equals(productPO.interestLowerBound) : productPO.interestLowerBound != null)
            return false;
        if (ratingResult != null ? !ratingResult.equals(productPO.ratingResult) : productPO.ratingResult != null)
            return false;
        if (sponsor != null ? !sponsor.equals(productPO.sponsor) : productPO.sponsor != null) return false;
        if (issuer != null ? !issuer.equals(productPO.issuer) : productPO.issuer != null) return false;
        if (assetType != null ? !assetType.equals(productPO.assetType) : productPO.assetType != null) return false;
        if (tradingPlace != null ? !tradingPlace.equals(productPO.tradingPlace) : productPO.tradingPlace != null)
            return false;
        if (estimatedMaturityDate != null ? !estimatedMaturityDate.equals(productPO.estimatedMaturityDate) : productPO.estimatedMaturityDate != null)
            return false;
        if (termOfRecruitment != null ? !termOfRecruitment.equals(productPO.termOfRecruitment) : productPO.termOfRecruitment != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (interestUpperBound != null ? interestUpperBound.hashCode() : 0);
        result = 31 * result + (interestLowerBound != null ? interestLowerBound.hashCode() : 0);
        result = 31 * result + (ratingResult != null ? ratingResult.hashCode() : 0);
        result = 31 * result + (sponsor != null ? sponsor.hashCode() : 0);
        result = 31 * result + (issuer != null ? issuer.hashCode() : 0);
        result = 31 * result + (assetType != null ? assetType.hashCode() : 0);
        result = 31 * result + (tradingPlace != null ? tradingPlace.hashCode() : 0);
        result = 31 * result + (estimatedMaturityDate != null ? estimatedMaturityDate.hashCode() : 0);
        result = 31 * result + (termOfRecruitment != null ? termOfRecruitment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProductPO{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", interestUpperBound=" + interestUpperBound +
                ", interestLowerBound=" + interestLowerBound +
                ", ratingResult='" + ratingResult + '\'' +
                ", sponsor='" + sponsor + '\'' +
                ", issuer='" + issuer + '\'' +
                ", assetType='" + assetType + '\'' +
                ", tradingPlace='" + tradingPlace + '\'' +
                ", estimatedMaturityDate=" + estimatedMaturityDate +
                ", termOfRecruitment=" + termOfRecruitment +
                '}';
    }
}
