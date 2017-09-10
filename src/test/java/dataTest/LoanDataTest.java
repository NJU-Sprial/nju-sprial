package dataTest;

import dataservice.LoanDataService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.UserDataPO;

/**
 * Created by yinywf on 2017/9/9
 */
public class LoanDataTest {

    private static LoanDataService loanDataService;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
        loanDataService = (LoanDataService) context.getBean("LoanDataService");
    }

    @Test
    public void test(){
        System.out.println(loanDataService.clearProjectData("yinywf","就是测试一下"));
    }

}
