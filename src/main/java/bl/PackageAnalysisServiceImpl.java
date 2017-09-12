package bl;

import blservice.PackageAnalysisService;
import org.springframework.stereotype.Service;
import vo.AssetBasicInfoVO;
import vo.AssetStatisticsInfoVO;

@Service
public class PackageAnalysisServiceImpl implements PackageAnalysisService{
    @Override
    public AssetBasicInfoVO getAssetBasicInfo(String username, String projectName, String packageId, int type) {
        return null;
    }

    @Override
    public AssetStatisticsInfoVO getAssetStatisticsInfo(String username, String projectName, String packageId) {
        return null;
    }
}
