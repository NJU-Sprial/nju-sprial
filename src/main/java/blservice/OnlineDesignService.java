package blservice;

import constranst.CashUnit;
import constranst.CycleUnit;
import enums.AssetType;
import enums.CreatePropertyPackageResult;
import enums.LoanType;
import enums.UploadResult;
import vo.*;

import java.io.File;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by 铠联 on 2017/9/2.
 */
public interface OnlineDesignService {

    /**
     * 导入基础资产数据,按照《消费金融资产池管理》中模板批量导入数据。提供下载数据模板，供券商填写后自动导入
     *
     * @param username 用户名
     * @param projectID    项目ID
     * @param assetType    基础资产类型——目前只有“消费金融”一类
     * @param loanType     消费用途，有三类，分为：第一类：个人消费贷款、信用卡分期付款、国家助学贷款；第二类：个人汽车贷款；第三类：
     *                 个人住房贷款（包含装修、租借、购买）
     * @param file 数据文件
     * @return
     */
    public UploadResult importBasicPropertyData(String username, String projectID, AssetType assetType, LoanType loanType, File file);

    /**
     * 浏览某项目的贷款信息，一个项目包含至少一笔贷款
     *
     * @param pname
     * @return
     */
    public List<LoanVO> browseProject(String username, String pname);

    /**
     * 根据贷款合同编号搜索该贷款信息
     *
     * @param loanCode
     * @return
     */
    public LoanVO searchLoan(String username, String loanCode);

    /**
     * 修改一笔或多笔贷款信息
     *
     * @param loanVOList
     * @return
     */
    public boolean alterLoan(String username, String projectName, List<LoanVO> loanVOList);

    /**
     * 删除一笔贷款信息
     *
     * @param loanCode
     * @return
     */
    public boolean deleteLoan(String username, String loanCode);

    /**
     * 目前待定，需求不明
     * “批量导入”：导入批量文件，提供下载数据模板，供券商填写后批量导入数据
     *
     * @param pname
     * @param loanVOList
     * @return
     */
    public boolean addMultiplePropertyData(String username, String pname, List<LoanVO> loanVOList);

    /**
     * 数据清空，选择项目名称，删除该项目资产池所有数据，包括基础资产数据、资产包、产品设计方案等等
     *
     * @param pname
     * @return
     */
    public boolean clearProjectData(String username, String pname);

    /**
     * 资产包创建,后台自动根据模型筛选基础资产，生成资产包，并自动生成资产包编号、资产数量、封包日期、资产包封包本金金额、封包利率
     * 每个项目最多只能有5个资产包(交给前端判断)
     *
     * @param pname
     * @return
     */
    public CreatePropertyPackageResult createPropertyPackage(String username, String pname);

    /**
     * 根据资产包编号搜索资产包并返回资产包信息
     *
     * @param packageNumber
     * @return
     */
    public PropertyPackageVO searchPropertyPackage(String username, String packageNumber);

    /**
     * 修改资产包信息
     *
     * @param propertyPackageVO
     * @return
     */
    public boolean alterPropertyPackage(String username, PropertyPackageVO propertyPackageVO);

    /**
     * 删除一个资产包
     *
     * @param packageNumber
     * @return
     */
    public boolean deletePropertyPackage(String username, String packageNumber);

    /**
     * 根据项目名称、资产包编号返回资产池基本情况和资产分类统计的信息
     *
     * @param pname
     * @param packageNumber
     * @return
     */
    public AnalysisDataVO getAnalysisData(String username, String pname, String packageNumber);

    /**
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
    public CashFlowDataVO getCashFlowDataVO(String username, String pname, String packageNumber, int cycle,
                                            CycleUnit cycleUnit, int payDay, CashUnit cashUnit);

    /**
     * 根据成立日（起息日）、首次兑付日、法定到期日返回证券类型、试算优先级、证券简称、发行金额占比（%）、发行金额、付息频率、试算利率
     *
     * @param startDate
     * @param firstPayDate
     * @param lawEndDate
     * @return
     */
    public ProductStrategyVO getProductStrategy(String username, LocalDate startDate, LocalDate firstPayDate, LocalDate lawEndDate);

    /**
     * 判断是否有该项目
     * 如果有该项目 返回true
     *
     * @param username
     * @param projectName
     * @return
     */
    public boolean testProject(String username, String projectName);

    /**
     * 获得用户的所有项目名称
     *
     * @param username
     * @return
     */
    public List<String> getProjectNameList(String username);
}
