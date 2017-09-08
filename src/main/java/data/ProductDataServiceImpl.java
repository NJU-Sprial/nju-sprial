package data;

import dao.ProductDao;
import dataservice.ProductDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import po.ProductPO;
import po.RecruitmentSituationPO;

import java.util.List;

/**
 * TODO
 */
@Service("ProductDataService")
@Transactional
public class ProductDataServiceImpl implements ProductDataService{

    @Autowired
    ProductDao productDao;
    @Override
    public List<ProductPO> getProductList(String username) {
        return null;
    }

    @Override
    public List<RecruitmentSituationPO> getRecruitmentSituation(String username, String productID) {
        return null;
    }

    @Override
    public void test(ProductPO productPO) {
        productDao.save(productPO);
    }


}
