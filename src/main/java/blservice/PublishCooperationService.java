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
     * 获取贷款表格
     * @return 返回贷款表格
     */
    public File getLoanFile(LoanType loanType);

    /**
     * 上传贷款文件
     * @return 上传是否成功,如果失败将返回失败原因
     */
    public UploadResult uploadLoanFile(String projectID, File file, LoanType loanType);

}
