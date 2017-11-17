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
        PropertyPackageVO propertyPackageVO = onlineDesignService.searchPropertyPackage(username,projectName);
        if (propertyPackageVO.getPropertyPackageId()==""){
            return null;
        }
        AssetPackageVO result = new AssetPackageVO(propertyPackageVO,username);
        return result;
    }
}
