package daoImpl;

import dao.LoanDao;
import org.springframework.stereotype.Repository;
import po.LoanPO;

@Repository("LoanDao")
public class LoanDaoImpl extends  SimpleHibernateDaoImpl<LoanPO,String> implements LoanDao {
}
