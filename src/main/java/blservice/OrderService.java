package blservice;

import exception.ErrorParamException;
import vo.SubmitOrderVO;

/**
 * Created by zjy on 2017/9/10.
 * 投资者下单相关接口
 */
public interface OrderService {

    /**
     * 获取产品的名称
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    public String getProductName(String productID);

    /**
     * 获取产品的利率区间
     * @param productID 产品ID
     * @return 如"5.3% - 10.3%"。如果产品不存在，返回null
     */
    public String getInterestRange(String productID);
    
    /**
     * 投资者提交订单，如果下单成功，系统为该订单生成订单号
     * @param submitOrderVO 订单信息
     * @return 下单成功返回true，下单失败返回false
     * @throws ErrorParamException 订单信息中有任何参数不正确
     */
    public boolean submitOrder(SubmitOrderVO submitOrderVO) throws ErrorParamException;
}
