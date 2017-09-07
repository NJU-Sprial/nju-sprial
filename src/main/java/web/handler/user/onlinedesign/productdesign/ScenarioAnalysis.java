package web.handler.user.onlinedesign.productdesign;

import blservice.ProductDesignService;
import blservice.ProductDesign_ScenarioAnalysisService;
import exception.ErrorParamException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vo.SceneAnalysisVO;
import web.security.WebSecurityConfig;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zjy on 2017/9/6.
 * 产品在线设计>产品设计>情景分析 的相关路由
 */
@Controller
public class ScenarioAnalysis {
    @Autowired
    private ProductDesignService productDesignService;
    @Autowired
    private ProductDesign_ScenarioAnalysisService scenarioAnalysisService;

    @RequestMapping(value = "/user/onlineDesign/productDesign/scenarioAnalysis", method= RequestMethod.GET)
    public String scenarioAnalysis(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model) {
//        model.addAttribute("allProduct", productDesginService.getAllProduct(username));

        //假数据
        List<String> fakeAllProduct = Arrays.asList("示例项目1", "示例项目2");
        model.addAttribute("allProduct", fakeAllProduct);

        return "/user/onlineDesign/scenarioAnalysis";
    }

    /**
     * 获取用户单个项目下的所有资产包编号
     * @param username 用户名
     * @param pname 项目名称
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/user/onlineDesign/productDesign/scenarioAnalysis/packageNumbers", method= RequestMethod.POST)
    public List<String> packageNumbers(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username,
                                       @RequestParam(value = "pname", required = true) String pname) {
//        return productDesignService.getAllPackageNumber(username, pname);
        return Arrays.asList(pname+"_001",pname+"_002");
    }

    @ResponseBody
    @RequestMapping(value = "/user/onlineDesign/productDesign/scenarioAnalysis/analysis", method= RequestMethod.POST)
    public SceneAnalysisVO analysis(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username,
                                 @RequestParam(value = "pname", required = true) String pname,
                                 @RequestParam(value = "packageNumber", required = true) String packageNumber,
                                 @RequestParam(value = "assessDate", required = true) String assessDate,
                                 @RequestParam(value = "TotalBreakOffRate", required = true) String TotalBreakOffRate,
                                 @RequestParam(value = "BreakOffCapitalRecoverRate", required = true) String BreakOffCapitalRecoverRate) {
        //日期格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            SceneAnalysisVO sceneAnalysisVO = scenarioAnalysisService.getSceneAnalysisVO(username,pname,packageNumber,LocalDate.parse(assessDate,formatter),
                    Double.parseDouble(TotalBreakOffRate),Double.parseDouble(BreakOffCapitalRecoverRate));
            return sceneAnalysisVO;
        } catch (ErrorParamException e) {
            return null;
        }
    }
}
