package web.handler.user.product;

import blservice.OnSaleProductOverviewService;
import blservice.OnSaleProductTrackService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import vo.*;
import web.security.WebSecurityConfig;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zjy on 2017/9/10.
 * 投资者 > 浏览在售商品 的相关路由
 */
@Controller
public class BrowseProduct {
//    @Autowired
    private OnSaleProductOverviewService onSaleProductOverviewService;
//    @Autowired
    private OnSaleProductTrackService onSaleProductTrackService;

    @RequestMapping(value = "/user/productList", method= RequestMethod.GET)
    public String productList(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model) {
//        model.addAttribute("productList",onSaleProductOverviewService.getOnSaleProductList());

        //假数据
        List<ProductVO> fakeProductList = Arrays.asList(
                new ProductVO("productID1","示例产品1","￥10000",0.4,0.3,"5星","A机构","B机构","不动产","XXXXXXX", LocalDateTime.of(2018,9,5,23,59),LocalDateTime.of(2017,9,10,23,59)),
                new ProductVO("productID2","示例产品2","￥20000",0.4,0.3,"4星","C机构","D机构","不动产","XXXXXXXXXX", LocalDateTime.of(2018,3,9,23,59),LocalDateTime.of(2017,10,1,23,59))
        );
        model.addAttribute("productList", fakeProductList);

        return "/user/product/productList";
    }

    @RequestMapping(value = "/user/product/{productID}/overview", method= RequestMethod.GET)
    public String productOverview(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model,
                                     @PathVariable String productID) {
//        model.addAttribute("productInfo",onSaleProductOverviewService.getProductInfo(productID));
//        model.addAttribute("assetPool",onSaleProductOverviewService.getAssetPool(productID));
//        model.addAttribute("securityList",onSaleProductOverviewService.getSecurityList(productID));

        //假数据
        ProductVO fakeProductVO = new ProductVO("productID1","示例产品1","￥10000",0.4,
                0.3,"5星","A机构","B机构","不动产","XXXXXXX",
                LocalDateTime.of(2018,9,5,23,59),LocalDateTime.of(2017,9,10,23,59));
        AssetPoolVO fakeAssetPoolVO = new AssetPoolVO("productID1","￥10000","￥5000",48,
                116,2000,1000,0.105,0.0792,15,7.3,
                4.3);
        List<ProductStrategyVO> fakeSecurityList = Arrays.asList(
                new ProductStrategyVO(null,2,"简称1",35.5,10000,2,5.3),
                new ProductStrategyVO(null,3,"简称2",37.5,20000,3,4.3)
        );
        model.addAttribute("productInfo", fakeProductVO);
        model.addAttribute("assetPool", fakeAssetPoolVO);
        model.addAttribute("securityList", fakeSecurityList);

        return "/user/product/productOverview";
    }

    @RequestMapping(value = "/user/product/{productID}/assetPool", method= RequestMethod.GET)
    public String productAssetPool(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model,
                                  @PathVariable String productID) {
        return "user/product/assetPoolAnalysis";
    }

    @RequestMapping(value = "/user/product/{productID}/track", method= RequestMethod.GET)
    public String productTrack(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model,
                                  @PathVariable String productID) {
//        model.addAttribute("assetPoolChangeLog",onSaleProductTrackService.getAssetPoolChangeLog(productID));
//        model.addAttribute("securitiesRepayment",onSaleProductTrackService.getSecuritiesRepayment(productID));
//        model.addAttribute("securitiesMessage",onSaleProductTrackService.getSecuritiesMessage(productID));

        //假数据
        List<AssetPoolChangeLogVO> fakeAssetPoolChangeLogList = Arrays.asList(
                new AssetPoolChangeLogVO(LocalDate.of(2017,9,10),LocalDate.of(2017,9,10),LocalDate.of(2018,9,10),10000,
                        5000,15,3000,2000,
                        0.667,0.05,11.47),
                new AssetPoolChangeLogVO(LocalDate.of(2017,9,13),LocalDate.of(2017,9,13),LocalDate.of(2018,9,13),20000,
                        6000,35,5000,3000,
                        0.6,0.043,15.36)
        );
        List<SecuritiesRepaymentVO> fakeSecuritiesRepaymentList = Arrays.asList(
                new SecuritiesRepaymentVO(LocalDate.of(2017,9,13),LocalDate.of(2017,9,10),LocalDate.of(2018,9,10),10000,
                        10000,300,0.03),
                new SecuritiesRepaymentVO(LocalDate.of(2017,9,13),LocalDate.of(2017,9,15),LocalDate.of(2018,9,13),20000,
                        1000,30,0.03)
        );
        List<SecuritiesMessageVO> fakeSecuritiesMessageList = Arrays.asList(
                new SecuritiesMessageVO("评级变化情况","暂无信息"),
                new SecuritiesMessageVO("证券信息1","证券信息1的内容")
        );
        model.addAttribute("assetPoolChangeLog", fakeAssetPoolChangeLogList);
        model.addAttribute("securitiesRepayment", fakeSecuritiesRepaymentList);
        model.addAttribute("securitiesMessage", fakeSecuritiesMessageList);

        return "/user/product/track";
    }
}
