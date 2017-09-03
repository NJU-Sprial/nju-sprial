package web.handler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import web.security.WebSecurityConfig;

/**
 * @author zjy
 * 用户登录后才能访问的路由
 */
@Controller
public class User {

	@RequestMapping(value = "/user/name", method= RequestMethod.GET)
	public @ResponseBody
	String userName(@SessionAttribute(WebSecurityConfig.SESSION_KEY) String username) {
		return "user: " + username;
	}
}
