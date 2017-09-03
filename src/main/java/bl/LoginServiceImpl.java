package bl;

import blservice.LoginService;
import constranst.LoginCode;
import dataservice.UserDataService;
import exception.LoginException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Water on 2017/9/3.
 */
public class LoginServiceImpl implements LoginService{
    private UserDataService userDataService;
    @Autowired
    public LoginServiceImpl(UserDataService userDataService) {
        this.userDataService = userDataService;
    }
    /**
     * 用户登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 成功返回true，失败返回false
     * @throws LoginException 失败时抛出异常，提示失败的原因
     */
    @Override
    public boolean login(String username, String password) throws LoginException {
        String result = userDataService.login(username, password);
        if(result.equals(LoginCode.LOGIN_SUCCESS)) {
            return true;
        } else {
            throw new LoginException(result);
        }
    }

    /**
     * 用户登出
     *
     * @param username 用户名
     * @return 成功返回true，失败返回false
     */
    @Override
    public boolean logout(String username) {
        return userDataService.logout(username);
    }
}
