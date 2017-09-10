package po;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yinywf on 2017/9/7
 */
@Entity
@Table(name = "project", schema = "sprial", uniqueConstraints = {@UniqueConstraint(columnNames={"project_name", "owner"})})
@DynamicUpdate
@DynamicInsert
public class ProjectPO implements Serializable {
    private static final long serialVersionUID = -8533293860401888189L;
    private int id;
    private String projectName;
    private String owner;
    private String projectProgress;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "project_name")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Basic
    @Column(name = "owner")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Basic
    @Column(name = "project_progress")
    public String getProjectProgress() {
        return projectProgress;
    }

    public void setProjectProgress(String projectProgress) {
        this.projectProgress = projectProgress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectPO projectPO = (ProjectPO) o;

        if (id != projectPO.id) return false;
        if (projectName != null ? !projectName.equals(projectPO.projectName) : projectPO.projectName != null)
            return false;
        if (owner != null ? !owner.equals(projectPO.owner) : projectPO.owner != null) return false;
        return projectProgress != null ? projectProgress.equals(projectPO.projectProgress) : projectPO.projectProgress == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (projectProgress != null ? projectProgress.hashCode() : 0);
        return result;
    }
}
