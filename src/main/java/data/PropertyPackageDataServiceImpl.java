package data;

import dao.ProjectDao;
import dao.PropertyPackageDao;
import dataservice.PropertyPackageDataService;
import enums.CreatePropertyPackageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import po.ProjectPO;
import po.PropertyPackagePO;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Water on 2017/9/5.
 */
@Service("PropertyPackageDataService")
@Transactional
public class PropertyPackageDataServiceImpl implements PropertyPackageDataService {
    @Autowired
    PropertyPackageDao propertyPackageDao;

    @Autowired
    ProjectDao projectDao;
    /**
     * 资产包创建,后台自动根据模型筛选基础资产，生成资产包，并自动生成资产包编号、资产数量、封包日期、资产包封包本金金额、封包利率
     * 每个项目最多只能有5个资产包 后端判断
     * ***需要判断资产包是否超过5个***
     * 注意需要数据库自动生成资产包编号
     *
     * @param username
     * @param po
     * @return
     */
    @Override
    public CreatePropertyPackageResult createPropertyPackage(String username, PropertyPackagePO po) {
        if(!testPropertyPackageName(username,po.getPackageName())){
            return CreatePropertyPackageResult.HASSAMENAME;
        }
        List<PropertyPackagePO> propertyPackagePOS = propertyPackageDao.find("from PropertyPackagePO where projectId = ? ",po.getProjectId());
        if (propertyPackagePOS.size()<5){
            propertyPackageDao.save(po);
            return CreatePropertyPackageResult.SUCCESS;
        }

        return CreatePropertyPackageResult.EXCEEDFIVE;
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
        return propertyPackageDao.get(Integer.parseInt(packageNumber));
    }

    /**
     * 修改资产包信息
     * //注意因为vopo不同 只对PO中的部分属性进行修改 详情参考vo的属性
     *
     * @param username
     * @param propertyPackagePO
     * @return
     */
    @Override
    public boolean alterPropertyPackage(String username, PropertyPackagePO propertyPackagePO) {
        try {
            propertyPackageDao.merge(propertyPackagePO);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
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
        try {
            propertyPackageDao.delete(Integer.parseInt(packageNumber));
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 获取用户单个项目下的所有资产包，如果不方便的话可以修改接口
     *
     * reply to : 方便
     *
     * @param username
     * @param pname
     * @return
     */
    @Override
    public List<PropertyPackagePO> findPropertyPackage(String username, String pname) {
        int id = ((ProjectPO)projectDao.findUnique("from ProjectPO where owner = ? and projectName=?",username,pname)).getId();
        List<PropertyPackagePO> result = propertyPackageDao.find("from PropertyPackagePO where projectId = ?",id);
        return result;
    }

    /**
     * 用户创建新的资产包时，判断是否有重复名字的资产包
     * 如果有重复名字 返回false 表示无法创建
     *
     * @param username
     * @param newPackageName
     * @return
     */
    @Override
    public boolean testPropertyPackageName(String username, String newPackageName) {
       List<String> result = getAllPackageName(username);
       return !result.contains(newPackageName);
    }

    /**
     * TODO
     * 获取对应项目下所有资产包编号
     * @param username 用户名
     * @param projectName 项目名
     * @return 资产包编号列表
     */
    @Override
    public List<String> getPackageNameList(String username, String projectName) {
        int id = ((ProjectPO)projectDao.findUnique("from ProjectPO where owner = ? and projectName=?",username,projectName)).getId();
        List<Integer> result = propertyPackageDao.find("select propertyPackageId from PropertyPackagePO where projectId = ?",id);

        return result.stream().map(p->p.toString()).collect(Collectors.toList());
    }

    private List<String> getAllPackageName(String username){
        List<String> result = new LinkedList<>();
        List<ProjectPO> projectPOS = projectDao.findByProperty("owner", username);
        for (ProjectPO projectPO:projectPOS ){
            List<PropertyPackagePO> propertyPackagePOS = propertyPackageDao.find("from PropertyPackagePO where projectId = ? ",projectPO.getId());
            result.addAll(propertyPackagePOS.stream().map(p-> p.getPackageName()).collect(Collectors.toList()));
        }
        return result;
    }
}
