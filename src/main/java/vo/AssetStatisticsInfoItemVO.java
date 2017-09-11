package vo;

/**
 * Created by xiaoJun on 2017/9/11.
 * 资产统计分析单项
 */
public class AssetStatisticsInfoItemVO {
    private String range;           //表项的范围或名称，不太理解的可以来问我 _(:3 」∠)_
    private double total;           //总额(万元)
    private double rate;            //金额占比(%)
    private int num;                //资产个数(个)

    public AssetStatisticsInfoItemVO(String range, double total, double rate, int num) {
        this.range = range;
        this.total = total;
        this.rate = rate;
        this.num = num;
    }

    public String getRange() {
        return range;
    }

    public double getTotal() {
        return total;
    }

    public double getRate() {
        return rate;
    }

    public int getNum() {
        return num;
    }
}
