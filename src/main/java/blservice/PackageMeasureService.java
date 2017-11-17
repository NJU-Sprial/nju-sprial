package blservice;

import vo.CashFlowDataVO;

import java.util.Date;

/**
 * Created by xiaoJun on 2017/9/10.
 * 资产包管理现金流测算
 */
public interface PackageMeasureService {

    /**
     * 获取现金流测算数据
     * @param username 用户名
     * @param projectName 项目名
     * @param packageId 资产包编号
     * @param cycle 统计周期
     * @param pay 每期偿付日
     * @param unit 金额单位
     * @return 现金流测算数据
     */
    public CashFlowDataVO getCashFlowData(String username, String projectName, String packageId, String cycle, Date pay, String unit);
}
