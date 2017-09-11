package blservice;

import vo.AssetPackageVO;

/**
 * Created by xiaoJun on 2017/9/10.
 */
//TODO cyf
public interface PackageCreateService {

    /**
     * 创建资产包
     * @param username 用户名
     * @param projectName 项目名
     * @return 创建成功的资产包信息
     */
    public AssetPackageVO createPackage(String username, String projectName);
}
