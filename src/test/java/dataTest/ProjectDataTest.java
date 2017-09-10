package dataTest;

import dataservice.ProjectCooperationDataService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yinywf on 2017/9/10
 */
public class ProjectDataTest {
    private static ProjectCooperationDataService projectCooperationDataService;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
        projectCooperationDataService = (ProjectCooperationDataService) context.getBean("ProjectCooperationDataService");
    }

    @Test
    public void test(){
        System.out.println(projectCooperationDataService.getProjectNameList("yinywf"));;
    }
}
