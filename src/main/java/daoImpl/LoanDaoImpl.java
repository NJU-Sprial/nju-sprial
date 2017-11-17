package daoImpl;

import dao.LoanDao;
import org.springframework.stereotype.Repository;
import po.LoanPO;

import javax.transaction.Transactional;

@Repository("LoanDao")
@Transactional
public class LoanDaoImpl extends  SimpleHibernateDaoImpl<LoanPO,String> implements LoanDao {
}
