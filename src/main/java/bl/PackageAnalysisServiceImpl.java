package bl;

import blservice.OnlineDesignService;
import blservice.PackageAnalysisService;
import dataservice.AssetDataService;
import dataservice.PropertyPackageDataService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.AssetBasicInfoPO;
import vo.AssetBasicInfoVO;
import vo.AssetStatisticsInfoVO;

import java.util.List;

@Service
public class PackageAnalysisServiceImpl implements PackageAnalysisService{
    @Autowired
    OnlineDesignService onlineDesignService;
    PropertyPackageDataService propertyPackageDataService;
    AssetDataService assetDataService;

    @Override
    public List<String> getPackageNameList(String username, String projectName) {
        return propertyPackageDataService.getPackageNameList(username,projectName);
    }
    /**
     * 获取资产基本情况
     * @param username 用户名
     * @param projectName 项目名
     * @param packageId 资产包编号
     * @param type 资产类型，分为三类。数字1代表个人信息信贷、信用卡分期付款、国家助学贷款，数字2代表个人汽车贷款，
     *             数字3代表个人住房(装修、租借、买房)贷款。
     *             注：第一类资产类型没有入池资产抵押物特征（入池资产抵押物特征含两项数据，具体可见AssetBasicInfoVO或资产基本情况&资产统计分析文档）,
     *             所以在传递第一类资产类型数据的时候，将这两项的值设置为0。不清楚的可以来问我<(▰˘◡˘▰)>
     * @return 资产基本情况数据
     */
    //TODO 概念理解 都存在数据库吗
    @Override
    public AssetBasicInfoVO getAssetBasicInfo(String username, String projectName, String packageId, int type) {
//        PropertyPackageVO propertyPackageVO = onlineDesignService.searchPropertyPackage(username,packageId);
//        if (propertyPackageVO == null){
//            return null;
//        }
//        //assetbasicinfo 和 propertypackage 的区别？
////        AssetBasicInfoVO assetBasicInfoVO = new AssetBasicInfoVO(propertyPackageVO,username);
        AssetBasicInfoPO assetBasicInfoPO = assetDataService.getAssetBasicInfo(username,projectName,packageId,type);
        AssetBasicInfoVO result = new AssetBasicInfoVO();
        BeanUtils.copyProperties(assetBasicInfoPO,result);
        return result;
    }

    /**
     * 获取资产统计分析数据
     * @param username 用户名
     * @param projectName 项目名
     * @param packageId 资产包编号
     * @return 资产统计分析数据
     * TODO 算法
     */
    @Override
    public AssetStatisticsInfoVO getAssetStatisticsInfo(String username, String projectName, String packageId) {
        return null;
    }
}
