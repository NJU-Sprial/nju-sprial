package bl;

import blservice.ProductDesign_ConceptualDesignService;
import dataservice.UnissuedProductDataService;
import exception.ErrorParamException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.ConceptualParameterVO;
import vo.ConceptualVO;

/**
 * Created by Water on 2017/9/7.
 * 产品在线设计>产品设计>方案设计 的相关接口
 */
@Service
public class ProductDesign_ConceptualDesignServiceImpl implements ProductDesign_ConceptualDesignService {

    private UnissuedProductDataService unissuedProductDataService;

    @Autowired
    public ProductDesign_ConceptualDesignServiceImpl(UnissuedProductDataService unissuedProductDataService) {
        this.unissuedProductDataService = unissuedProductDataService;
    }
    /**
     * 获取用户某产品的方案
     * 在产品设计中，一个资产包对应一个方案
     * @param username      用户名
     * @param pname         项目名称
     * @param packageNumber 资产包编号
     * @return 如果这个资产包没有方案，则返回 sname为""，startDate,firstPayDate,lawEndDate为null，其它值均正常的 ConceptualVO
     * @see po.UnissuedProductPO
     */
    @Override
    public ConceptualVO getConceptual(String username, String pname, String packageNumber) {
        return unissuedProductDataService.getConceptual(username, pname, packageNumber);
    }

    /**
     * 分析用户所填方案，计算一系列参数，具体参见需求文档
     * TODO:算法
     * @param conceptualVO 用户所填的信息
     * @return 返回对应的VO
     */
    @Override
    public ConceptualParameterVO analysisConceptual(ConceptualVO conceptualVO) {
        return null;
    }

    /**
     * 保存产品方案,如果方案名已存在代表修改，如果未存在代表添加
     * @param conceptualVO 方案的信息
     * @return 成功返回true，失败返回false
     * @throws ErrorParamException 有任何参数不正确时
     */
    @Override
    public boolean saveProductStrategy(ConceptualVO conceptualVO) throws ErrorParamException {
        return unissuedProductDataService.saveProductStrategy(conceptualVO);
    }
}
