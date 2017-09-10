package web.handler;

import blservice.AccountService;
import blservice.LoginService;
import blservice.SignUpService;
import enums.UserType;
import exception.LoginException;
import exception.SignUpException;
import org.springframework.beans.factory.annotation.Autowired;
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
 * Created by zjy on 2017/9/4.
 */
@Controller
public class Account {
    @Autowired
    private LoginService loginService;
    @Autowired
    private SignUpService signUpService;
//    @Autowired
    private AccountService accountService;


    /**
     * 登陆页面
     * @return
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 登陆请求
     * @return
     */
    @RequestMapping(value= {"/loginPost"},method= RequestMethod.POST)
    public String loginPost(
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password,
            HttpSession session, RedirectAttributesModelMap modelMap) {

        //防止重复登录
        if(session.getAttribute(WebSecurityConfig.SESSION_KEY)!=null){
            modelMap.addFlashAttribute("alertType","alert-warning");
            modelMap.addFlashAttribute("alertMessage","请勿重复登录！");
            return "redirect:/";
        }

        //密码验证
        try {
            if (loginService.login(username,password)) {
                // 设置session
                session.setAttribute(WebSecurityConfig.SESSION_KEY, username);
//                session.setAttribute(WebSecurityConfig.KEY_TYPE, accountService.getUserType(username));

                modelMap.addFlashAttribute("alertType","alert-success");
                modelMap.addFlashAttribute("alertMessage","登录成功");
                return "redirect:/";
            }
        } catch (LoginException e) {//登陆失败
            modelMap.addFlashAttribute("alertType","alert-danger");
            modelMap.addFlashAttribute("alertMessage",e.getMessage());
            return "redirect:/login";
        }

        return "redirect:/";
    }

    /**
     * 登出请求
     * @param session
     * @return
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        loginService.logout((String) session.getAttribute(WebSecurityConfig.SESSION_KEY));
        // 移除session
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "redirect:/";
    }

    /**
     * 注册页面
     * @return
     */
    @RequestMapping("/signUp")
    public String signUp() {
        return "signUp";
    }

    /**
     * 发送验证邮箱请求
     * @param e_mail 邮箱地址
     * @return
     */
    @RequestMapping(value= {"/signUp/sendAuthenticationCode"},method= RequestMethod.POST)
    public @ResponseBody String sendAuthenticationCode(
            @RequestParam(value = "e_mail", required = true) String e_mail) {
        System.out.println("email:"+e_mail);
        if(signUpService.sendAuthenticationCode(e_mail)){
            return "SUCESS";
        }

        return "该邮箱已被注册";
    }

    /**
     * 注册请求
     * @param userType 用户类型
     * @param username 用户名
     * @param password 密码
     * @param password_confirm 确认密码
     * @param name 姓名
     * @param company 公司名称
     * @param e_mail e-mail地址
     * @param authenticationCode 认证码
     * @param phoneNumber 工作电话
     * @param session
     * @param modelMap
     * @return
     */
    @RequestMapping(value= {"/signUpPost"},method= RequestMethod.POST)
    public String signUpPost(
            @RequestParam(value = "userType", required = true) String userType,
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password,
            @RequestParam(value = "password_confirm", required = true) String password_confirm,
            @RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "company", required = true) String company,
            @RequestParam(value = "e_mail", required = true) String e_mail,
            @RequestParam(value = "authenticationCode", required = true) String authenticationCode,
            @RequestParam(value = "phoneNumber", required = true) String phoneNumber,
            HttpSession session, RedirectAttributesModelMap modelMap) {

        try {
            if(signUpService.signUp(new SignUpVO(UserType.valueOf(userType),
                    username,password,password_confirm,name,company,e_mail,authenticationCode,phoneNumber))){
                //注册成功后自动登录
                return loginPost(username,password,session,modelMap);
            }
        } catch (IllegalArgumentException e) {//用户类型不存在
            modelMap.addFlashAttribute("alertType","alert-danger");
            modelMap.addFlashAttribute("alertMessage","不存在用户类型："+userType);
            return "redirect:/signUp";
        } catch (SignUpException e) {//注册失败
            modelMap.addFlashAttribute("alertType","alert-danger");
            modelMap.addFlashAttribute("alertMessage",e.getMessage());
            return "redirect:/signUp";
        }

        return "redirect:/signUp";
    }

}
