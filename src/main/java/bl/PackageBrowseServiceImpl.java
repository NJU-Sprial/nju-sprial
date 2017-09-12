package bl;

import blservice.PackageBrowseService;
import org.springframework.stereotype.Service;
import vo.AssetPackageVO;

@Service
public class PackageBrowseServiceImpl implements PackageBrowseService{
    @Override
    public AssetPackageVO getPackageVO(String username, String packageId) {
        return null;
    }

    @Override
    public boolean modifyPackageVO(AssetPackageVO packageVO) {
        return false;
    }

    @Override
    public boolean deletePackageVO(String username, String packageId) {
        return false;
    }
}
