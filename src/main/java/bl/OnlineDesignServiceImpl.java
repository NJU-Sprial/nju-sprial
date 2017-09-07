package bl;

import blservice.OnlineDesignService;
import constranst.CashUnit;
import constranst.CycleUnit;
import dataservice.LoanDataService;
import dataservice.PropertyPackageDataService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.LoanPO;
import po.PropertyPackagePO;
import vo.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CYF on 2017/9/3.
 */
@Service
public class OnlineDesignServiceImpl implements OnlineDesignService{
    private LoanDataService loanDataService;
    private PropertyPackageDataService propertyPackageDataService;

    @Autowired
    public OnlineDesignServiceImpl(LoanDataService loanDataService, PropertyPackageDataService propertyPackageDataService){
        this.loanDataService = loanDataService;
        this.propertyPackageDataService = propertyPackageDataService;
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
    public List<LoanVO> browseProject(String username, String pname) {
        List<LoanPO> loanPOList = loanDataService.browseProject(username, pname);
        List<LoanVO> loanVOList = new ArrayList<>();
        for (LoanPO po:loanPOList) {
            LoanVO vo = new LoanVO();
            //Any bean properties that the source bean exposes but the target bean does not
            // will silently be ignored.
            BeanUtils.copyProperties(po,vo);
            loanVOList.add(vo);
        }
        return loanVOList;
    }

    /**
     * 根据贷款合同编号搜索该贷款信息
     *
     * @param loanCode
     * @return
     */
    @Override
    public LoanVO searchLoan(String username, String loanCode) {
        LoanPO po = loanDataService.searchLoan(username, loanCode);
        LoanVO vo = new LoanVO();
        BeanUtils.copyProperties(po,vo);
        return vo;
    }

    /**
     * 修改一笔或多笔贷款信息
     *
     * @param loanVOList
     * @return
     */
    @Override
    public boolean alterLoan(String username, String projectName, List<LoanVO> loanVOList) {
        List<LoanPO> poList = new ArrayList<>();
        for (LoanVO vo:loanVOList) {
            LoanPO po = new LoanPO();
            BeanUtils.copyProperties(vo,po,LoanVO.class);
            poList.add(po);
        }
        //因为loanvo缺少loanpo的propertyPackageId属性
        //因此在下面的操作中不要更改propertypackageID这一列属性
        boolean result = loanDataService.alterLoan(username,projectName, poList);
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
        boolean result = loanDataService.deleteLoan(username, loanCode);
        return result;
    }

    /**
     * TODO
     * 目前待定，需求不明
     * “批量导入”：导入批量文件，提供下载数据模板，供券商填写后批量导入数据
     * @param pname
     * @param loanVOList
     * @return
     */
    @Override
    public boolean addMultiplePropertyData(String username, String pname, List<LoanVO> loanVOList) {
        return false;
    }

    /**
     * 数据清空，选择项目名称，删除整个项目及该项目资产池所有数据，包括基础资产数据、资产包、产品设计方案等等
     * @param pname
     * @return
     */
    @Override
    public boolean clearProjectData(String username, String pname) {
        boolean result = loanDataService.clearProjectData(username, pname);
        return result;
    }

    /**
     * TODO
     * 资产包创建,后台自动根据模型筛选基础资产，生成资产包，并自动生成资产包编号、资产数量、封包日期、资产包封包本金金额、封包利率
     * 每个项目最多只能有5个资产包(交给前端判断)
     * @param pname
     * @return
     */
    @Override
    public PropertyPackageVO createPropertyPackage(String username, String pname) {
        PropertyPackagePO po = new PropertyPackagePO();
        //TODO 生成资产包PropertyPackagePO的各项属性
        //TODO 设置属性
        //资产包编号在数据库？
        po = propertyPackageDataService.createPropertyPackage(username, po);
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
        PropertyPackagePO po = propertyPackageDataService.searchPropertyPackage(username, packageNumber);
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
        boolean result = propertyPackageDataService.alterPropertyPackage(username, po);
        return result;
    }

    /**
     * 删除一个资产包
     * @param packageNumber
     * @return
     */
    @Override
    public boolean deletePropertyPackage(String username, String packageNumber) {
        return propertyPackageDataService.deletePropertyPackage(username, packageNumber);
    }

    /**
     * TODO Vo还没确定
     * 根据项目名称、资产包编号返回资产池基本情况和资产分类统计的信息
     *
     * @param pname
     * @param packageNumber
     * @return
     */
    @Override
    public AnalysisDataVO getAnalysisData(String username, String pname, String packageNumber) {
        return null;
    }

    /**
     * TODO 算法
     * 根据项目名称、资产包编号、统计周期（月／季／年）、每期偿付日（1-31中任一天或者每期最后一日）、金额单位（元／万元／亿元）
     * 返回“现金流汇总”和“各期现金流明细”的信息
     *
     * @param pname
     * @param packageNumber
     * @param cycle
     * @param cycleUnit
     * @param payDay
     * @param cashUnit
     * @return
     */
    @Override
    public CashFlowDataVO getCashFlowDataVO(String username, String pname, String packageNumber, int cycle, CycleUnit cycleUnit, int payDay, CashUnit cashUnit) {
        PropertyPackagePO po = propertyPackageDataService.searchPropertyPackage(username,packageNumber);

        return null;
    }

    /**
     * TODO 算法
     * 根据项目名称、资产包编号、评估日期、累计违约率、违约本金回收率，返回项目情景信息包括现金流对比分析图、本金现金流明细、
     * 利息现金流明细、本息现金流明细
     *
     * @param pname
     * @param packageNumber
     * @param assessDate
     * @param TotalBreakOffRate
     * @param BreakOffCapitalRecoverRate
     * @return
     *
     * @deprecated 该接口已移植到 ProductDesgin_ScenarioAnalysisService 中
     * @see ProductDesgin_ScenarioAnalysisService
     */
    @Override
    public SceneAnalysisVO getSceneAnalysisVO(String username, String pname, String packageNumber, LocalDate assessDate, double TotalBreakOffRate, double BreakOffCapitalRecoverRate) {
        PropertyPackagePO po = propertyPackageDataService.searchPropertyPackage(username,packageNumber);

        return null;
    }

    /**
     * TODO 算法
     * 根据成立日（起息日）、首次兑付日、法定到期日 返回 证券类型、试算优先级、证券简称、发行金额占比（%）、发行金额、付息频率、试算利率
     *
     * @param startDate
     * @param firstPayDate
     * @param lawEndDate
     * @return
     */
    @Override
    public ProductStrategyVO getProductStrategy(String username, LocalDate startDate, LocalDate firstPayDate, LocalDate lawEndDate) {
        return null;
    }

     /**
     * 保存产品方案,如果方案名已存在代表修改，如果未存在代表添加
     *
     * @param sname
     * @param packageDate  封包日期
     * @param startDate
     * @param firstPayDate
     * @param lawEndDate
     * @return
     *
     * @deprecated 该接口已移植到 ProductDesgin_ConceptualDesignService 中
     * @see ProductDesgin_ConceptualDesignService
     */
    @Override
    public boolean saveProductStrategy(String username, String sname, LocalDate packageDate, LocalDate startDate, LocalDate firstPayDate, LocalDate lawEndDate) {
        return false;
    }
}
