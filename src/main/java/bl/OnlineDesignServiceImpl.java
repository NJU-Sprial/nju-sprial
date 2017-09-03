package bl;

import blservice.OnlineDesignService;
import constranst.CashUnit;
import constranst.CycleUnit;
import dataservice.ProjectDataService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import po.ProjectInfoPO;
import po.PropertyPackagePO;
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
    public boolean importBasicPropertyData(String username, String pname, String ptype, String pway) {
        return false;
    }

    /**
     * 浏览某项目的贷款信息，一个项目包含至少一笔贷款
     *
     * @param pname
     * @return
     */
    @Override
    public List<ProjectInfoVO> browseProject(String username, String pname) {
        List<ProjectInfoPO> projectInfoPOList = projectDataService.browseProject(username, pname);
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
    public ProjectInfoVO searchLoan(String username, String loanCode) {
        ProjectInfoPO po = projectDataService.searchLoan(username, loanCode);
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
    public boolean alterLoan(String username, List<ProjectInfoVO> projectInfoVOList) {
        List<ProjectInfoPO> poList = new ArrayList<>();
        for (ProjectInfoVO vo:projectInfoVOList) {
            ProjectInfoPO po = new ProjectInfoPO();
            BeanUtils.copyProperties(vo,po);
            poList.add(po);
        }
        boolean result = projectDataService.alterLoan(username, poList);
        return result;
    }

    /**
     * 删除一笔贷款信息
     *
     * @param loanCode
     * @return
     */
    @Override
    public boolean deleteLoan(String username, String loanCode) {
        boolean result = projectDataService.deleteLoan(username, loanCode);
        return result;
    }

    /**
     * TODO
     * 目前待定，需求不明
     * “批量导入”：导入批量文件，提供下载数据模板，供券商填写后批量导入数据
     * @param pname
     * @param projectInfoVOList
     * @return
     */
    @Override
    public boolean addMultiplePropertyData(String username, String pname, List<ProjectInfoVO> projectInfoVOList) {
        return false;
    }

    /**
     * 数据清空，选择项目名称，删除整个项目及该项目资产池所有数据，包括基础资产数据、资产包、产品设计方案等等
     * @param pname
     * @return
     */
    @Override
    public boolean clearProjectData(String username, String pname) {
        boolean result = projectDataService.clearProjectData(username, pname);
        return result;
    }

    /**
     * 资产包创建,后台自动根据模型筛选基础资产，生成资产包，并自动生成资产包编号、资产数量、封包日期、资产包封包本金金额、封包利率
     * 每个项目最多只能有5个资产包(交给前端判断)
     * @param pname
     * @return
     */
    @Override
    public PropertyPackageVO createPropertyPackage(String username, String pname) {
        PropertyPackagePO po = projectDataService.createPropertyPackage(username, pname);
        PropertyPackageVO vo = new PropertyPackageVO();
        BeanUtils.copyProperties(po,vo);
        return vo;
    }

    /**
     * 根据资产包编号搜索资产包并返回资产包信息
     * @param packageNumber
     * @return
     */
    @Override
    public PropertyPackageVO searchPropertyPackage(String username, String packageNumber) {
        PropertyPackagePO po = projectDataService.searchPropertyPackage(username, packageNumber);
        PropertyPackageVO vo = new PropertyPackageVO();
        BeanUtils.copyProperties(po,vo);
        return vo;
    }

    /**
     * 修改资产包信息
     * @param propertyPackageVO
     * @return
     */
    @Override
    public boolean alterPropertyPackage(String username, PropertyPackageVO propertyPackageVO) {
        PropertyPackagePO po = new PropertyPackagePO();
        BeanUtils.copyProperties(propertyPackageVO,po);
        boolean result = projectDataService.alterPropertyPackage(username, po);
        return result;
    }

    /**
     * 删除一个资产包
     * @param packageNumber
     * @return
     */
    @Override
    public boolean deletePropertyPackage(String username, String packageNumber) {
        return projectDataService.deletePropertyPackage(username, packageNumber);
    }

    @Override
    public AnalysisDataVO getAnalysisData(String username, String pname, String packageNumber) {
        return null;
    }

    @Override
    public CashFlowDataVO getCashFlowDataVO(String username, String pname, String packageNumber, int cycle, CycleUnit cycleUnit, int payDay, CashUnit cashUnit) {
        return null;
    }

    @Override
    public SceneAnalysisVO getSceneAnalysisVO(String username, String pname, String packageNumber, LocalDate assessDate, double TotalBreakOffRate, double BreakOffCapitalRecoverRate) {
        return null;
    }

    @Override
    public ProductStrategyVO getProductStrategy(String username, LocalDate startDate, LocalDate firstPayDate, LocalDate lawEndDate) {
        return null;
    }

    @Override
    public boolean saveProductStrategy(String username, String sname, LocalDate packageDate, LocalDate startDate, LocalDate firstPayDate, LocalDate lawEndDate) {
        return false;
    }
}
