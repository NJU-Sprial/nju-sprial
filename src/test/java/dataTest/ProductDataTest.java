package dataTest;

import dataservice.ProductDataService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.ProductPO;
import po.UserDataPO;

import java.time.LocalDateTime;

/**
 * Created by yinywf on 2017/9/7
 */
public class ProductDataTest {

    private static ProductDataService productDataService;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
        productDataService = (ProductDataService) context.getBean("ProductDataService");
    }

    @Test
    public void test() {
        ProductPO productPO = new ProductPO();
        productPO.setIssuer("yinywf");
        productPO.setTermOfRecruitment(LocalDateTime.now());
        productDataService.test(productPO);
    }

}
