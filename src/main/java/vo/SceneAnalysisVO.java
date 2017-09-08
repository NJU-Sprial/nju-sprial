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
    private List<CashFlowComparativeAnalysisPoint> cashFlowComparativeAnalysisList;
    private List<CapitalCashFlowDetail> capitalCashFlowDetailList;
    private List<InterestCashFlowDetail> interestCashFlowDetailList;
    private List<CapitalAndInterestCashFlowDetail> capitalAndInterestCashFlowDetailList;

    public SceneAnalysisVO(List<CashFlowComparativeAnalysisPoint> cashFlowComparativeAnalysisList,
                           List<CapitalCashFlowDetail> capitalCashFlowDetailList,
                           List<InterestCashFlowDetail> interestCashFlowDetailList,
                           List<CapitalAndInterestCashFlowDetail> capitalAndInterestCashFlowDetailList) {
        this.cashFlowComparativeAnalysisList = cashFlowComparativeAnalysisList;
        this.capitalCashFlowDetailList = capitalCashFlowDetailList;
        this.interestCashFlowDetailList = interestCashFlowDetailList;
        this.capitalAndInterestCashFlowDetailList = capitalAndInterestCashFlowDetailList;
    }

    public List<CashFlowComparativeAnalysisPoint> getCashFlowComparativeAnalysisList() {
        return cashFlowComparativeAnalysisList;
    }

    public List<CapitalCashFlowDetail> getCapitalCashFlowDetailList() {
        return capitalCashFlowDetailList;
    }

    public List<InterestCashFlowDetail> getInterestCashFlowDetailList() {
        return interestCashFlowDetailList;
    }

    public List<CapitalAndInterestCashFlowDetail> getCapitalAndInterestCashFlowDetailList() {
        return capitalAndInterestCashFlowDetailList;
    }

}
