package daoImpl;

import dao.UserDao;
import org.springframework.stereotype.Repository;
import po.UserDataPO;

@Repository("UserDao")
public class UserDaoImpl extends SimpleHibernateDaoImpl<UserDataPO,String> implements UserDao {
}
