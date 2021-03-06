package bl;

import blservice.OnSaleProductOverviewService;
import dataservice.AssetPoolDataService;
import dataservice.ProductDataService;
import dataservice.ProjectDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.AssetPoolPO;
import po.ProductPO;
import po.ProductStrategyPO;
import po.ProjectPO;
import util.PO2VOUtil;
import vo.AssetPoolVO;
import vo.IncreasingVO;
import vo.ProductStrategyVO;
import vo.ProductVO;

import java.util.List;

/**
 * Created by Water on 2017/9/14.
 */
@Service
public class OnSaleProductOverviewServiceImpl implements OnSaleProductOverviewService {
    private ProductDataService productDataService;
    private AssetPoolDataService assetPoolDataService;
    private ProjectDataService projectDataService;
    @Autowired
    public OnSaleProductOverviewServiceImpl(ProductDataService productDataService,
                                            AssetPoolDataService assetPoolDataService,
                                            ProjectDataService projectDataService) {
        this.productDataService = productDataService;
        this.assetPoolDataService = assetPoolDataService;
        this.projectDataService = projectDataService;
    }
    /**
     * 获取所有在售产品的产品信息
     * @return
     */
    @Override
    public List<ProductVO> getOnSaleProductList() {
        List<ProductPO> productPOs = productDataService.getOnSaleProductList();
        return PO2VOUtil.productPOs2VOs(productPOs);
    }

    /**
     * 获取单个在售产品的产品信息
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    @Override
    public ProductVO getProductInfo(String productID) {
        ProductPO productPO = productDataService.getProductInfo(Integer.valueOf(productID));
        return PO2VOUtil.productPO2VO(productPO);
    }

    /**
     * 获取单个在售产品的资产池信息
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    @Override
    public AssetPoolVO getAssetPool(String productID) {
        AssetPoolPO assetPoolPO = assetPoolDataService.getAssetPool(productID);
        return PO2VOUtil.assetPoolPO2VO(assetPoolPO);
    }

    /**
     * 获取单个在售产品的证券信息
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    @Override
    public List<ProductStrategyVO> getSecurityList(String productID) {
        ProjectPO projectPO = projectDataService.getProjectByProduct(productID);
        List<ProductStrategyPO> productStrategyPOs = productDataService.getProductStrategys(projectPO.getId());
        return PO2VOUtil.ProductStrategyPOs2VOs(productStrategyPOs);
    }

    /**
     * 增信的相关信息
     * 待定
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    @Override
    public IncreasingVO getIncreasingMessage(String productID) {
        return null;
    }


}
