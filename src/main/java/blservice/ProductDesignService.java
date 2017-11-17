package blservice;

import java.util.List;

/**
 * Created by zjy on 2017/9/6.
 * 产品在线设计>产品设计 的通用接口
 */
public interface ProductDesignService {

    /**
     * 获取该用户的所有项目的项目名称
     * @param username 用户名
     * @return
     */
    public List<String> getAllProduct(String username);

    /**
     * 获取用户单个项目下的所有资产包编号
     * @param username 用户名
     * @param pname 项目名称
     * @return
     */
    public List<String> getAllPackageNumber(String username, String pname);
}
