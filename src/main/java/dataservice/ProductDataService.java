package dataservice;

import po.ProductPO;
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
}
