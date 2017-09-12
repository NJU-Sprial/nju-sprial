package bl;

import blservice.PackageCreateService;
import org.springframework.stereotype.Service;
import vo.AssetPackageVO;

@Service
public class PackageCreateServiceImpl implements PackageCreateService{
    @Override
    public AssetPackageVO createPackage(String username, String projectName) {
        return null;
    }
}
