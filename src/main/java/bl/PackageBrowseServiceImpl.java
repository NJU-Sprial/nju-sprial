package bl;

import blservice.OnlineDesignService;
import blservice.PackageBrowseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.AssetPackageVO;

import java.util.List;

@Service
public class PackageBrowseServiceImpl implements PackageBrowseService {
    @Autowired
    OnlineDesignService onlineDesignService;

    @Override
    public List<AssetPackageVO> getPackageVOList(String username) {
        return null;
    }

    @Override
    public AssetPackageVO getPackageVO(String username, String packageId) {
        return onlineDesignService.searchPropertyPackage(username, packageId);
    }

    @Override
    public boolean modifyPackageVO(AssetPackageVO assetPackageVO) {
        boolean result = onlineDesignService.alterPropertyPackage(assetPackageVO.getUsername(), assetPackageVO);
        return result;
    }

    @Override
    public boolean deletePackageVO(String username, String packageId) {
        boolean result = onlineDesignService.deletePropertyPackage(username, packageId);
        return result;
    }
}
