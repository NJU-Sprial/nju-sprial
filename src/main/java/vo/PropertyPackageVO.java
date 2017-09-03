package vo;

import java.time.LocalDate;

/**
 * Created by 铠联 on 2017/9/3.
 * 属性安序分别为资产包编号、资产数量、封包日期、资产包封包本金金额、封包利率
 */
public class PropertyPackageVO {
    private String pname;
    private String packageNumber;
    private int propertyNum;
    private LocalDate packageDate;
    private double packageCapital;
    private double packageRate;

    public PropertyPackageVO(String pname, String packageNumber, int propertyNum, LocalDate packageDate, double packageCapital, double packageRate) {
        this.pname = pname;
        this.packageNumber = packageNumber;
        this.propertyNum = propertyNum;
        this.packageDate = packageDate;
        this.packageCapital = packageCapital;
        this.packageRate = packageRate;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(String packageNumber) {
        this.packageNumber = packageNumber;
    }

    public int getPropertyNum() {
        return propertyNum;
    }

    public void setPropertyNum(int propertyNum) {
        this.propertyNum = propertyNum;
    }

    public LocalDate getPackageDate() {
        return packageDate;
    }

    public void setPackageDate(LocalDate packageDate) {
        this.packageDate = packageDate;
    }

    public double getPackageCapital() {
        return packageCapital;
    }

    public void setPackageCapital(double packageCapital) {
        this.packageCapital = packageCapital;
    }

    public double getPackageRate() {
        return packageRate;
    }

    public void setPackageRate(double packageRate) {
        this.packageRate = packageRate;
    }
}
