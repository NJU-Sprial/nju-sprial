package vo;

import java.util.List;

/**
 * Created by 铠联 on 2017/9/11.
 * 投资者，资产池分析
 */
public class AssetPoolAnalysisVO {

    private List<AssetStatisticsInfoItemVO> loanRemainTerm;     //贷款剩余期限分析
    private List<AssetStatisticsInfoItemVO> loanContractTerm;   //贷款合同期限分布
    private List<AssetStatisticsInfoItemVO> loanRate;           //贷款利率分布
    private List<AssetStatisticsInfoItemVO> region;             //入池资产地域分布
    private List<AssetStatisticsInfoItemVO> industry;           //入池资产行业分布
    private List<AssetStatisticsInfoItemVO> loanScale;          //贷款规模分布
    private List<AssetStatisticsInfoItemVO> loanAge;            //贷款账龄分析

    public AssetPoolAnalysisVO(List<AssetStatisticsInfoItemVO> fiveClass, List<AssetStatisticsInfoItemVO> loanRemainTerm,
                               List<AssetStatisticsInfoItemVO> loanContractTerm, List<AssetStatisticsInfoItemVO> loanRate,
                               List<AssetStatisticsInfoItemVO> region, List<AssetStatisticsInfoItemVO> industry,
                               List<AssetStatisticsInfoItemVO> loanScale, List<AssetStatisticsInfoItemVO> loanAge) {
        this.loanRemainTerm = loanRemainTerm;
        this.loanContractTerm = loanContractTerm;
        this.loanRate = loanRate;
        this.region = region;
        this.industry = industry;
        this.loanScale = loanScale;
        this.loanAge = loanAge;
    }

    public List<AssetStatisticsInfoItemVO> getLoanRemainTerm() {
        return loanRemainTerm;
    }

    public List<AssetStatisticsInfoItemVO> getLoanContractTerm() {
        return loanContractTerm;
    }

    public List<AssetStatisticsInfoItemVO> getLoanRate() {
        return loanRate;
    }

    public List<AssetStatisticsInfoItemVO> getRegion() {
        return region;
    }

    public List<AssetStatisticsInfoItemVO> getIndustry() {
        return industry;
    }

    public List<AssetStatisticsInfoItemVO> getLoanScale() {
        return loanScale;
    }

    public List<AssetStatisticsInfoItemVO> getLoanAge() {
        return loanAge;
    }
}
