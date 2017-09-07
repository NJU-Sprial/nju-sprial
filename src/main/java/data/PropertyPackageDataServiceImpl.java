package data;

import blservice.ProductDesignService;
import dataservice.PropertyPackageDataService;
import enums.CreatePropertyPackageResult;
import org.springframework.stereotype.Service;
import po.PropertyPackagePO;

import java.util.List;

/**
 * Created by Water on 2017/9/5.
 */
@Service
public class PropertyPackageDataServiceImpl implements PropertyPackageDataService {
    /**
     * 资产包创建,后台自动根据模型筛选基础资产，生成资产包，并自动生成资产包编号、资产数量、封包日期、资产包封包本金金额、封包利率
     * 每个项目最多只能有5个资产包 后端判断
     * ***需要判断资产包是否超过5个***
     *
     * @param username
     * @param po
     * @return
     */
    @Override
    public CreatePropertyPackageResult createPropertyPackage(String username, PropertyPackagePO po) {
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

    /**
     * 获取用户单个项目下的所有资产包，如果不方便的话可以修改接口
     *
     * @param username
     * @param pname
     * @return
     * @see ProductDesignService 里的 getAllPackageNumber 方法
     */
    @Override
    public List<PropertyPackagePO> findPropertyPackage(String username, String pname) {
        return null;
    }

    /**
     * 用户创建新的资产包时，判断是否有重复名字的资产包
     * 如果有重复名字 返回false 表示无法创建
     * @param username
     * @param newPackageName
     * @return
     */
    @Override
    public boolean testPropertyPackageName(String username, String newPackageName) {
        return false;
    }
}
