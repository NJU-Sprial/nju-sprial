package bl;

import blservice.OnlineDesignService;
import blservice.PackageAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.AssetBasicInfoVO;
import vo.AssetStatisticsInfoVO;
import vo.PropertyPackageVO;

@Service
public class PackageAnalysisServiceImpl implements PackageAnalysisService{
    @Autowired
    OnlineDesignService onlineDesignService;
    @Override
    public AssetBasicInfoVO getAssetBasicInfo(String username, String projectName, String packageId, int type) {
        PropertyPackageVO propertyPackageVO = onlineDesignService.searchPropertyPackage(username,packageId);
        if (propertyPackageVO == null){
            return null;
        }
//        AssetBasicInfoVO assetBasicInfoVO = new AssetBasicInfoVO(propertyPackageVO,username);
        return null;
    }

    @Override
    public AssetStatisticsInfoVO getAssetStatisticsInfo(String username, String projectName, String packageId) {
        return null;
    }
}
