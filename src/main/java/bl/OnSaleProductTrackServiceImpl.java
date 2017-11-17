package bl;

import blservice.OnSaleProductTrackService;
import dataservice.AssetPoolChangeLogDataService;
import dataservice.SecuritiesRepaymentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import po.AssetPoolChangeLogPO;
import po.SecuritiesRepaymentPO;
import util.PO2VOUtil;
import vo.AssetPoolChangeLogVO;
import vo.SecuritiesMessageVO;
import vo.SecuritiesRepaymentVO;

import java.util.List;

/**
 * Created by Water on 2017/10/3.
 */
public class OnSaleProductTrackServiceImpl implements OnSaleProductTrackService {

    private AssetPoolChangeLogDataService assetPoolChangeLogDataService;
    private SecuritiesRepaymentDataService securitiesRepaymentDataService;
    @Autowired
    public OnSaleProductTrackServiceImpl(AssetPoolChangeLogDataService assetPoolChangeLogDataService,
                                         SecuritiesRepaymentDataService securitiesRepaymentDataService) {
        this.assetPoolChangeLogDataService = assetPoolChangeLogDataService;
        this.securitiesRepaymentDataService = securitiesRepaymentDataService;
    }
    /**
     * 获取资产池变动情况
     * @see AssetPoolChangeLogPO
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    @Override
    public List<AssetPoolChangeLogVO> getAssetPoolChangeLog(String productID) {
        List<AssetPoolChangeLogPO> assetPoolChangeLogPOs = assetPoolChangeLogDataService.getAssetPoolChangeLog(productID);
        return PO2VOUtil.assetPoolChangeLogPOs2VOs(assetPoolChangeLogPOs);
    }

    /**
     * 获取证券偿付情况
     * @see SecuritiesRepaymentPO
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    @Override
    public List<SecuritiesRepaymentVO> getSecuritiesRepayment(String productID) {
        List<SecuritiesRepaymentPO> securitiesRepaymentPOs = securitiesRepaymentDataService.getSecuritiesRepayment(productID);
        return PO2VOUtil.securitiesRepaymentPOs2VOs(securitiesRepaymentPOs);
    }

    /**
     * 获取证券信息
     * TODO 前端说删掉了=。=
     * @param productID 产品ID
     * @return 至少包含一条信息（标题是评级变化情况），如果产品不存在，返回null
     */
    @Override
    public List<SecuritiesMessageVO> getSecuritiesMessage(String productID) {
        return null;
    }
}
