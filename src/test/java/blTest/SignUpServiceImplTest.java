package blTest;

import blservice.SignUpService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import util.MailUtil;

/**
 * Created by Water on 2017/9/6.
 */
public class SignUpServiceImplTest {

    private static SignUpService signUpService;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
        signUpService = (SignUpService)context.getBean("SignUpService");
    }

    @Test
    public void sendAuthenticationCodeTest() throws Exception {
//        signUpService.sendAuthenticationCode("598127577@qq.com");
        MailUtil.sendMail("151099086@smail.nju.edu.cn", "151099086@smail.nju.edu.cn，你有没有收到服务器发出去的邮件");
//        MailUtil.sendMail("649433713@qq.com", "只有帅的人才能收到这封邮件");
    }

}
