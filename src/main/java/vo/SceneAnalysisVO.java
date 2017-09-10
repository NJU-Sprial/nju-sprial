package vo;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by 铠联 on 2017/9/3.
 * Modified by zjy on 2017/9/5.
 * 项目情景信息，包括现金流对比分析图、本金现金流明细、利息现金流明细、本息现金流明细
 * 现金流对比分析图为一张折线图，横轴为时间，纵轴为现金流，以一期为一单位
 */
public class SceneAnalysisVO {

    /**
     * 注意：List<CashFlowComparativeAnalysisPoint> 这个数据的格式将来很有可能会改
     */
    private List<String> dateList;
    private List<CashVO> cashList;
    private List<CapitalCashFlowDetail> capitalCashFlowDetailList;
    private List<InterestCashFlowDetail> interestCashFlowDetailList;
    private List<CapitalAndInterestCashFlowDetail> capitalAndInterestCashFlowDetailList;

    public SceneAnalysisVO(List<String> dateList, List<CashVO> cashList, List<CapitalCashFlowDetail> capitalCashFlowDetailList,
                           List<InterestCashFlowDetail> interestCashFlowDetailList,
                           List<CapitalAndInterestCashFlowDetail> capitalAndInterestCashFlowDetailList) {
        this.dateList = dateList;
        this.cashList = cashList;
        this.capitalCashFlowDetailList = capitalCashFlowDetailList;
        this.interestCashFlowDetailList = interestCashFlowDetailList;
        this.capitalAndInterestCashFlowDetailList = capitalAndInterestCashFlowDetailList;
    }

    public List<String> getDateList() {
        return dateList;
    }

    public void setDateList(List<String> dateList) {
        this.dateList = dateList;
    }

    public List<CashVO> getCashList() {
        return cashList;
    }

    public void setCashList(List<CashVO> cashList) {
        this.cashList = cashList;
    }

    public List<CapitalCashFlowDetail> getCapitalCashFlowDetailList() {
        return capitalCashFlowDetailList;
    }

    public void setCapitalCashFlowDetailList(List<CapitalCashFlowDetail> capitalCashFlowDetailList) {
        this.capitalCashFlowDetailList = capitalCashFlowDetailList;
    }

    public List<InterestCashFlowDetail> getInterestCashFlowDetailList() {
        return interestCashFlowDetailList;
    }

    public void setInterestCashFlowDetailList(List<InterestCashFlowDetail> interestCashFlowDetailList) {
        this.interestCashFlowDetailList = interestCashFlowDetailList;
    }

    public List<CapitalAndInterestCashFlowDetail> getCapitalAndInterestCashFlowDetailList() {
        return capitalAndInterestCashFlowDetailList;
    }

    public void setCapitalAndInterestCashFlowDetailList(List<CapitalAndInterestCashFlowDetail> capitalAndInterestCashFlowDetailList) {
        this.capitalAndInterestCashFlowDetailList = capitalAndInterestCashFlowDetailList;
    }
}
