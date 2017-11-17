package bl;

import blservice.OnlineDesignService;
import blservice.PackageBrowseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.AssetPackageVO;

import java.util.List;

@Service
public class PackageBrowseServiceImpl implements PackageBrowseService{
    @Autowired
    OnlineDesignService onlineDesignService;

    @Override
    public List<AssetPackageVO> getPackageVOList(String username) {
        return null;
    }

    @Override
    public AssetPackageVO getPackageVO(String username, String packageId) {
        PropertyPackageVO propertyPackageVO = onlineDesignService.searchPropertyPackage(username,packageId);
        if (propertyPackageVO == null){
            return null;
        }
        return new AssetPackageVO(propertyPackageVO,username);
    }

    @Override
    public boolean modifyPackageVO(AssetPackageVO packageVO) {
        PropertyPackageVO propertyPackageVO = new PropertyPackageVO(packageVO);
        boolean result = onlineDesignService.alterPropertyPackage(packageVO.getUsername(),propertyPackageVO);
        return result;
    }

    @Override
    public boolean deletePackageVO(String username, String packageId) {
        boolean result = onlineDesignService.deletePropertyPackage(username,packageId);
        return result;
    }
}
