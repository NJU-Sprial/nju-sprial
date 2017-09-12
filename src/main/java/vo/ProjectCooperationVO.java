package vo;

import lombok.Data;

import java.util.List;

/**
 * Created by xiaoJun on 2017/9/3.
 */
@Data
public class ProjectCooperationVO {
    String projectID;
    String projectName; //项目名称
    String projectProgress;   //项目进度
    List<PartnerVO> partnerInfo;   //协作方人员信息

    public ProjectCooperationVO(String projectID, String projectName, String projectProgress, List<PartnerVO> partnerInfo) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.projectProgress = projectProgress;
        this.partnerInfo = partnerInfo;
    }

    public String getProjectID() {
        return projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectProgress() {
        return projectProgress;
    }

    public List<PartnerVO> getPartnerInfo() {
        return partnerInfo;
    }
}
