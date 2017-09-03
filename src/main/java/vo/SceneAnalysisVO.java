package vo;

import java.time.LocalDate;

/**
 * Created by 铠联 on 2017/9/3.
 * 项目情景信息，包括现金流对比分析图、本金现金流明细、利息现金流明细、本息现金流明细
 * 目前需求不明，请后端完成现金流对比分析图内容创建
 */
public class SceneAnalysisVO {

    //请后端完成现金流对比分析图内容创建




    private CapitalCashFlowDetail capitalCashFlowDetail;
    private InterestCashFlowDetail interestCashFlowDetail;
    private CapitalAndInterestCashFlowDetail capitalAndInterestCashFlowDetail;

    public SceneAnalysisVO(CapitalCashFlowDetail capitalCashFlowDetail, InterestCashFlowDetail interestCashFlowDetail,
                           CapitalAndInterestCashFlowDetail capitalAndInterestCashFlowDetail) {
        this.capitalCashFlowDetail = capitalCashFlowDetail;
        this.interestCashFlowDetail = interestCashFlowDetail;
        this.capitalAndInterestCashFlowDetail = capitalAndInterestCashFlowDetail;
    }

    public CapitalCashFlowDetail getCapitalCashFlowDetail() {
        return capitalCashFlowDetail;
    }

    public InterestCashFlowDetail getInterestCashFlowDetail() {
        return interestCashFlowDetail;
    }

    public CapitalAndInterestCashFlowDetail getCapitalAndInterestCashFlowDetail() {
        return capitalAndInterestCashFlowDetail;
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
    /**
     * 本金现金流明细,期数”、“日期”、“本金现金流”
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
