package web.handler.user.onlinedesign.packagemanage;

import blservice.OnlineDesignService;
import blservice.PackageCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vo.AssetPackageVO;
import web.security.WebSecurityConfig;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by xiaoJun on 2017/9/12.
 * 产品在线设计>资产包管理>资产包创建 的相关路由
 */
@Controller
public class PackageCreate {

    @Autowired
    private OnlineDesignService onlineDesignService;

    @Autowired
    private PackageCreateService packageCreateService;

    @RequestMapping(value = "/user/onlineDesign/packageManage/packageCreate", method= RequestMethod.GET)
    public String toPackageCreate(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model){

        List<String> projectNameList = onlineDesignService.getProjectNameList(username);
        if(projectNameList.isEmpty()){
            projectNameList.add("项目1");
            projectNameList.add("项目2");
        }
        model.addAttribute("projectNameList",projectNameList);
        return "/user/onlineDesign/assetPackageCreate";
    }

    @ResponseBody
    @RequestMapping(value = "/user/onlineDesign/packageManage/packageCreate/packageVO", method = RequestMethod.POST)
    public AssetPackageVO getPackageVO(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model,
                            @RequestParam(value = "projectName", required = true) String projectName){
//        return packageCreateService.createPackage(username, projectName);
        return new AssetPackageVO(username, "项目1", "0001", 3, LocalDateTime.now(),100,100);
    }
}
