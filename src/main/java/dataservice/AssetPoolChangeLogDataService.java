package dataservice;

import po.AssetPoolChangeLogPO;

import java.util.List;

/**
 * Created by Water on 2017/10/3.
 */
public interface AssetPoolChangeLogDataService {
    /**
     * 获取资产池变动情况
     * @param productID 产品ID
     * @return 如果产品不存在，返回null
     */
    List<AssetPoolChangeLogPO> getAssetPoolChangeLog(String productID);
}
