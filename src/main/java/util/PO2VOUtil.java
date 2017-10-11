package util;

import org.jetbrains.annotations.Contract;
import org.springframework.beans.BeanUtils;
import po.*;
import vo.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Water on 2017/9/14.
 */
public class PO2VOUtil {
    @Contract("null -> null")
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

    @Contract("null -> null")
    public static List<ProductVO> productPOs2VOs(List<ProductPO> productPOs) {
        List<ProductVO> result = new ArrayList<>();
        for (ProductPO po : productPOs) {
            result.add(productPO2VO(po));
        }
        return result;
    }

    @Contract("null -> null")
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

    @Contract("null -> null")
    public static List<AssetPoolChangeLogVO> assetPoolChangeLogPOs2VOs(List<AssetPoolChangeLogPO> assetPoolChangeLogPOs) {
        List<AssetPoolChangeLogVO> result = new ArrayList<>();
        for (AssetPoolChangeLogPO po : assetPoolChangeLogPOs) {
            result.add(assetPoolChangeLogPO2VO(po));
        }
        return result;
    }

    @Contract("null -> null")
    private static SecuritiesRepaymentVO securitiesRepaymentPO2VO(SecuritiesRepaymentPO po) {
        SecuritiesRepaymentVO vo = new SecuritiesRepaymentVO();
        vo.setPayDate(po.getPayDate().toLocalDateTime().toLocalDate());
        vo.setInterestStartDate(po.getInterestStartDate().toLocalDateTime().toLocalDate());
        vo.setInterestEndDate(po.getInterestEndDate().toLocalDateTime().toLocalDate());
        vo.setInitialPrincipal(po.getInitialPrincipal());
        vo.setPaidPrincipal(po.getPaidPrincipal());
        vo.setPaidInterest(po.getPaidInterest());
        vo.setCouponRate(po.getCouponRate());
        return vo;
    }


    @Contract("null -> null")
    public static List<SecuritiesRepaymentVO> securitiesRepaymentPOs2VOs(List<SecuritiesRepaymentPO> pos) {
        List<SecuritiesRepaymentVO> result = new ArrayList<>();
        for (SecuritiesRepaymentPO po : pos) {
            result.add(securitiesRepaymentPO2VO(po));
        }
        return result;
    }

    @Contract("null -> null")
    public static AssetPoolVO assetPoolPO2VO(AssetPoolPO assetPoolPO) {
        AssetPoolVO assetPoolVO = new AssetPoolVO();
        assetPoolVO.setProductID(String.valueOf(assetPoolPO.getProductId()));
        assetPoolVO.setQuantity(assetPoolPO.getQuantity());
        assetPoolVO.setLeftQuantity(assetPoolPO.getLeftQuantity());
        assetPoolVO.setNumOfBorrowers(assetPoolPO.getNumOfBorrowers());
        assetPoolVO.setNumOfLoan(assetPoolPO.getNumOfLoan());
        assetPoolVO.setHighestAmount(assetPoolPO.getHighesAmount());
        assetPoolVO.setAveAmount(assetPoolPO.getAveAmount());
        assetPoolVO.setHighestRate(assetPoolPO.getHighestRate());
        assetPoolVO.setAveRate(assetPoolPO.getAveRate());
        assetPoolVO.setHighestLeftMonth(assetPoolPO.getHighestLeftMonth());
        assetPoolVO.setAveMonth(assetPoolPO.getAveMonth());
        assetPoolVO.setAveLeftMonth(assetPoolPO.getAveLeftMonth());
        return assetPoolVO;
    }

    @Contract("null -> null")
    private static ProductStrategyVO ProductStrategyPO2VO(ProductStrategyPO productStrategyPO) {
        ProductStrategyVO productStrategyVO = new ProductStrategyVO();
        productStrategyVO.setBondType(productStrategyPO.getBondType());
        productStrategyVO.setPriority(productStrategyPO.getPriority());
        productStrategyVO.setBondNameForShort(productStrategyPO.getBondNameForShort());
        productStrategyVO.setReleaseMoneyPercentage(productStrategyPO.getReleaseMoneyPercentage());
        productStrategyVO.setReleaseMoney(productStrategyPO.getReleaseMoney());
        productStrategyVO.setInterestPayFrequency(productStrategyPO.getInterestPayFrequency());
        productStrategyVO.setEstimatedInterestRate(productStrategyPO.getEstimatedInterestRate());
        return productStrategyVO;
    }

    @Contract("null -> null")
    public static List<ProductStrategyVO> ProductStrategyPOs2VOs(List<ProductStrategyPO> productStrategyPOs) {
        List<ProductStrategyVO> result = new ArrayList<>();
        for (ProductStrategyPO po : productStrategyPOs) {
            result.add(ProductStrategyPO2VO(po));
        }
        return result;
    }

}
