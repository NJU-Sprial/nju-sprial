package dataservice;

import po.PropertyPackagePO;

import java.util.List;

/**
 * Created by CYF on 2017/9/4.
 */
public interface PropertyPackageDataService {
    /**
     * 资产包创建,后台自动根据模型筛选基础资产，生成资产包，并自动生成资产包编号、资产数量、封包日期、资产包封包本金金额、封包利率
     * 每个项目最多只能有5个资产包(交给前端判断)
     * @param po
     * @return
     */
    public PropertyPackagePO createPropertyPackage(String username, PropertyPackagePO po);

    /**
     * 根据资产包编号搜索资产包并返回资产包信息
     * @param packageNumber
     * @return
     */
    public PropertyPackagePO searchPropertyPackage(String username, String packageNumber);

    /**
     * 修改资产包信息
     * @param propertyPackagePO
     * @return
     */
    public boolean alterPropertyPackage(String username, PropertyPackagePO propertyPackagePO);

    /**
     * 删除一个资产包
     * @param packageNumber
     * @return
     */
    public boolean deletePropertyPackage(String username, String packageNumber);

    /**
     * 获取用户单个项目下的所有资产包，如果不方便的话可以修改接口
     * @see blservice.ProductDesignService 里的 getAllPackageNumber 方法
     * @param username
     * @param pname
     * @return
     */
    List<PropertyPackagePO> findPropertyPackage(String username, String pname);

    /**
     * 用户创建新的资产包时，判断是否有重复名字的资产包
     * 如果有重复名字 返回false 表示无法创建
     * @param username
     * @param newPackageName
     * @return
     */
    public boolean testPropertyPackageName(String username,String newPackageName);
}
