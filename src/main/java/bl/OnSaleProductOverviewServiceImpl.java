package bl;

import blservice.OnSaleProductOverviewService;
import dataservice.ProductDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.ProductPO;
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

    @Autowired
    public OnSaleProductOverviewServiceImpl(ProductDataService productDataService) {
        this.productDataService = productDataService;
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
     * TODO 要加PO   wz
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    @Override
    public AssetPoolVO getAssetPool(String productID) {
        return null;
    }

    /**
     * 获取单个在售产品的证券信息
     * TODO 要加PO   wa
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    @Override
    public List<ProductStrategyVO> getSecurityList(String productID) {
        return null;
    }

    /**
     * 增信的相关信息
     * 待定
     * TODO VO是空的
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    @Override
    public IncreasingVO getIncreasingMessage(String productID) {
        return null;
    }


}
