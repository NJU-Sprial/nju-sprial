package enums;

/**
 * Created by CYF on 2017/9/7.
 */
public enum CreatePropertyPackageResult {
    /**
     * 创建新资产包时
     * 返回结果
     * 成功、超过五个资产包（无法创建新的），有重名（无法创建新的）
     */
    SUCCESS, EXCEEDFIVE, HASSAMENAME
}
