package po;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by yinywf on 2017/9/7
 */
public class ProjectCoordinatorPOPK implements Serializable {
    private int projectId;
    private String coordinator;

    @Column(name = "project_id")
    @Id
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Column(name = "coordinator")
    @Id
    public String getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(String coordinator) {
        this.coordinator = coordinator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectCoordinatorPOPK that = (ProjectCoordinatorPOPK) o;

        if (projectId != that.projectId) return false;
        if (coordinator != null ? !coordinator.equals(that.coordinator) : that.coordinator != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectId;
        result = 31 * result + (coordinator != null ? coordinator.hashCode() : 0);
        return result;
    }
}
