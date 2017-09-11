package blservice;

import exception.ErrorParamException;
import vo.*;

import java.util.List;

/**
 * Created by zjy on 2017/9/10.
 * 投资者浏览ABS在售产品 > 产品概览 的相关接口
 */
//TODO wz
public interface OnSaleProductOverviewService {

    /**
     * 获取所有在售产品的产品信息
     * @return
     */
    public List<ProductVO> getOnSaleProductList();

    /**
     * 获取单个在售产品的产品信息
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    public ProductVO getProductInfo(String productID);

    /**
     * 获取单个在售产品的资产池信息
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    public AssetPoolVO getAssetPool(String productID);

    /**
     * 获取单个在售产品的证券信息
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    public List<ProductStrategyVO> getSecurityList(String productID);

    /**
     * 待定
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    public IncreasingVO getIncreasingMessage(String productID);
}
