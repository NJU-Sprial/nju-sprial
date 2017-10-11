package dataservice;

import po.AssetPoolPO;

/**
 * Created by Water on 2017/10/11.
 */
public interface AssetPoolDataService {
    AssetPoolPO getAssetPool(String productID);
}
