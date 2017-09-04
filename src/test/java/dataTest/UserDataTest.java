package dataTest;

import daoImpl.UserTest;
import dataservice.UserDataService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.UserDataPO;

public class UserDataTest {

    private static UserDataService userDataService;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
        userDataService = (UserDataService) context.getBean("UserDataService");
    }

    @Test
    public void signUp() {
        UserDataPO newUser = new UserDataPO();
        newUser.setUsername("justTest");
        newUser.setPassword("123456");
        System.out.println(userDataService.signUp(newUser));
    }
    @Test
    public void login() {
        System.out.println(userDataService.login("justTest","123456"));
    }
    @Test
    public void logout(){
        System.out.println(userDataService.logout("justTest"));
    }

}
