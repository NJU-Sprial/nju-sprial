package daoImpl;

import dao.UserDao;
import org.springframework.stereotype.Repository;
import po.UserDataPO;

@Repository("UserDao")
public class UserDaoImpl extends SimpleHibernateDaoImpl<UserDataPO,String> implements UserDao {
    @Override
    public boolean logout(String username) {
        String hql = "update UserDataPO user set user.offline = 1 where user.username = ?";
        int result = batchExecute(hql,username);
        return result==1?true:false;
    }

    @Override
    public boolean activate(String username){
        String hql = "update UserDataPO user set user.userState = 1 where user.username = ?";
        int result = batchExecute(hql,username);
        return result==1?true:false;
    }
}
