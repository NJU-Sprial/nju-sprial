package blservice;

import vo.ProductVO;
import vo.RecruitmentSituationVO;

import java.util.List;

/**
 * Created by zjy on 2017/9/2.
 * 券商 募集期产品管理服务
 */
public interface ProductManageService {

    /**
     * 获取用户所有的产品
     * @param username 用户名
     * @return 产品列表
     */
    public List<ProductVO> getProductList(String username);

    /**
     * 获取单个产品的募集情况
     * @param username 用户名
     * @param productID 目标产品的ID
     * @return 投资人的投资信息列表
     */
    public List<RecruitmentSituationVO> getRecruitmentSituation(String username, String productID);
}
