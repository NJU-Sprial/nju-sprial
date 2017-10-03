package dataservice;

import po.SecuritiesRepaymentPO;

import java.util.List;

/**
 * Created by Water on 2017/10/3.
 */
public interface SecuritiesRepaymentDataService {
    /**
     * 获取证券偿付情况
     * @see po.SecuritiesRepaymentPO
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    List<SecuritiesRepaymentPO> getSecuritiesRepayment(String productID);
}
