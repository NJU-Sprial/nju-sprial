package daoImpl;

import dao.ProductDao;
import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.ProductPO;
import po.UserDataPO;

import javax.transaction.Transactional;

@Service("UserTest")
public class UserTest {
    @Autowired
    UserDao userDao;
    @Autowired
    ProductDao productDao;

    @Transactional
    public UserDataPO getOne(String username){
        return userDao.get(username);
    }

    @Transactional
    public ProductPO getAProduct(int id){ return productDao.get(id);}
}
