package daoImpl;

import dao.ProductDao;
import org.springframework.stereotype.Repository;
import po.ProductPO;

@Repository("ProductDao")
public class ProductDaoImpl extends SimpleHibernateDaoImpl<ProductPO,Integer > implements ProductDao {
}
