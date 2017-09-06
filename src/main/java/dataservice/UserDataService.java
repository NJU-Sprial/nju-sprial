package dataservice;

import po.UserDataPO;

/**
 * Created by Water on 2017/9/3.
 */
public interface UserDataService {
    /**
     * 用户登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 详情参考constranst.LoginCode
     * @see constranst.LoginCode
     */
    String login(String username, String password);

    /**
     * 用户登出
     *
     * @param username 用户名
     * @return 成功返回true，失败返回false
     */
    boolean logout(String username);

    /**
     * 用户激活
     *
     * @param username 用户名
     * @return 成功返回true，失败返回false
     */
    boolean activate(String username);

    /**
     * 用户注册
     * <p>
     * 注意：如果注册成功，账号还不能使用。在注册成功后三个工作日内工作人员会打电话给用户，核实信息，如果通过，
     * 会发一封邮件给用户，然后账号才能使用
     * </p>
     *
     * @return 参考constranst.SignUpCode
     * @see constranst.SignUpCode
     */
    String signUp(UserDataPO userDataPO);

    /**
     * 保存邮箱和验证码
     * @param email    邮箱
     * @param authCode 验证码
     * @return
     */
    boolean saveAuthenticationCode(String email, String authCode);


    /**
     * 验证邮箱和验证码
     * @param email    邮箱
     * @param authCode 验证码
     * @return
     */
    boolean checkAuthenticationCode(String email, String authCode);
}
