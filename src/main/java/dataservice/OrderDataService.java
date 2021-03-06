package dataservice;

import exception.ErrorParamException;
import po.OrderPO;

/**
 * Created by Water on 2017/9/14.
 */
public interface OrderDataService {
    /**
     * 投资者提交订单，如果下单成功，系统为该订单生成订单号
     *
     * @param orderPO 订单信息
     * @return 下单成功返回true，下单失败返回false
     * @throws ErrorParamException 订单信息中有任何参数不正确
     */
    boolean saveOrder(OrderPO orderPO) throws ErrorParamException;
}
