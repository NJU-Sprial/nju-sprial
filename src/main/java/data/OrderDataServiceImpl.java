package data;

import dao.OrderDao;
import dataservice.OrderDataService;
import exception.ErrorParamException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import po.OrderPO;

/**
 * Created by Water on 2017/9/14.
 */
@Service("OrderDataService")
@Transactional
public class OrderDataServiceImpl implements OrderDataService {
    @Autowired
    OrderDao orderDao;
    /**
     *
     * @param orderPO
     * @return
     * @throws ErrorParamException
     */
    @Override
    public boolean saveOrder(OrderPO orderPO) throws ErrorParamException {
        try {
            orderDao.save(orderPO);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
