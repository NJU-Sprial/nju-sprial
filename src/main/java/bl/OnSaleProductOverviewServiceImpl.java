package bl;

import blservice.OnSaleProductOverviewService;
import org.springframework.stereotype.Service;
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
    /**
     * 获取所有在售产品的产品信息
     * TODO
     * @return
     */
    @Override
    public List<ProductVO> getOnSaleProductList() {
        return null;
    }

    /**
     * 获取单个在售产品的产品信息
     * TODO
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    @Override
    public ProductVO getProductInfo(String productID) {
        return null;
    }

    /**
     * 获取单个在售产品的资产池信息
     * TODO
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    @Override
    public AssetPoolVO getAssetPool(String productID) {
        return null;
    }

    /**
     * 获取单个在售产品的证券信息
     * TODO
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
     * TODO
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    @Override
    public IncreasingVO getIncreasingMessage(String productID) {
        return null;
    }
}
