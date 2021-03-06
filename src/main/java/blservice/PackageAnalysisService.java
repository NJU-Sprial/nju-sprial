package blservice;

import vo.AssetBasicInfoVO;
import vo.AssetStatisticsInfoItemVO;
import vo.AssetStatisticsInfoVO;

import java.util.List;

/**
 * Created by xiaoJun on 2017/9/11.
 */
//TODO cyf
public interface PackageAnalysisService {

    /**
     * 获取对应项目下所有资产包编号
     * @param username 用户名
     * @param projectName 项目名
     * @return 资产包编号列表
     */
    public List<String> getPackageNameList(String username, String projectName);

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
    public AssetBasicInfoVO getAssetBasicInfo(String username, String projectName, String packageId, int type);


    /**
     * 获取资产统计分析数据
     * @param username 用户名
     * @param projectName 项目名
     * @param packageId 资产包编号
     * @return 资产统计分析数据
     */
    public AssetStatisticsInfoVO getAssetStatisticsInfo(String username, String projectName, String packageId);
}
