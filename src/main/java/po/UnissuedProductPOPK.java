package po;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by yinywf on 2017/9/7
 */
public class UnissuedProductPOPK implements Serializable {
    private int projectId;
    private int propertyPackageId;

    @Column(name = "project_id")
    @Id
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Column(name = "property_package_id")
    @Id
    public int getPropertyPackageId() {
        return propertyPackageId;
    }

    public void setPropertyPackageId(int propertyPackageId) {
        this.propertyPackageId = propertyPackageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UnissuedProductPOPK that = (UnissuedProductPOPK) o;

        if (projectId != that.projectId) return false;
        if (propertyPackageId != that.propertyPackageId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectId;
        result = 31 * result + propertyPackageId;
        return result;
    }
}
