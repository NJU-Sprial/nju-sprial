package vo;

import java.time.LocalDateTime;
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
    LocalDateTime packetData;        //封包日期
    double principal;          //本金金额
    double rate;            //封包利率

    public AssetPackageVO(String username, String projectName, String packageId, int assetNumber, LocalDateTime packetData, int principal, double rate) {
        this.username = username;
        this.projectName = projectName;
        this.packageId = packageId;
        this.assetNumber = assetNumber;
        this.packetData = packetData;
        this.principal = principal;
        this.rate = rate;
    }

    public AssetPackageVO(PropertyPackageVO vo,String username){
        if (vo == null){
            return;
        }
        this.username = username;
        this.projectName = vo.getPname();
        this.packageId = vo.getPropertyPackageId();
        this.assetNumber = vo.getPropertyNum();
        this.packetData = vo.getPackageDate();
        this.principal = vo.getPackageCapital();
        this.rate = vo.getPackageRate();
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

    public LocalDateTime getPacketData() {
        return packetData;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
