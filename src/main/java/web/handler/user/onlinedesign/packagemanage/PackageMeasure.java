package web.handler.user.onlinedesign.packagemanage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import web.security.WebSecurityConfig;

/**
 * Created by xiaoJun on 2017/9/12.
 */

@Controller
public class PackageMeasure {
    @RequestMapping(value = "/user/onlineDesign/packageManage/packageMeasure", method= RequestMethod.GET)
    public String toPackageMeasure(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model){

        return "/user/onlineDesign/assetPackageMeasure";
    }
}
