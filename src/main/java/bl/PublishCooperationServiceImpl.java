package bl;

import blservice.PublishCooperationService;
import dataservice.ProjectCooperationDataService;
import enums.LoanType;
import enums.UploadResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.ProjectCooperationVO;

import java.io.File;
import java.util.List;

/**
 * Created by Water on 2017/9/7.
 */
@Service
public class PublishCooperationServiceImpl implements PublishCooperationService {

    private ProjectCooperationDataService projectCooperationDataService;

    @Autowired
    public PublishCooperationServiceImpl(ProjectCooperationDataService projectCooperationDataService) {
        this.projectCooperationDataService = projectCooperationDataService;
    }

    /**
     * 获取用户所有的项目
     * @param username
     * @return 项目列表
     */
    @Override
    public List<ProjectCooperationVO> getCooperationProjectList(String username) {
        return projectCooperationDataService.findCooperationProjects(username);
    }

    /**
     * 获取贷款表格
     * @param loanType
     * @return 返回贷款表格
     */
    @Override
    public File getLoanFile(LoanType loanType) {
        return null;
    }

    @Override
    public UploadResult uploadLoanFile(String projectID, File file, LoanType loanType) {
        return null;
    }

}
