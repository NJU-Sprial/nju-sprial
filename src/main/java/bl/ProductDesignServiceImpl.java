package bl;

import blservice.ProductDesignService;
import dataservice.ProductDataService;
import dataservice.PropertyPackageDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.ProductPO;
import po.PropertyPackagePO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Water on 2017/9/7.
 */
@Service
public class ProductDesignServiceImpl implements ProductDesignService {
    private ProductDataService productDataService;
    private PropertyPackageDataService propertyPackageDataService;
    @Autowired
    public ProductDesignServiceImpl(ProductDataService productDataService, PropertyPackageDataService propertyPackageDataService) {
        this.productDataService = productDataService;
        this.propertyPackageDataService = propertyPackageDataService;
    }
    /**
     * 获取该用户的所有项目的项目名称
     * @param username 用户名
     * @return
     */
    @Override
    public List<String> getAllProduct(String username) {
        List<String> res = new ArrayList<>();
        List<ProductPO> source = productDataService.getProductList(username);
        for(ProductPO po : source) {
            res.add(po.getProductName());
        }
        return res;
    }

    /**
     * 获取用户单个项目下的所有资产包编号
     * @param username 用户名
     * @param pname    项目名称
     * @return
     */
    @Override
    public List<String> getAllPackageNumber(String username, String pname) {
        List<String> res = new ArrayList<>();
        List<PropertyPackagePO> source = propertyPackageDataService.findPropertyPackage(username, pname);
        for(PropertyPackagePO po : source) {
            res.add(po.getPackageNumber());
        }
        return res;
    }
}
