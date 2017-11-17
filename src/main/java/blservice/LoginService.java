package blservice;

import exception.LoginException;

/**
 * Created by zjy on 2017/9/2.
 * 用户的登录登出服务
 */
public interface LoginService {
    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return 成功返回true，失败返回false
     * @throws LoginException 失败时抛出异常，提示失败的原因
     */
    public boolean login(String username, String password) throws LoginException;

    /**
     * 用户登出
     * @param username 用户名
     * @return 成功返回true，失败返回false
     */
    public boolean logout(String username);
}
