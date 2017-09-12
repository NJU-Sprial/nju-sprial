package web.handler.user;

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
public class CooperationPlatform {

    @RequestMapping(value = "/user/cooperationPlatform", method= RequestMethod.GET)
    public String cooperationPlatform(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username, Model model){

        //假数据


        return "/user/cooperationPlatform";
    }

}
