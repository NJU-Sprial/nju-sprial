package bl;

import blservice.OnlineDesignService;
import blservice.PackageCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.AssetPackageVO;

@Service
public class PackageCreateServiceImpl implements PackageCreateService{
    @Autowired
    private OnlineDesignService onlineDesignService;
    @Override
    public AssetPackageVO createPackage(String username, String projectName) {
        onlineDesignService.createPropertyPackage(username,projectName);
        AssetPackageVO assetPackageVO = onlineDesignService.searchPropertyPackage(username,projectName);
        if ("".equals(assetPackageVO.getPackageId())){
            return null;
        }
        return assetPackageVO;
    }
}
