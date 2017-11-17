package blservice;

import vo.AssetPoolAnalysisVO;

/**
 * Created by zjy on 2017/9/10.
 * Edited by 铠联
 * 投资者浏览ABS在售产品 > 产品池分析 的相关接口
 */
public interface OnSaleProductAssetPoolService {

    /**
     * 获取资产统计分析数据
     * @param username 用户名
     * @param projectName 项目名
     * @return 资产统计分析数据
     */
    public AssetPoolAnalysisVO getAssetPoolAnalysisInfo(String username, String projectName);
}
