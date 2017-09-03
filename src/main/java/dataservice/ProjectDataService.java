package dataservice;


import po.ProjectInfoPO;

import java.util.List;

/**
 * Created by CYF on 2017/9/3.
 */
public interface ProjectDataService {

    /**
     * 浏览某项目的贷款信息，一个项目包含至少一笔贷款
     *
     * @param pname
     * @return
     */
    public List<ProjectInfoPO> browseProject(String pname);

    /**
     * 根据贷款合同编号搜索该贷款信息
     *
     * @param loanCode
     * @return
     */
    public ProjectInfoPO searchLoan(String loanCode);

    /**
     * 修改一笔或多笔贷款信息
     *
     * @param projectInfoPOList
     * @return
     */
    public boolean alterLoan(List<ProjectInfoPO> projectInfoPOList);

    /**
     * 删除一笔贷款信息
     *
     * @param loanCode
     * @return
     */
    public boolean deleteLoan(String loanCode);
}
