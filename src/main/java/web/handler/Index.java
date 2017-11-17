package web.handler;

import blservice.LoginService;
import blservice.SignUpService;
import enums.UserType;
import exception.LoginException;
import exception.SignUpException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;
import vo.SignUpVO;
import web.security.WebSecurityConfig;

import javax.servlet.http.HttpSession;

/**
 * Created by 铠联 on 2017/9/1.
 */
@Controller
public class Index {

    /**
     * 首页
     * @return
     */
    @RequestMapping(value= {"/","/index"},method= RequestMethod.GET)
    public String home() {
        return "index";
    }

}
