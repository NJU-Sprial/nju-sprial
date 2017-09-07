package po;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by yinywf on 2017/9/7
 */
@Entity
@Table(name = "unissued_product", schema = "sprial")
public class UnissuedProductPO implements Serializable {
    private static final long serialVersionUID = 2975736321996617316L;
    private int projectId;
    private int propertyPackageId;
    private LocalDateTime packetDate;
    private String analysisResult;
    private String recommendedLevel;
    private String ratingResult;

    @Basic
    @Column(name = "project_id")
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Id
    @Column(name = "property_package_id")
    public int getPropertyPackageId() {
        return propertyPackageId;
    }

    public void setPropertyPackageId(int propertyPackageId) {
        this.propertyPackageId = propertyPackageId;
    }

    @Basic
    @Column(name = "packet_date")
    public LocalDateTime getPacketDate() {
        return packetDate;
    }

    public void setPacketDate(LocalDateTime packetDate) {
        this.packetDate = packetDate;
    }

    @Basic
    @Column(name = "analysis_result")
    public String getAnalysisResult() {
        return analysisResult;
    }

    public void setAnalysisResult(String analysisResult) {
        this.analysisResult = analysisResult;
    }

    @Basic
    @Column(name = "recommended_level")
    public String getRecommendedLevel() {
        return recommendedLevel;
    }

    public void setRecommendedLevel(String recommendedLevel) {
        this.recommendedLevel = recommendedLevel;
    }

    @Basic
    @Column(name = "rating_result")
    public String getRatingResult() {
        return ratingResult;
    }

    public void setRatingResult(String ratingResult) {
        this.ratingResult = ratingResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UnissuedProductPO that = (UnissuedProductPO) o;

        if (projectId != that.projectId) return false;
        if (propertyPackageId != that.propertyPackageId) return false;
        if (packetDate != null ? !packetDate.equals(that.packetDate) : that.packetDate != null) return false;
        if (analysisResult != null ? !analysisResult.equals(that.analysisResult) : that.analysisResult != null)
            return false;
        if (recommendedLevel != null ? !recommendedLevel.equals(that.recommendedLevel) : that.recommendedLevel != null)
            return false;
        if (ratingResult != null ? !ratingResult.equals(that.ratingResult) : that.ratingResult != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectId;
        result = 31 * result + propertyPackageId;
        result = 31 * result + (packetDate != null ? packetDate.hashCode() : 0);
        result = 31 * result + (analysisResult != null ? analysisResult.hashCode() : 0);
        result = 31 * result + (recommendedLevel != null ? recommendedLevel.hashCode() : 0);
        result = 31 * result + (ratingResult != null ? ratingResult.hashCode() : 0);
        return result;
    }
}
