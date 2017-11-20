package daoTest;

import daoImpl.UserTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.LoanPO;

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
    @Test
	public void test3(){
		LoanPO loanPO = new LoanPO();
		loanPO.setLoanId("1234");
		loanPO.setPurpose("个人短期信用贷款");
		userDao.addLoan(loanPO);
	}


}
