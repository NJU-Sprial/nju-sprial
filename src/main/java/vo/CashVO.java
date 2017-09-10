package vo;

/**
 * 暂时用来做界面画折线图的假数据
 * Created by 铠联 on 2017/9/10.
 */
public class CashVO {
    private String name;

    final private String type = "line";

    private double[] data;

    public CashVO(String name, double[] data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public double[] getData() {
        return data;
    }

    public void setData(double[] data) {
        this.data = data;
    }
}
