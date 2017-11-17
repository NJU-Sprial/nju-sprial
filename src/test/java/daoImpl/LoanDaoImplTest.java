package daoImpl;

import dao.LoanDao;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.LoanPO;

import static org.junit.Assert.*;

/**
 * @author yinywf
 * Created on 2017/11/17
 */
public class LoanDaoImplTest {

    private static LoanDao loanDao;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
        loanDao = (LoanDao) context.getBean("LoanDao");
    }

    @Test
    public void addLoan(){
        LoanPO loanPO = new LoanPO();
        loanPO.setLoanId("1234");
        loanPO.setPurpose("个人短期信用贷款");
        loanDao.save(loanPO);
    }

}