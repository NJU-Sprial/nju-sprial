package bl;

import blservice.OnSaleProductTrackService;
import vo.AssetPoolChangeLogVO;
import vo.SecuritiesMessageVO;
import vo.SecuritiesRepaymentVO;

import java.util.List;

/**
 * Created by Water on 2017/10/3.
 */
public class OnSaleProductTrackServiceImpl implements OnSaleProductTrackService {
    /**
     * 获取资产池变动情况
     * TODO wz
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    @Override
    public List<AssetPoolChangeLogVO> getAssetPoolChangeLog(String productID) {
        return null;
    }

    /**
     * 获取证券偿付情况
     * TODO wz
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    @Override
    public List<SecuritiesRepaymentVO> getSecuritiesRepayment(String productID) {
        return null;
    }

    /**
     * 获取证券信息
     * TODO cyf
     * @param productID 产品ID
     * @return 至少包含一条信息（标题是评级变化情况），如果产品不存在，返回null
     */
    @Override
    public List<SecuritiesMessageVO> getSecuritiesMessage(String productID) {
        return null;
    }
}
