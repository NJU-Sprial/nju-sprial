package bl;

import blservice.ProductDesign_ConceptualDesignService;
import constranst.ErrorParam;
import dataservice.ProjectCooperationDataService;
import dataservice.PropertyPackageDataService;
import dataservice.UnissuedProductDataService;
import exception.ErrorParamException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.PropertyPackagePO;
import po.UnissuedProductPO;
import vo.ConceptualParameterVO;
import vo.ConceptualVO;

/**
 * Created by Water on 2017/9/7.
 * 产品在线设计>产品设计>方案设计 的相关接口
 */
@Service
public class ProductDesign_ConceptualDesignServiceImpl implements ProductDesign_ConceptualDesignService {

    private UnissuedProductDataService unissuedProductDataService;
    private PropertyPackageDataService propertyPackageDataService;
    private ProjectCooperationDataService projectCooperationDataService;

    @Autowired
    public ProductDesign_ConceptualDesignServiceImpl(UnissuedProductDataService unissuedProductDataService,
                                                     PropertyPackageDataService propertyPackageDataService,
                                                     ProjectCooperationDataService projectCooperationDataService) {
        this.unissuedProductDataService = unissuedProductDataService;
        this.propertyPackageDataService = propertyPackageDataService;
        this.projectCooperationDataService = projectCooperationDataService;
    }

    /**
     * 获取用户某产品的方案
     * 在产品设计中，一个资产包对应一个方案
     *
     * @param username      用户名
     * @param pname         项目名称
     * @param packageNumber 资产包编号
     * @return 如果这个资产包没有方案，则返回 sname为""，startDate,firstPayDate,lawEndDate为null，其它值均正常的 ConceptualVO
     * @see po.UnissuedProductPO
     */
    @Override
    public ConceptualVO getConceptual(String username, String pname, String packageNumber) {
        ConceptualVO conceptualVO = new ConceptualVO();
        UnissuedProductPO unissuedProductPO = unissuedProductDataService.getUnissuedProductPO(packageNumber);
        if (unissuedProductPO != null) {
            conceptualVO.setFirstPayDate(unissuedProductPO.getFirstPayDate().toLocalDate());
            conceptualVO.setLawEndDate(unissuedProductPO.getLawEndDate().toLocalDate());
            conceptualVO.setPackageDate(unissuedProductPO.getPacketDate());
            conceptualVO.setPname(pname);
            conceptualVO.setSname(pname); // 凡大爷觉得前端对于pname和sname理解有问题
            conceptualVO.setStartDate(unissuedProductPO.getStartDate().toLocalDate());
            conceptualVO.setUsername(username);
            conceptualVO.setPackageNumber(packageNumber);
        } else {
            PropertyPackagePO propertyPackagePO = propertyPackageDataService.searchPropertyPackage(username, packageNumber);
            conceptualVO.setFirstPayDate(null);
            conceptualVO.setLawEndDate(null);
            conceptualVO.setPackageDate(propertyPackagePO.getPackageDate());
            conceptualVO.setPname(pname);
            conceptualVO.setSname("");
            conceptualVO.setStartDate(null);
            conceptualVO.setUsername(username);
            conceptualVO.setPackageNumber(packageNumber);
        }
        return conceptualVO;
    }

    /**
     * 分析用户所填方案，计算一系列参数，具体参见需求文档
     * TODO:算法
     *
     * @param conceptualVO 用户所填的信息
     * @return 返回对应的VO
     */
    @Override
    public ConceptualParameterVO analysisConceptual(ConceptualVO conceptualVO) {
        return null;
    }

    /**
     * 保存产品方案,如果方案名已存在代表修改，如果未存在代表添加
     *
     * @param conceptualVO 方案的信息
     * @return 成功返回true，失败返回false
     * @throws ErrorParamException 有任何参数不正确时
     * @see po.UnissuedProductPO
     */
    @Override
    public boolean saveProductStrategy(ConceptualVO conceptualVO) throws ErrorParamException {
        UnissuedProductPO unissuedProductPO = new UnissuedProductPO();
        try {
            unissuedProductPO.setProjectId(Integer.valueOf(projectCooperationDataService.getProjectId(conceptualVO.getUsername(), conceptualVO.getPname())));
            unissuedProductPO.setPropertyPackageId(Integer.valueOf(conceptualVO.getPackageNumber()));
        }catch (Exception e) {
            throw new ErrorParamException(ErrorParam.ILLEGAL_NUMBER);
        }

        unissuedProductPO.setAnalysisResult("");
        unissuedProductPO.setFirstPayDate(conceptualVO.getFirstPayDate().atStartOfDay());
        unissuedProductPO.setLawEndDate(conceptualVO.getLawEndDate().atStartOfDay());
        unissuedProductPO.setStartDate(conceptualVO.getStartDate().atStartOfDay());
        unissuedProductPO.setPacketDate(conceptualVO.getPackageDate());
        unissuedProductPO.setRecommendedLevel("");
        unissuedProductPO.setRatingResult("");
        unissuedProductPO.setProductName(conceptualVO.getPname());

        return unissuedProductDataService.saveUnissuedProduct(unissuedProductPO);
    }
}
