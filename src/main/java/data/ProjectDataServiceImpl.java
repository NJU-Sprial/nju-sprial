package data;

import dataservice.ProjectDataService;
import org.springframework.stereotype.Service;
import po.ProjectInfoPO;

import java.util.List;

/**
 * Created by Water on 2017/9/5.
 */
@Service
public class ProjectDataServiceImpl implements ProjectDataService {
    /**
     * 浏览某项目的贷款信息，一个项目包含至少一笔贷款
     *
     * @param username
     * @param pname
     * @return
     */
    @Override
    public List<ProjectInfoPO> browseProject(String username, String pname) {
        return null;
    }

    /**
     * 根据贷款合同编号搜索该贷款信息
     *
     * @param username
     * @param loanCode
     * @return
     */
    @Override
    public ProjectInfoPO searchLoan(String username, String loanCode) {
        return null;
    }

    /**
     * 修改一笔或多笔贷款信息
     *
     * @param username
     * @param projectInfoPOList
     * @return
     */
    @Override
    public boolean alterLoan(String username, List<ProjectInfoPO> projectInfoPOList) {
        return false;
    }

    /**
     * 删除一笔贷款信息
     *
     * @param username
     * @param loanCode
     * @return
     */
    @Override
    public boolean deleteLoan(String username, String loanCode) {
        return false;
    }

    /**
     * 数据清空，选择项目名称，删除整个项目及该项目资产池所有数据，包括基础资产数据、资产包、产品设计方案等等
     *
     * @param username
     * @param pname
     * @return
     */
    @Override
    public boolean clearProjectData(String username, String pname) {
        return false;
    }
}
