package data;

import dataservice.OrderDataService;
import exception.ErrorParamException;
import org.springframework.stereotype.Service;
import po.OrderPO;

/**
 * Created by Water on 2017/9/14.
 */
@Service
public class OrderDataServiceImpl implements OrderDataService {
    /**
     * TODO
     * @param orderPO
     * @return
     * @throws ErrorParamException
     */
    @Override
    public boolean saveOrder(OrderPO orderPO) throws ErrorParamException {
        return false;
    }
}
