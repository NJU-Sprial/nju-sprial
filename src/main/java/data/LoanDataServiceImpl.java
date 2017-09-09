package data;

import dao.*;
import dataservice.LoanDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import po.LoanPO;
import po.ProjectPO;

import java.util.List;

/**
 * Created by Water on 2017/9/5.
 */
@Service("LoanDataService")
@Transactional
public class LoanDataServiceImpl implements LoanDataService {
    @Autowired
    ProjectDao projectDao;
    @Autowired
    LoanDao loanDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    UnissuedProductDao unissuedProductDao;
    @Autowired
    PropertyPackageDao propertyPackageDao;

    /**
     * 浏览某项目的贷款信息，一个项目包含至少一笔贷款
     *
     * @param username
     * @param pname
     * @return
     */
    @Override
    public List<LoanPO> browseProject(String username, String pname) {
        String hql = "from ProjectPO p where p.owner = ? and p.projectName = ?";
        ProjectPO projectPO = projectDao.findUnique(hql,username,pname);
        List<LoanPO> loanPOS = loanDao.find("from LoanPO where projectId = ? ",projectPO.getId());
        return loanPOS;

    }

    /**
     * 根据贷款合同编号搜索该贷款信息
     *
     * @param username
     * @param loanCode
     * @return
     */
    @Override
    public LoanPO searchLoan(String username, String loanCode) {
        return loanDao.get(loanCode);
    }

    /**
     * 修改一笔或多笔贷款信息
     *
     * @param username
     * @param loanPOList
     * @return
     */
    @Override
    public boolean alterLoan(String username, String projectName, List<LoanPO> loanPOList) {
        try {
            for(LoanPO loanPO:loanPOList){
                loanDao.save(loanPO);
            }
        }catch (Exception e){
            return false;
        }

        return true;
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
        try {
           loanDao.delete(loanCode);
        }catch (Exception e){
            return false;
        }

        return true;
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
        String hql = "from ProjectPO p where p.owner = ? and p.projectName = ?";
        ProjectPO projectPO = projectDao.findUnique(hql,username,pname);
        if (projectPO==null){
            return false;
        }
        int projectId = projectPO.getId();
        try {
            projectDao.delete(projectId);
            productDao.batchExecute("delete from ProductPO where projectId = ?",projectId);
            unissuedProductDao.batchExecute("delete from UnissuedProductPO where projectId = ?",projectId);
            propertyPackageDao.batchExecute("delete from PropertyPackagePO where projectId = ?",projectId);
            loanDao.batchExecute("delete from LoanPO where projectId = ?",projectId);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
