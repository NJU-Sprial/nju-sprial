package dataservice;

/**
 * Created by Water on 2017/9/3.
 */
public interface UserDataService {
    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return 详情参考constranst.LoginCode
     * @see constranst.LoginCode
     */
    String login(String username, String password);

    /**
     * 用户登出
     * @param username 用户名
     * @return 成功返回true，失败返回false
     */
    boolean logout(String username);
}
