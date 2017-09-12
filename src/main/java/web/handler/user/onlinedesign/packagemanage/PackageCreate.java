package web.handler.user.onlinedesign.packagemanage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import web.security.WebSecurityConfig;

/**
 * Created by xiaoJun on 2017/9/12.
 * 产品在线设计>资产包管理>资产包创建 的相关路由
 */
@Controller
public class PackageCreate {

    @RequestMapping(value = "/user/onlineDesign/packageManage/packageCreate", method= RequestMethod.GET)
    public String toPackageCreate(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model){

        return "/user/onlineDesign/assetPackageCreate";
    }
}
