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

    /**
     * 资产包创建,后台自动根据模型筛选基础资产，生成资产包，并自动生成资产包编号、资产数量、封包日期、资产包封包本金金额、封包利率
     * 每个项目最多只能有5个资产包(交给前端判断)
     * @param pname
     * @return
     */
    public PropertyPackagePO createPropertyPackage(String username, String pname);

    /**
     * 根据资产包编号搜索资产包并返回资产包信息
     * @param packageNumber
     * @return
     */
    public PropertyPackagePO searchPropertyPackage(String username, String packageNumber);

    /**
     * 修改资产包信息
     * @param propertyPackagePO
     * @return
     */
    public boolean alterPropertyPackage(String username, PropertyPackagePO propertyPackagePO);

    /**
     * 删除一个资产包
     * @param packageNumber
     * @return
     */
    public boolean deletePropertyPackage(String username, String packageNumber);


}
