package bl;

import blservice.ProductManageService;
import dataservice.ProductDataService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import po.ProductPO;
import po.RecruitmentSituationPO;
import vo.ProductVO;
import vo.RecruitmentSituationVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Water on 2017/9/3.
 */
public class ProductManageServiceImpl implements ProductManageService {
    private ProductDataService productDataService;

    @Autowired
    public ProductManageServiceImpl(ProductDataService productDataService){
        this.productDataService = productDataService;
    }

    /**
     * 获取用户所有的产品
     * TODO: 需要解决PO与VO数据类型不一致的问题
     *
     * @return 产品列表
     */
    @Override
    public List<ProductVO> getProductList() {
        List<ProductPO> productPOs = productDataService.getProductList();
        List<ProductVO> productVOs = new ArrayList<>();
        String ignoreProperty = "serialVersionUID";
        for(ProductPO po : productPOs) {
            ProductVO vo = new ProductVO();
            BeanUtils.copyProperties(po, vo, ignoreProperty);
            productVOs.add(vo);
        }
        return productVOs;
    }

    /**
     * 获取单个产品的募集情况
     *
     * @param productID 目标产品的ID
     * @return 投资人的投资信息列表
     */
    @Override
    public List<RecruitmentSituationVO> getRecruitmentSituation(String productID) {
        List<RecruitmentSituationPO> situationPOs = productDataService.getRecruitmentSituation(productID);
        List<RecruitmentSituationVO> situationVOs = new ArrayList<>();
        String ignoreProperty = "serialVersionUID";
        for(RecruitmentSituationPO po : situationPOs) {
            RecruitmentSituationVO vo = new RecruitmentSituationVO();
            BeanUtils.copyProperties(po, vo, ignoreProperty);
            situationVOs.add(vo);
        }
        return situationVOs;
    }
}