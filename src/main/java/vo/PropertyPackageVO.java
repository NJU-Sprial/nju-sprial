package vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by 铠联 on 2017/9/3.
 * 属性安序分别为资产包编号、资产数量、封包日期、资产包封包本金金额、封包利率
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyPackageVO {
    private String pname;
    private String propertyPackageId;
    private int propertyNum;
    private LocalDateTime packageDate;
    private double packageCapital;
    private double packageRate;

    public void setPropertyPackageId(int value){
        propertyPackageId = value+"";
    }

    public PropertyPackageVO(AssetPackageVO vo){
        if (vo == null){
            return;
        }
        this.pname = vo.getProjectName();
        this.propertyPackageId = vo.getPackageId();
        this.propertyNum = vo.getAssetNumber();
        this.packageDate = vo.getPacketData();
        this.packageCapital = vo.getPrincipal();
        this.packageRate = vo.getRate();
    }
}
