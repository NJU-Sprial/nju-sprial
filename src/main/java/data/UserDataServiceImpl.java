package data;

import constranst.LoginCode;
import constranst.SignUpCode;
import dao.UserDao;
import dataservice.UserDataService;
import enums.UserState;
import enums.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import po.UserDataPO;


@Service("UserDataService")
@Transactional
public class UserDataServiceImpl implements UserDataService{

    @Autowired
    private UserDao userdao;

    //md5盐值字符串
    private static final String salt = "fdsgewr6t87349n#^R(*WFJ";
    @Override
    public String login(String username, String password) {
        UserDataPO userDataPO = userdao.get(username);
        if (userDataPO==null){
            return LoginCode.USER_NOT_EXIST;
        }
        if (!userDataPO.getOffline()){
            return LoginCode.USER_ONLINE;
        }
        if (!userDataPO.getPassword().equals(getMD5(password))){
            return LoginCode.WRONG_PSW;
        }
        if (userDataPO.getUserState()== UserState.Unactivated){
            return LoginCode.UNACTIVATED;
        }
        userDataPO.setOffline(false);

        userdao.save(userDataPO);

        return LoginCode.LOGIN_SUCCESS;
    }

    @Override
    public boolean logout(String username) {
        return userdao.logout(username);
    }

    @Override
    public boolean activate(String username) {
        return userdao.activate(username);
    }

    @Override
    public String signUp(UserDataPO userDataPO) {
        UserDataPO temp = userdao.get(userDataPO.getUsername());
        if (temp==null){
            userDataPO.setPassword(getMD5(userDataPO.getPassword()));
            userdao.save(userDataPO);
            return SignUpCode.SIGN_UP_SUCCESS;
        }else {
            return SignUpCode.USER_EXIST;
        }
    }

    /**
     * 保存邮箱和验证码
     * TODO
     * @param email    邮箱
     * @param authCode 验证码
     * @return
     */
    @Override
    public boolean saveAuthenticationCode(String email, String authCode) {
        return false;
    }

    /**
     * 验证邮箱和验证码
     * TODO
     * @param email    邮箱
     * @param authCode 验证码
     * @return
     */
    @Override
    public boolean checkAuthenticationCode(String email, String authCode) {
        return false;
    }

    private String getMD5(String str){
        String base = str+"/"+ salt;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());

        return md5;
    }

    /**
     * 获取用户类型
     * @param username 用户名
     * @return 如果该用户不存在，返回null
     */
    public UserType getUserType(String username){
        return getUserData(username).getUserType();
    }


    private UserDataPO getUserData(String username){
        return userdao.get(username);
    }
}
