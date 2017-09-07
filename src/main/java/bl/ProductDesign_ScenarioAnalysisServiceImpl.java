package bl;

import blservice.ProductDesign_ScenarioAnalysisService;
import exception.ErrorParamException;
import org.springframework.stereotype.Service;
import vo.SceneAnalysisVO;

import java.time.LocalDate;

/**
 * TODO
 * Created by Water on 2017/9/7.
 */
@Service
public class ProductDesign_ScenarioAnalysisServiceImpl implements ProductDesign_ScenarioAnalysisService {
    /**
     * 根据项目名称、资产包编号、评估日期、累计违约率、违约本金回收率，返回项目情景信息包括现金流对比分析图、本金现金流明细、
     * 利息现金流明细、本息现金流明细
     *
     * @param username                   用户名
     * @param pname                      项目名称
     * @param packageNumber              资产包编号
     * @param assessDate                 评估日期，只能是今天（包含）以后的日期
     * @param TotalBreakOffRate          累计违约率，如0.05
     * @param BreakOffCapitalRecoverRate 违约本金回收率，如0.05
     * @return
     * @throws ErrorParamException 有任何参数不正确时，如用户不存在，累计违约率不能超过1等等
     * @apiNote 原本是OnlineDesignService里的一个接口，现在移植到这里
     */
    @Override
    public SceneAnalysisVO getSceneAnalysisVO(String username, String pname, String packageNumber, LocalDate assessDate, double TotalBreakOffRate, double BreakOffCapitalRecoverRate) throws ErrorParamException {
        return null;
    }
}
