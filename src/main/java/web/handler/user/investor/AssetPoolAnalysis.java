package web.handler.user.investor;

import blservice.OnSaleProductAssetPoolService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import vo.*;
import web.security.WebSecurityConfig;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zjy on 2017/9/10.
 * 投资者 > 浏览在售商品 >资产池分析 的相关路由
 */
@Controller
public class AssetPoolAnalysis {
//    @Autowired
    private OnSaleProductAssetPoolService onSaleProductAssetPoolService;

    @RequestMapping(value = "/user/investor/assetPoolAnalysis", method= RequestMethod.GET)
    public String productList(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model) {
//        model.addAttribute("productList",onSaleProductOverviewService.getOnSaleProductList());

        //假数据
        List<ProductVO> fakeProductList = Arrays.asList(
                new ProductVO("productID1","示例产品1","￥10000",0.4,0.3,"5星","A机构","B机构","不动产","XXXXXXX", LocalDateTime.of(2018,9,5,23,59),LocalDateTime.of(2017,9,10,23,59)),
                new ProductVO("productID2","示例产品2","￥20000",0.4,0.3,"4星","C机构","D机构","不动产","XXXXXXXXXX", LocalDateTime.of(2018,3,9,23,59),LocalDateTime.of(2017,10,1,23,59))
        );
        model.addAttribute("productList", fakeProductList);

        return "user/product/assetPoolAnalysis";
    }
}
