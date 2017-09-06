package data;

import dataservice.PropertyPackageDataService;
import po.PropertyPackagePO;

/**
 * Created by yinywf on 2017/9/4
 */
public class PropertyPackageDataServiceImpl implements PropertyPackageDataService {
    /**
     * 资产包创建,后台自动根据模型筛选基础资产，生成资产包，并自动生成资产包编号、资产数量、封包日期、资产包封包本金金额、封包利率
     * 每个项目最多只能有5个资产包(交给前端判断)
     *
     * @param username
     * @param po
     * @return
     */
    @Override
    public PropertyPackagePO createPropertyPackage(String username, PropertyPackagePO po) {
        return null;
    }

    /**
     * 根据资产包编号搜索资产包并返回资产包信息
     *
     * @param username
     * @param packageNumber
     * @return
     */
    @Override
    public PropertyPackagePO searchPropertyPackage(String username, String packageNumber) {
        return null;
    }

    /**
     * 修改资产包信息
     *
     * @param username
     * @param propertyPackagePO
     * @return
     */
    @Override
    public boolean alterPropertyPackage(String username, PropertyPackagePO propertyPackagePO) {
        return false;
    }

    /**
     * 删除一个资产包
     *
     * @param username
     * @param packageNumber
     * @return
     */
    @Override
    public boolean deletePropertyPackage(String username, String packageNumber) {
        return false;
    }
}
