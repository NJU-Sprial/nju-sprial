package daoImpl;

import dao.OrderDao;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import po.OrderPO;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by yinywf on 2017/9/7
 */
@Repository("OrderDao")
public class OrderDaoImpl extends SimpleHibernateDaoImpl<OrderPO,Integer> implements OrderDao {

}
