package vo;

/**
 * Created by 铠联 on 2017/9/13.
 */
public class ProjectVO {
    private String username;
    private String pname;

    public ProjectVO(String username, String pname) {
        this.username = username;
        this.pname = pname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
