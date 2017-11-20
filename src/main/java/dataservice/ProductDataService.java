package dataservice;

import po.ProductPO;
import po.ProductStrategyPO;
import po.RecruitmentSituationPO;

import java.util.List;

/**
 * Created by Water on 2017/9/3.
 */
public interface ProductDataService {
    /**
     * 获取用户所有的产品
     * @return 产品列表
     */
    List<ProductPO> getProductList(String username);

    /**
     * 获取单个产品的募集情况
     * @param productID 目标产品的ID
     * @return 投资人的投资信息列表
     */
    List<RecruitmentSituationPO> getRecruitmentSituation(String username, String productID);

    /**
     * 获取所有在售产品的产品信息
     * @return
     */
    List<ProductPO> getOnSaleProductList();

    /**
     * 获取单个在售产品的产品信息
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    ProductPO getProductInfo(int productID);

    /**
     * 通过project的id去查所有的ProductStrategyPO
     * @param projectID
     * @return
     */
    List<ProductStrategyPO> getProductStrategys(int projectID);

}
