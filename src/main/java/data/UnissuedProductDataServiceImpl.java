package data;

import dataservice.UnissuedProductDataService;
import org.springframework.stereotype.Service;
import po.UnissuedProductPO;

/**
 * Created by Water on 2017/9/8.
 */
@Service
public class UnissuedProductDataServiceImpl implements UnissuedProductDataService {

    /**
     * 通过propertyPackageId查找UnissuedProductPO，查找不到则返回null
     *
     * @param propertyPackageId 同UnissuedProductPO内的propertyPackageId
     * @return
     */
    @Override
    public UnissuedProductPO getUnissuedProductPO(String propertyPackageId) {
        return null;
    }

    @Override
    public boolean saveUnissuedProduct(UnissuedProductPO unissuedProductPO) {
        return false;
    }
}
