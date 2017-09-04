package po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by CYF on 2017/9/3.
 */
@Entity
@Table(name = "property_package", schema = "sprial")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyPackagePO {
    private String pname;
    private String packageNumber;
    private int propertyNum;
    private LocalDateTime packageDate;
    private double packageCapital;
    private double packageRate;

    @Id
    @Column(name = "pname")
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "package_number")
    public String getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(String packageNumber) {
        this.packageNumber = packageNumber;
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
    public double getPackageCapital() {
        return packageCapital;
    }

    public void setPackageCapital(double packageCapital) {
        this.packageCapital = packageCapital;
    }

    @Basic
    @Column(name = "package_rate")
    public double getPackageRate() {
        return packageRate;
    }

    public void setPackageRate(double packageRate) {
        this.packageRate = packageRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PropertyPackagePO that = (PropertyPackagePO) o;

        if (propertyNum != that.propertyNum) return false;
        if (Double.compare(that.packageCapital, packageCapital) != 0) return false;
        if (Double.compare(that.packageRate, packageRate) != 0) return false;
        if (pname != null ? !pname.equals(that.pname) : that.pname != null) return false;
        if (packageNumber != null ? !packageNumber.equals(that.packageNumber) : that.packageNumber != null)
            return false;
        if (packageDate != null ? !packageDate.equals(that.packageDate) : that.packageDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = pname != null ? pname.hashCode() : 0;
        result = 31 * result + (packageNumber != null ? packageNumber.hashCode() : 0);
        result = 31 * result + propertyNum;
        result = 31 * result + (packageDate != null ? packageDate.hashCode() : 0);
        temp = Double.doubleToLongBits(packageCapital);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(packageRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


}
