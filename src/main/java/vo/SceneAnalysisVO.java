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


    /**
     * 现金流对比分析图上的一个点
     */
    public class CashFlowComparativeAnalysisPoint{
        private int cycleNum;
        private LocalDate date;

        /**
         *
         * @param cycleNum 期数，如3
         * @param date 日期
         */
        public CashFlowComparativeAnalysisPoint(int cycleNum, LocalDate date) {
            this.cycleNum = cycleNum;
            this.date = date;
        }

        public int getCycleNum() {
            return cycleNum;
        }

        public LocalDate getDate() {
            return date;
        }
    }

    /**
     * 本金现金流明细,期数”、“日期”、“本金现金流”
     */
    public class CapitalCashFlowDetail{
        private int cycleNum;
        private LocalDate date;
        private String capitalCashFlow;

        public CapitalCashFlowDetail(int cycleNum, LocalDate date, String capitalCashFlow) {
            this.cycleNum = cycleNum;
            this.date = date;
            this.capitalCashFlow = capitalCashFlow;
        }

        public int getCycleNum() {
            return cycleNum;
        }

        public LocalDate getDate() {
            return date;
        }

        public String getCapitalCashFlow() {
            return capitalCashFlow;
        }
    }

    /**
     * 利息现金流明细,包括“期数”、“日期”、“利息现金流”
     */
    public class InterestCashFlowDetail{
        private int cycleNum;
        private LocalDate date;
        private String interestCashFlow;

        public InterestCashFlowDetail(int cycleNum, LocalDate date, String interestCashFlow) {
            this.cycleNum = cycleNum;
            this.date = date;
            this.interestCashFlow = interestCashFlow;
        }

        public int getCycleNum() {
            return cycleNum;
        }

        public LocalDate getDate() {
            return date;
        }

        public String getInterestCashFlow() {
            return interestCashFlow;
        }
    }

    /**
     * 本息现金流明细,包括“期数”、“日期”、“本息现金流”
     */
    public class CapitalAndInterestCashFlowDetail{
        private int cycleNum;
        private LocalDate date;
        private String capitalAndInterestCashFlow;

        public CapitalAndInterestCashFlowDetail(int cycleNum, LocalDate date, String capitalAndInterestCashFlow) {
            this.cycleNum = cycleNum;
            this.date = date;
            this.capitalAndInterestCashFlow = capitalAndInterestCashFlow;
        }

        public int getCycleNum() {
            return cycleNum;
        }

        public LocalDate getDate() {
            return date;
        }

        public String getCapitalAndInterestCashFlow() {
            return capitalAndInterestCashFlow;
        }
    }

}
