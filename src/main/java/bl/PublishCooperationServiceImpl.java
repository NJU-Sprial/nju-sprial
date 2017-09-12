package bl;

import blservice.PublishCooperationService;
import dataservice.ProjectCooperationDataService;
import enums.LoanType;
import enums.UploadResult;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.ProjectCooperationVO;

import java.io.*;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by Water on 2017/9/7.
 */
@Service
public class PublishCooperationServiceImpl implements PublishCooperationService {

    private ProjectCooperationDataService projectCooperationDataService;

    @Autowired
    public PublishCooperationServiceImpl(ProjectCooperationDataService projectCooperationDataService) {
        this.projectCooperationDataService = projectCooperationDataService;
    }

    /**
     * 获取用户所有的项目
     * @param username
     * @return 项目列表
     */
    @Override
    public List<ProjectCooperationVO> getCooperationProjectList(String username) {
        return projectCooperationDataService.findCooperationProjects(username);
    }

    /**
     * 获取项目的文件
     * TODO
     * @param projectID
     * @return 返回项目文件
     */
    @Override
    public File getProjectFile(String projectID) {
        return null;
    }

    /**
     * 上传项目文件
     * TODO
     * @param projectID
     * @param file
     * @param loanType
     * @return 上传是否成功,如果失败将返回失败原因
     */
    @Override
    public UploadResult uploadProjectFile(String projectID, File file, LoanType loanType) {

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
            getStockListMethod = this.getClass().getMethod( "handle" + loanType.toString() + "Loan", XSSFWorkbook.class);
            result = (UploadResult) getStockListMethod.invoke(xssfWorkbook);
        } catch ( Exception e ) {
            e.printStackTrace();
            return UploadResult.IO_ERROR;
        }

        return result;
    }

    //解析个人消费信贷表格
    private UploadResult handlePersonalConsumptionLoan(XSSFWorkbook xssfWorkbook) {
        try {
            // 获取每一个工作薄
            for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
                XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
                if (xssfSheet == null) {
                    continue;
                }
                // 获取当前工作薄的每一行
                for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
                    XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                    if (xssfRow != null) {
                        XSSFCell one = xssfRow.getCell(0);
                        //读取第一列数据
                        XSSFCell two = xssfRow.getCell(1);
                        //读取第二列数据
                        XSSFCell three = xssfRow.getCell(2);
                        //读取第三列数据
                    }
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
}
