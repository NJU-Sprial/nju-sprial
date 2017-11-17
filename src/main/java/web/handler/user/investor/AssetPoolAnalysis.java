package web.handler.user.investor;

import blservice.OnSaleProductAssetPoolService;
import blservice.OnlineDesignService;
import org.springframework.beans.factory.annotation.Autowired;
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
//    @Autowired
    private OnlineDesignService onlineDesignService;

    @RequestMapping(value = "/user/investor/assetPoolAnalysis", method= RequestMethod.GET)
    public String productList(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model) {
//        List<String> projectNameList = onlineDesignService.getProjectNameList(username);
//        model.addAttribute("projectNameList",projectNameList);
//        if(projectNameList.size()!=0){
//            String firstProjectName = projectNameList.get(0);
//            AssetPoolAnalysisVO assetPoolAnalysisVO = onSaleProductAssetPoolService.getAssetPoolAnalysisInfo(username,firstProjectName);
//            model.addAttribute("assetPoolAnalysisInfo",assetPoolAnalysisVO);
//        }

        return "user/product/assetPoolAnalysis";
    }
}
