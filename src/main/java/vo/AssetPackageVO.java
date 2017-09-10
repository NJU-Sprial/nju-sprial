package vo;

import java.util.Date;

/**
 * Created by xiaoJun on 2017/9/10.
 * 资产包信息
 */
public class AssetPackageVO {
    String username;        //用户名
    String projectName;     //项目名
    String packageId;       //资产包编号
    int assetNumber;        //资产包数量
    Date packetData;        //封包日期
    int principal;          //本金金额
    double rate;            //封包利率

    public AssetPackageVO(String username, String projectName, String packageId, int assetNumber, Date packetData, int principal, double rate) {
        this.username = username;
        this.projectName = projectName;
        this.packageId = packageId;
        this.assetNumber = assetNumber;
        this.packetData = packetData;
        this.principal = principal;
        this.rate = rate;
    }

    public String getUsername() {
        return username;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getPackageId() {
        return packageId;
    }

    public int getAssetNumber() {
        return assetNumber;
    }

    public Date getPacketData() {
        return packetData;
    }

    public int getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }
}
