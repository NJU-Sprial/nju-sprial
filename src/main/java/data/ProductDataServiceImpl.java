package data;

import dataservice.ProductDataService;
import org.springframework.stereotype.Service;
import po.ProductPO;
import po.RecruitmentSituationPO;

import java.util.List;

/**
 * TODO
 */
@Service
public class ProductDataServiceImpl implements ProductDataService{
    @Override
    public List<ProductPO> getProductList(String username) {
        return null;
    }

    @Override
    public List<RecruitmentSituationPO> getRecruitmentSituation(String username, String productID) {
        return null;
    }
}
