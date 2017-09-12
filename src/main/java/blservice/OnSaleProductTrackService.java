package blservice;

import vo.AssetPoolChangeLogVO;
import vo.SecuritiesMessageVO;
import vo.SecuritiesRepaymentVO;

import java.util.List;

/**
 * Created by zjy on 2017/9/10.
 * 投资者浏览ABS在售产品 > 产品跟踪 的相关接口
 */
public interface OnSaleProductTrackService {

    /**
     * 获取资产池变动情况
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    public List<AssetPoolChangeLogVO> getAssetPoolChangeLog(String productID);

    /**
     * 获取证券偿付情况
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    public List<SecuritiesRepaymentVO> getSecuritiesRepayment(String productID);

    /**
     * 获取证券信息
     * @param productID 产品ID
     * @return 至少包含一条信息（标题是评级变化情况），如果产品不存在，返回null
     */
    public List<SecuritiesMessageVO> getSecuritiesMessage(String productID);
}
