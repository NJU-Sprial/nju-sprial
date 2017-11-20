package daoImpl;

import dao.LoanDao;
import dao.ProductDao;
import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.LoanPO;
import po.ProductPO;
import po.UserDataPO;

import javax.transaction.Transactional;

@Service("UserTest")
public class UserTest {
    @Autowired
    UserDao userDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    LoanDao loanDao;

    @Transactional
    public UserDataPO getOne(String username){
        return userDao.get(username);
    }

    @Transactional
    public ProductPO getAProduct(int id){ return productDao.get(id);}

    @Transactional
    public void addLoan(LoanPO loanPO){
        loanDao.save(loanPO);
    }
}
