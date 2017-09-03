package daoTest;

import dao.UserDao;
import daoImpl.UserTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.transaction.Transactional;

public class UserDaoTest {

	private static UserTest userDao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
		userDao = (UserTest) context.getBean("UserTest");
	}

	@Test
	public void test() {
		System.out.println(userDao.getOne("yinywf"));
	}
    @Test
    public void test2() {
        System.out.println(userDao.getAProduct(1));
    }

}
