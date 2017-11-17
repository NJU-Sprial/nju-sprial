package blservice;

import enums.LoanType;
import enums.UploadResult;
import vo.ProjectCooperationVO;

import java.io.File;
import java.util.List;

/**
 * Created by xiaoJun on 2017/9/3.
 * 券商 发行协作服务
 */
public interface PublishCooperationService {

    /**
     * 获取用户所有的项目
     * @return 项目列表
     */
    public List<ProjectCooperationVO> getCooperationProjectList(String username);

    /**
     * 返回项目文件
     * @return 返回贷款表格
     */
    File getProjectFile(String projectID);

    /**
     * 上传项目文件
     * @return 上传是否成功,如果失败将返回失败原因
     */
    UploadResult uploadProjectFile(String projectID, File file, LoanType loanType);
}
