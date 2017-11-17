package po;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by yinywf on 2017/9/7
 * @author 凡
 */
@Entity
@Table(name = "property_package", schema = "sprial")
@DynamicUpdate
@DynamicInsert
public class PropertyPackagePO implements Serializable {
    private static final long serialVersionUID = -9086466693313733723L;
    private int propertyPackageId;
    private Integer projectId;
    private Integer propertyNum;
    private LocalDateTime packageDate;
    private Double packageCapital;
    private Double packageRate;
    private String pname;
    private String packageName;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "property_package_id")
    public int getPropertyPackageId() {
        return propertyPackageId;
    }

    public void setPropertyPackageId(int propertyPackageId) {
        this.propertyPackageId = propertyPackageId;
    }

    @Basic
    @Column(name = "project_id")
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Basic
    @Column(name = "property_num")
    public Integer getPropertyNum() {
        return propertyNum;
    }

    public void setPropertyNum(Integer propertyNum) {
        this.propertyNum = propertyNum;
    }

    @Basic
    @Column(name = "package_date")
    public LocalDateTime getPackageDate() {
        return packageDate;
    }

    public void setPackageDate(LocalDateTime packageDate) {
        this.packageDate = packageDate;
    }

    @Basic
    @Column(name = "package_capital")
    public Double getPackageCapital() {
        return packageCapital;
    }

    public void setPackageCapital(Double packageCapital) {
        this.packageCapital = packageCapital;
    }

    @Basic
    @Column(name = "package_rate")
    public Double getPackageRate() {
        return packageRate;
    }

    public void setPackageRate(Double packageRate) {
        this.packageRate = packageRate;
    }

    @Basic
    @Column(name = "pname")
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "package_name")
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PropertyPackagePO that = (PropertyPackagePO) o;

        if (propertyPackageId != that.propertyPackageId) return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null) return false;
        if (propertyNum != null ? !propertyNum.equals(that.propertyNum) : that.propertyNum != null) return false;
        if (packageDate != null ? !packageDate.equals(that.packageDate) : that.packageDate != null) return false;
        if (packageCapital != null ? !packageCapital.equals(that.packageCapital) : that.packageCapital != null)
            return false;
        if (packageRate != null ? !packageRate.equals(that.packageRate) : that.packageRate != null) return false;
        if (pname != null ? !pname.equals(that.pname) : that.pname != null) return false;
        return packageName != null ? packageName.equals(that.packageName) : that.packageName == null;
    }

    @Override
    public int hashCode() {
        int result = propertyPackageId;
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (propertyNum != null ? propertyNum.hashCode() : 0);
        result = 31 * result + (packageDate != null ? packageDate.hashCode() : 0);
        result = 31 * result + (packageCapital != null ? packageCapital.hashCode() : 0);
        result = 31 * result + (packageRate != null ? packageRate.hashCode() : 0);
        result = 31 * result + (pname != null ? pname.hashCode() : 0);
        result = 31 * result + (packageName != null ? packageName.hashCode() : 0);
        return result;
    }
}
