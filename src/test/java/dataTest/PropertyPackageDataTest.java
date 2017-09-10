package dataTest;

import dataservice.PropertyPackageDataService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.ProductPO;

import java.time.LocalDateTime;

/**
 * Created by yinywf on 2017/9/10
 */
public class PropertyPackageDataTest {

    private static PropertyPackageDataService propertyPackageDataService;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
        propertyPackageDataService = (PropertyPackageDataService) context.getBean("PropertyPackageDataService");
    }

    @Test
    public void test() {
        //propertyPackageDataService.findPropertyPackage("yinywf","就是测试一下");
        System.out.println(propertyPackageDataService.testPropertyPackageName("yinywf","不知道叫啥2"));;
    }

}
