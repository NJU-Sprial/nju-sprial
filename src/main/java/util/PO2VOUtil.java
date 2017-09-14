package util;

import org.springframework.beans.BeanUtils;
import po.ProductPO;
import vo.ProductVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Water on 2017/9/14.
 */
public class PO2VOUtil {
    public static ProductVO productPO2VO(ProductPO productPO) {
        String ignPro1 = "serialVersionUID";
        String ignPro2 = "productId";
        String ignPro3 = "projectId";
        String ignPro4 = "finished";
        ProductVO productVO = new ProductVO();
        productVO.setProductID(String.valueOf(productPO.getProductId()));
        BeanUtils.copyProperties(productPO, productVO, ignPro1, ignPro2, ignPro3, ignPro4);
        return productVO;
    }

    public static List<ProductVO> productPOs2VOs(List<ProductPO> productPOs) {
        List<ProductVO> result = new ArrayList<>();
        for(ProductPO po : productPOs) {
            result.add(productPO2VO(po));
        }
        return result;
    }
}
