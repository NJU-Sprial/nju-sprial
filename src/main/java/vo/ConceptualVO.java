package vo;

import java.time.LocalDate;

/**
 * Created by zjy on 2017/9/5.
 * 产品在线设计>产品设计>方案设计 的一个方案的信息
 */
public class ConceptualVO {

    private String username;
    private String pname;
    private String packageNumber;
    private String sname;
    private LocalDate packageDate;
    private LocalDate startDate;
    private LocalDate firstPayDate;
    private LocalDate lawEndDate;

    /**
     *
     * @param username 用户名
     * @param pname 产品名称
     * @param packageNumber 资产包编号
     * @param sname 方案名称
     * @param packageDate 封包日期  这个数据以后可能会删掉
     * @param startDate 成立日
     * @param firstPayDate 首次兑付日
     * @param lawEndDate 法定到期日
     */
    public ConceptualVO(String username, String pname, String packageNumber, String sname,
                        LocalDate packageDate, LocalDate startDate, LocalDate firstPayDate, LocalDate lawEndDate) {
        this.username = username;
        this.pname = pname;
        this.packageNumber = packageNumber;
        this.sname = sname;
        this.packageDate = packageDate;
        this.startDate = startDate;
        this.firstPayDate = firstPayDate;
        this.lawEndDate = lawEndDate;
    }

    public String getUsername() {
        return username;
    }

    public String getPname() {
        return pname;
    }

    public String getPackageNumber() {
        return packageNumber;
    }

    public String getSname() {
        return sname;
    }

    public LocalDate getPackageDate() {
        return packageDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getFirstPayDate() {
        return firstPayDate;
    }

    public LocalDate getLawEndDate() {
        return lawEndDate;
    }
}
