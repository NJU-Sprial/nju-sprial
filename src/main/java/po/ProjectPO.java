package po;

import javax.persistence.*;

/**
 * Created by yinywf on 2017/9/7
 */
@Entity
@Table(name = "project", schema = "sprial")
public class ProjectPO {
    private int id;
    private String projectName;
    private String owner;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectPO projectPO = (ProjectPO) o;

        if (id != projectPO.id) return false;
        if (projectName != null ? !projectName.equals(projectPO.projectName) : projectPO.projectName != null)
            return false;
        if (owner != null ? !owner.equals(projectPO.owner) : projectPO.owner != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        return result;
    }
}
