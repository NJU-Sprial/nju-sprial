package vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by xiaoJun on 2017/9/10.
 * 资产包信息
 */
@Data
@NoArgsConstructor
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
