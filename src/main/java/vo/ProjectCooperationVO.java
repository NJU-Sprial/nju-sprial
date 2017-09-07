package vo;

import lombok.Data;

import java.util.List;

/**
 * Created by LENOVO on 2017/9/3.
 */
@Data
public class ProjectCooperationVO {
    String projectID;
    String projectName; //项目名称
    String projectProgress;   //项目进度
    List<PartnerVO> partnerInfo;   //协作方人员信息
}
