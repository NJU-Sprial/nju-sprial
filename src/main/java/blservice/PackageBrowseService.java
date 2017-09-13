package blservice;

import vo.AssetPackageVO;

import java.util.List;

/**
 * Created by xiaoJun on 2017/9/10.
 */
//TODO cyf
public interface PackageBrowseService {

    /**
     * 获取资产包信息列表
     * @param username 用户名
     * @return 资产包VO列表
     */
    public List<AssetPackageVO> getPackageVOList(String username);

    /**
     * 获取资产包信息
     * @param username 用户名
     * @param packageId 资产包编号
     * @return 资产包VO
     */
    public AssetPackageVO getPackageVO(String username, String packageId);

    /**
     * 修改资产包信息
     * @param packageVO 修改后的资产包VO
     * @return 修改是否成功
     */
    public boolean modifyPackageVO(AssetPackageVO packageVO);

    /**
     * 删除资产包
     * @param username 用户名
     * @param packageId 资产包编号
     * @return 删除是否成功
     */
    public boolean deletePackageVO(String username, String packageId);

}
