package daoImpl;

import dao.UnissuedProductDao;
import org.springframework.stereotype.Repository;
import po.UnissuedProductPO;

/**
 * Created by yinywf on 2017/9/7
 */
@Repository("UnissuedProductDao")
public class UnissuedProductDaoImpl extends  SimpleHibernateDaoImpl<UnissuedProductPO,Integer> implements UnissuedProductDao {
}
