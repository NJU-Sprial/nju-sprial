package bl;

import blservice.OnlineDesignService;
import constranst.CashUnit;
import constranst.CycleUnit;
import dataservice.LoanDataService;
import dataservice.ProjectCooperationDataService;
import dataservice.PropertyPackageDataService;
import enums.AssetType;
import enums.CreatePropertyPackageResult;
import enums.LoanType;
import enums.UploadResult;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.LoanPO;
import po.PropertyPackagePO;
import vo.*;

import java.io.*;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CYF on 2017/9/3.
 */
@Service("OnlineDesignService")
public class OnlineDesignServiceImpl implements OnlineDesignService {
    private LoanDataService loanDataService;
    private PropertyPackageDataService propertyPackageDataService;
    private ProjectCooperationDataService projectCooperationDataService;

    @Autowired
    public OnlineDesignServiceImpl(LoanDataService loanDataService, PropertyPackageDataService propertyPackageDataService, ProjectCooperationDataService projectCooperationDataService) {
        this.loanDataService = loanDataService;
        this.propertyPackageDataService = propertyPackageDataService;
        this.projectCooperationDataService = projectCooperationDataService;
    }

    @Override
    public UploadResult importBasicPropertyData(String username, String projectID, AssetType assetType, LoanType loanType, File file) {
        InputStream inputStream;
        XSSFWorkbook xssfWorkbook;

        try {
            inputStream = new FileInputStream(file);
            xssfWorkbook = new XSSFWorkbook(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return UploadResult.IO_ERROR;
        } catch (IOException e) {
            e.printStackTrace();
            return UploadResult.IO_ERROR;
        }

        Method getStockListMethod;
        UploadResult result;

        try {
            getStockListMethod = this.getClass().getDeclaredMethod( "handle" + loanType.toString() + "Loan", XSSFWorkbook.class);
            result = (UploadResult) getStockListMethod.invoke(this, xssfWorkbook);
        } catch ( Exception e ) {
            e.printStackTrace();
            return UploadResult.IO_ERROR;
        }

        return result;
    }

    //解析个人消费信贷表格
    private UploadResult handlePersonalConsumptionLoan(XSSFWorkbook xssfWorkbook) {
        final int second = 1;
        final int fourth = 3;
        final int totalRowNum = 19;

        try {
            // 取得工作薄
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(second);

            // 如果拿不到工作薄，返回格式错误
            if (xssfSheet == null) {
                return UploadResult.FORMAT_ERROR;
            }

            // 获取当前工作薄的每一行
            for (int rowNum = 0; rowNum < totalRowNum; rowNum ++) {
                XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                if (xssfRow != null) {
                    //读取该行第二列数据
                    XSSFCell secondCell = xssfRow.getCell(second);
                    //读取该行第四列数据
                    XSSFCell fourthCell = xssfRow.getCell(fourth);
                    System.out.println(getValueOf(secondCell) + getValueOf(fourthCell));
                } else {
                    return UploadResult.FORMAT_ERROR;
                }
            }

        } catch (Exception e) {
            return UploadResult.FORMAT_ERROR;
        }


        return UploadResult.SUCCESS;
    }

    //解析个人住房贷款表格
    private UploadResult handlePersonalHousingLoan(XSSFWorkbook xssfWorkbook){
        return null;
    }

    //解析个人汽车抵押贷款表格
    private UploadResult handlePersonalCarMortgareLoan(XSSFWorkbook xssfWorkbook) {
        return null;
    }

    //转换数据格式
    private String getValueOf(XSSFCell xssfRow) {

        if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
            return String.valueOf(xssfRow.getBooleanCellValue());
        } else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
            return String.valueOf(xssfRow.getNumericCellValue());
        } else {
            return String.valueOf(xssfRow.getStringCellValue());
        }

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
        if (loanPOList == null) {
            return new ArrayList<LoanVO>();
        }
        List<LoanVO> loanVOList = new ArrayList<>();
        for (LoanPO po : loanPOList) {
            LoanVO vo = new LoanVO();
            //Any bean properties that the source bean exposes but the target bean does not
            // will silently be ignored.
            BeanUtils.copyProperties(po, vo);
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
        if (po != null)
            BeanUtils.copyProperties(po, vo);
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
        if (loanVOList == null) {
            return true;
        }
        List<LoanPO> poList = new ArrayList<>();
        for (LoanVO vo : loanVOList) {
            LoanPO po = new LoanPO();
            BeanUtils.copyProperties(vo, po, "balance","rate");
            po.setBalance(vo.getBalance());
            po.setRate(vo.getRate());
            poList.add(po);
        }
        //因为loanvo缺少loanpo的propertyPackageId属性
        //因此在下面的操作中不要更改propertypackageID这一列属性
        boolean result = loanDataService.alterLoan(username, projectName, poList);
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
     *
     * @param pname
     * @param loanVOList
     * @return
     */
    //untested
    @Override
    public boolean addMultiplePropertyData(String username, String pname, List<LoanVO> loanVOList) {
        return false;
    }

    /**
     * 数据清空，选择项目名称，删除整个项目及该项目资产池所有数据，包括基础资产数据、资产包、产品设计方案等等
     *
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
     * 每个项目最多只能有5个资产包 后端判断
     *
     * @param pname
     * @return
     */
    // untested
    @Override
    public CreatePropertyPackageResult createPropertyPackage(String username, String pname) {
        boolean hasSame = propertyPackageDataService.testPropertyPackageName(username, pname);
        if (!hasSame) {
            return CreatePropertyPackageResult.HASSAMENAME;
        }
        PropertyPackagePO po = new PropertyPackagePO();
        //TODO 生成资产包PropertyPackagePO的各项属性
        //TODO 设置属性
        //资产包编号在数据库生成

        CreatePropertyPackageResult result = propertyPackageDataService.createPropertyPackage(username, po);
        return result;
    }

    /**
     * 根据资产包编号搜索资产包并返回资产包信息
     *
     * @param packageNumber
     * @return
     */
    @Override
    public PropertyPackageVO searchPropertyPackage(String username, String packageNumber) {
        PropertyPackagePO po = propertyPackageDataService.searchPropertyPackage(username, packageNumber);
        PropertyPackageVO vo = new PropertyPackageVO();
        if (po != null)
            BeanUtils.copyProperties(po, vo, PropertyPackageVO.class);
        return vo;
    }

    /**
     * 修改资产包信息
     *
     * @param propertyPackageVO
     * @return
     */
    @Override
    public boolean alterPropertyPackage(String username, PropertyPackageVO propertyPackageVO) {
        if (propertyPackageVO == null)
            return false;
        PropertyPackagePO po = new PropertyPackagePO();
        System.out.println(propertyPackageVO.getPropertyPackageId());
        BeanUtils.copyProperties(propertyPackageVO, po, "propertyNum","packageCapital","packageRate");

        //vo转po的时候要单独设置propertypackageid
        po.setPropertyPackageId(Integer.parseInt(propertyPackageVO.getPropertyPackageId()));

        po.setPropertyNum(propertyPackageVO.getPropertyNum());
        po.setPackageCapital(propertyPackageVO.getPackageCapital());
        po.setPackageRate(propertyPackageVO.getPackageRate());

        //注意因为vopo不同 只对PO中的部分属性进行修改 详情参考vo的属性
        boolean result = propertyPackageDataService.alterPropertyPackage(username, po);
        return result;
    }


    /**
     * 删除一个资产包
     *
     * @param packageNumber
     * @return
     */
    //untested 合伙人没删除
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
        PropertyPackagePO po = propertyPackageDataService.searchPropertyPackage(username, packageNumber);

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
     * 判断是否有该项目
     * 如果有该名字的项目 返回true
     *
     * @param username
     * @param projectName
     * @return
     */
    @Override
    public boolean testProject(String username, String projectName) {
        boolean hasPackage = projectCooperationDataService.testProject(username, projectName);
        return hasPackage;
    }

    /**
     * 获得用户的所有项目名称
     *
     * @param username
     * @return
     */
    @Override
    public List<String> getProjectNameList(String username){
        return projectCooperationDataService.getProjectNameList(username);
    }
}
