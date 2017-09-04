package dataservice;


import po.ProjectInfoPO;
import po.PropertyPackagePO;

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
    public List<ProjectInfoPO> browseProject(String username, String pname);

    /**
     * 根据贷款合同编号搜索该贷款信息
     *
     * @param loanCode
     * @return
     */
    public ProjectInfoPO searchLoan(String username, String loanCode);

    /**
     * 修改一笔或多笔贷款信息
     *
     * @param projectInfoPOList
     * @return
     */
    public boolean alterLoan(String username, List<ProjectInfoPO> projectInfoPOList);

    /**
     * 删除一笔贷款信息
     *
     * @param loanCode
     * @return
     */
    public boolean deleteLoan(String username, String loanCode);

    /**
     * 数据清空，选择项目名称，删除整个项目及该项目资产池所有数据，包括基础资产数据、资产包、产品设计方案等等
     * @param pname
     * @return
     */
    public boolean clearProjectData(String username, String pname);
}
