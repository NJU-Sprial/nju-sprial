package bl;

import blservice.OrderService;
import constranst.ErrorParam;
import dataservice.OrderDataService;
import exception.ErrorParamException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.OrderPO;
import vo.SubmitOrderVO;

/**
 * Created by Water on 2017/9/14.
 */
@Service
public class OrderServiceImpl implements OrderService {
    private OrderDataService orderDataService;

    @Autowired
    public OrderServiceImpl(OrderDataService orderDataService) {
        this.orderDataService = orderDataService;
    }
    /**
     * 投资者提交订单，如果下单成功，系统为该订单生成订单号
     * @param submitOrderVO 订单信息
     * @return 下单成功返回true，下单失败返回false
     * @throws ErrorParamException 订单信息中有任何参数不正确
     */
    @Override
    public boolean submitOrder(SubmitOrderVO submitOrderVO) throws ErrorParamException {
        OrderPO orderPO = new OrderPO();
        orderPO.setOrderDate(submitOrderVO.getTime());
        try {
            orderPO.setProductId(Integer.valueOf(submitOrderVO.getProductID()));
        } catch (Exception e) {
            throw new ErrorParamException(ErrorParam.ILLEGAL_NUMBER);
        }
        orderPO.setUsername(submitOrderVO.getUsername());
        orderPO.setInterestRate(submitOrderVO.getInterestRate());
        orderPO.setAmount(submitOrderVO.getAmount());
        return orderDataService.saveOrder(orderPO);
    }
}
