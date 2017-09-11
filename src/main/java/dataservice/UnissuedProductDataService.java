package dataservice;

import po.UnissuedProductPO;

/**
 * Created by Water on 2017/9/8.
 */
public interface UnissuedProductDataService {
    /**
     * 通过propertyPackageId查找UnissuedProductPO，查找不到则返回null
     * @param propertyPackageId 同UnissuedProductPO内的propertyPackageId
     * @return
     */
    UnissuedProductPO getUnissuedProductPO(String propertyPackageId);

    boolean saveUnissuedProduct(UnissuedProductPO unissuedProductPO);
}
