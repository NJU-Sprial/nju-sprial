package po;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yinywf on 2017/9/7
 */
@Entity
@Table(name = "project_coordinator", schema = "sprial")
@DynamicUpdate
@DynamicInsert
public class ProjectCoordinatorPO implements Serializable {
    private static final long serialVersionUID = 3437823402639962217L;
    private int projectId;
    private String coordinator;
    private int id;

    @Basic
    @Column(name = "project_id")
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Basic
    @Column(name = "coordinator")
    public String getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(String coordinator) {
        this.coordinator = coordinator;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectCoordinatorPO that = (ProjectCoordinatorPO) o;

        if (projectId != that.projectId) return false;
        if (id != that.id) return false;
        if (coordinator != null ? !coordinator.equals(that.coordinator) : that.coordinator != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectId;
        result = 31 * result + (coordinator != null ? coordinator.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
