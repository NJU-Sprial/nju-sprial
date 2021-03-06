package web.handler.user.onlinedesign.productdesign;

import blservice.ProductDesignService;
import blservice.ProductDesign_ConceptualDesignService;
import exception.ErrorParamException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vo.ConceptualParameterVO;
import vo.ConceptualVO;
import web.security.WebSecurityConfig;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zjy on 2017/9/6.
 * 产品在线设计>产品设计>方案设计 的相关路由
 */
@Controller
public class ConceptualDesign {
    @Autowired
    private ProductDesignService productDesignService;
    @Autowired
    private ProductDesign_ConceptualDesignService conceptualDesignService;

    @RequestMapping(value = "/user/onlineDesign/productDesign/chooseConceptual", method= RequestMethod.GET)
    public String chooseConceptual(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model) {
//        List<String> allProduct = productDesignService.getAllProduct(username);
//        for(String pname:allProduct){
//            model.addAttribute(pname, productDesignService.getAllPackageNumber(username,pname));
//        }
//        model.addAttribute("allProduct", allProduct);

        //假数据
        List<String> fakeAllProduct = Arrays.asList("示例项目1", "示例项目2");
        for(String pname:fakeAllProduct){
            model.addAttribute(pname, Arrays.asList(pname+"_001", pname+"_002"));
        }
        model.addAttribute("allProduct", fakeAllProduct);

        return "/user/onlineDesign/chooseConceptual";
    }

    @RequestMapping(value = "/user/onlineDesign/productDesign/conceptualDesign/{pname}/{packageNumber}", method= RequestMethod.GET)
    public String conceptualDesign(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model,
                                   @PathVariable String pname,
                                   @PathVariable String packageNumber) {

//        ConceptualVO conceptualVO = conceptualDesignService.getConceptual(username, pname, packageNumber);
//        model.addAttribute("conceptualVO", conceptualVO);

        //假数据
        ConceptualVO fakeConceptualVO = new ConceptualVO(username,pname,packageNumber,"示例方案名称", LocalDateTime.of(2017,9,9,21,15,3), LocalDate.of(2017,9,10), LocalDate.of(2017,9,20), LocalDate.of(2017,12,8));
        model.addAttribute("conceptualVO", fakeConceptualVO);
        return "/user/onlineDesign/conceptualDesign";
    }

    @ResponseBody
    @RequestMapping(value = "/user/onlineDesign/productDesign/conceptualDesign/saveConceptual", method= RequestMethod.POST, produces = "application/json;charset=utf-8")
    public String saveConceptual(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username,
                                 @RequestParam(value = "pname", required = true) String pname,
                                 @RequestParam(value = "packageNumber", required = true) String packageNumber,
                                 @RequestParam(value = "sname", required = true) String sname,
                                 @RequestParam(value = "packageDate", required = true) String packageDate,
                                 @RequestParam(value = "startDate", required = true) String startDate,
                                 @RequestParam(value = "firstPayDate", required = true) String firstPayDate,
                                 @RequestParam(value = "lawEndDate", required = true) String lawEndDate) {
        //日期格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        try {
//            if(conceptualDesignService.saveProductStrategy(new ConceptualVO(
//                    username,pname,packageNumber,sname,LocalDateTime.parse(packageDate,formatter),LocalDate.parse(startDate,formatter),
//                    LocalDate.parse(firstPayDate,formatter),LocalDate.parse(lawEndDate,formatter)))){
//                return "SUCESS";
//            }
//        } catch (ErrorParamException e) {
//            return e.getMessage();
//        }

        //假数据
        if(!"".equals(pname) && !"".equals(packageNumber) && !"".equals(sname) &&
                LocalDateTime.parse(packageDate,formatter) instanceof LocalDateTime &&
                LocalDate.parse(startDate,formatter) instanceof LocalDate &&
                LocalDate.parse(firstPayDate,formatter) instanceof LocalDate &&
                LocalDate.parse(lawEndDate,formatter) instanceof LocalDate){
            return "SUCESS";
        }

        return "保存失败";
    }

    @ResponseBody
    @RequestMapping(value = "/user/onlineDesign/productDesign/conceptualDesign/analysisConceptual", method= RequestMethod.POST)
    public ConceptualParameterVO analysisConceptual(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username,
                                 @RequestParam(value = "pname", required = true) String pname,
                                 @RequestParam(value = "packageNumber", required = true) String packageNumber,
                                 @RequestParam(value = "sname", required = true) String sname,
                                 @RequestParam(value = "packageDate", required = true) String packageDate,
                                 @RequestParam(value = "startDate", required = true) String startDate,
                                 @RequestParam(value = "firstPayDate", required = true) String firstPayDate,
                                 @RequestParam(value = "lawEndDate", required = true) String lawEndDate) {
        //日期格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        ConceptualParameterVO conceptualParameterVO = conceptualDesignService.analysisConceptual(new ConceptualVO(
//                username,pname,packageNumber,sname,LocalDateTime.parse(packageDate,formatter),LocalDate.parse(startDate,formatter),
//                LocalDate.parse(firstPayDate,formatter),LocalDate.parse(lawEndDate,formatter)));
//        return  conceptualParameterVO;

        //假数据
        ConceptualParameterVO fakeConceptualParameterVO = new ConceptualParameterVO("证券类型1","优先级1",
                "证券简称1","35.5%","￥100000",
                "每月1次","5.6% - 7.9%");
        return fakeConceptualParameterVO;
    }
}
