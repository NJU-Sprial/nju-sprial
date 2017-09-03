package bl;

import blservice.OnlineDesignService;
import constranst.CashUnit;
import constranst.CycleUnit;
import dataservice.ProjectDataService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import po.ProjectInfoPO;
import vo.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CYF on 2017/9/3.
 */
public class OnlineDesignServiceImpl implements OnlineDesignService{
    private ProjectDataService projectDataService;

    @Autowired
    public OnlineDesignServiceImpl(ProjectDataService projectDataService){
        this.projectDataService = projectDataService;
    }

    /**
     * TODO
     * 导入基础资产数据,按照《消费金融资产池管理》中模板批量导入数据。提供下载数据模板，供券商填写后自动导入
     *
     * @param pname 项目名称
     * @param ptype 基础资产类型——目前只有“消费金融”一类
     * @param pway  消费用途，有三类，分为：第一类：个人消费贷款、信用卡分期付款、国家助学贷款；第二类：个人汽车贷款；第三类：
     *              个人住房贷款（包含装修、租借、购买）
     * @return
     */
    @Override
    public boolean importBasicPropertyData(String pname, String ptype, String pway) {
        return false;
    }

    /**
     * 浏览某项目的贷款信息，一个项目包含至少一笔贷款
     *
     * @param pname
     * @return
     */
    @Override
    public List<ProjectInfoVO> browseProject(String pname) {
        List<ProjectInfoPO> projectInfoPOList = projectDataService.browseProject(pname);
        List<ProjectInfoVO> projectInfoVOList = new ArrayList<>();
        for (ProjectInfoPO po:projectInfoPOList) {
            ProjectInfoVO vo = new ProjectInfoVO();
            BeanUtils.copyProperties(po,vo);
            projectInfoVOList.add(vo);
        }
        return projectInfoVOList;
    }

    /**
     * 根据贷款合同编号搜索该贷款信息
     *
     * @param loanCode
     * @return
     */
    @Override
    public ProjectInfoVO searchLoan(String loanCode) {
        ProjectInfoPO po = projectDataService.searchLoan(loanCode);
        ProjectInfoVO vo = new ProjectInfoVO();
        BeanUtils.copyProperties(po,vo);
        return vo;
    }

    /**
     * 修改一笔或多笔贷款信息
     *
     * @param projectInfoVOList
     * @return
     */
    @Override
    public boolean alterLoan(List<ProjectInfoVO> projectInfoVOList) {
        List<ProjectInfoPO> poList = new ArrayList<>();
        for (ProjectInfoVO vo:projectInfoVOList) {
            ProjectInfoPO po = new ProjectInfoPO();
            BeanUtils.copyProperties(vo,po);
            poList.add(po);
        }
        boolean result = projectDataService.alterLoan(poList);
        return result;
    }

    /**
     * 删除一笔贷款信息
     *
     * @param loanCode
     * @return
     */
    @Override
    public boolean deleteLoan(String loanCode) {
        boolean result = projectDataService.deleteLoan(loanCode);
        return result;
    }

    /**
     * 目前待定，需求不明
     * “批量导入”：导入批量文件，提供下载数据模板，供券商填写后批量导入数据
     * @param pname
     * @param projectInfoVOList
     * @return
     */
    @Override
    public boolean addMultiplePropertyData(String pname, List<ProjectInfoVO> projectInfoVOList) {
        return false;
    }

    @Override
    public boolean clearProjectData(String pname) {
        return false;
    }

    @Override
    public PropertyPackageVO createPropertyPackage(String pname) {
        return null;
    }

    @Override
    public PropertyPackageVO searchPropertyPackage(String packageNumber) {
        return null;
    }

    @Override
    public boolean alterPropertyPackage(PropertyPackageVO propertyPackageVO) {
        return false;
    }

    @Override
    public boolean deletePropertyPackage(String packageNumber) {
        return false;
    }

    @Override
    public AnalysisDataVO getAnalysisData(String pname, String packageNumber) {
        return null;
    }

    @Override
    public CashFlowDataVO getCashFlowDataVO(String pname, String packageNumber, int cycle, CycleUnit cycleUnit, int payDay, CashUnit cashUnit) {
        return null;
    }

    @Override
    public SceneAnalysisVO getSceneAnalysisVO(String pname, String packageNumber, LocalDate assessDate, double TotalBreakOffRate, double BreakOffCapitalRecoverRate) {
        return null;
    }

    @Override
    public ProductStrategyVO getProductStrategy(LocalDate startDate, LocalDate firstPayDate, LocalDate lawEndDate) {
        return null;
    }

    @Override
    public boolean saveProductStrategy(String sname, LocalDate packageDate, LocalDate startDate, LocalDate firstPayDate, LocalDate lawEndDate) {
        return false;
    }
}
