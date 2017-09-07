package blservice;

import exception.ErrorParamException;
import vo.SceneAnalysisVO;

import java.time.LocalDate;

/**
 * Created by zjy on 2017/9/5.
 * 产品在线设计>产品设计>情景分析 的相关接口
 */
public interface ProductDesign_ScenarioAnalysisService {

    /**
     * 根据项目名称、资产包编号、评估日期、累计违约率、违约本金回收率，返回项目情景信息包括现金流对比分析图、本金现金流明细、
     * 利息现金流明细、本息现金流明细
     *
     * @apiNote 原本是OnlineDesignService里的一个接口，现在移植到这里
     *
     * @param username 用户名
     * @param pname 项目名称
     * @param packageNumber 资产包编号
     * @param assessDate 评估日期，只能是今天（包含）以后的日期
     * @param TotalBreakOffRate 累计违约率，如0.05
     * @param BreakOffCapitalRecoverRate 违约本金回收率，如0.05
     *
     * @exception ErrorParamException 有任何参数不正确时，如用户不存在，累计违约率不能超过1等等
     * @return
     */
    public SceneAnalysisVO getSceneAnalysisVO(String username, String pname, String packageNumber, LocalDate assessDate,
                                              double TotalBreakOffRate, double BreakOffCapitalRecoverRate) throws ErrorParamException;
}
