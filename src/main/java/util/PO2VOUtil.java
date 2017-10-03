package util;

import org.springframework.beans.BeanUtils;
import po.AssetPoolChangeLogPO;
import po.ProductPO;
import vo.AssetPoolChangeLogVO;
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
        if(productPOs == null) {
            return null;
        }
        List<ProductVO> result = new ArrayList<>();
        for(ProductPO po : productPOs) {
            result.add(productPO2VO(po));
        }
        return result;
    }

    private static AssetPoolChangeLogVO assetPoolChangeLogPO2VO(AssetPoolChangeLogPO assetPoolChangeLogPO) {
        AssetPoolChangeLogVO assetPoolChangeLogVO = new AssetPoolChangeLogVO();
        assetPoolChangeLogVO.setAnnouncementDate(assetPoolChangeLogPO.getAnnouncementDate().toLocalDateTime().toLocalDate());
        assetPoolChangeLogVO.setReceiptStartDate(assetPoolChangeLogPO.getReceiptStartDate().toLocalDateTime().toLocalDate());
        assetPoolChangeLogVO.setReceiptEndDate(assetPoolChangeLogPO.getReceiptEndDate().toLocalDateTime().toLocalDate());
        assetPoolChangeLogVO.setInitialPrincipalBalance(assetPoolChangeLogPO.getInitialPrincipalBalance());
        assetPoolChangeLogVO.setFinalPrincipalBalance(assetPoolChangeLogPO.getFinalPrincipalBalance());
        assetPoolChangeLogVO.setPrincipalRecoveryBalance(assetPoolChangeLogPO.getPrincipalRecoveryBalance());
        assetPoolChangeLogVO.setLoanNum(assetPoolChangeLogPO.getLoanNum());
        assetPoolChangeLogVO.setInterestRecoveryBalance(assetPoolChangeLogPO.getInterestRecoveryBalance());
        assetPoolChangeLogVO.setPrincipalRecoveryRate(assetPoolChangeLogPO.getPrincipalRecoveryRate());
        assetPoolChangeLogVO.setAveLoanRate(assetPoolChangeLogPO.getAveLoanRate());
        assetPoolChangeLogVO.setAveLeftMonth(assetPoolChangeLogPO.getAveLeftMonth());
        return assetPoolChangeLogVO;
    }

    public static List<AssetPoolChangeLogVO> assetPoolChangeLogPOs2VOs(List<AssetPoolChangeLogPO> assetPoolChangeLogPOs) {
        if(assetPoolChangeLogPOs == null) {
            return null;
        }
        List<AssetPoolChangeLogVO> result = new ArrayList<>();
        for(AssetPoolChangeLogPO po : assetPoolChangeLogPOs) {
            result.add(assetPoolChangeLogPO2VO(po));
        }
        return result;
    }
}
