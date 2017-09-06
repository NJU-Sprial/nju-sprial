package dao;

import po.UserDataPO;

public interface UserDao extends SimpleHibernateDao<UserDataPO,String> {
    public boolean logout(String username);

    public boolean activate(String username);
}
