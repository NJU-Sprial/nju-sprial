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
    public List<ProductPO> getProductList() {
        return null;
    }

    @Override
    public List<RecruitmentSituationPO> getRecruitmentSituation(String productID) {
        return null;
    }
}
