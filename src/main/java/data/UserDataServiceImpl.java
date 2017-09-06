package data;

import constranst.LoginCode;
import constranst.SignUpCode;
import dao.UserDao;
import dataservice.UserDataService;
import enums.UserState;
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
    private static final String slat = "fdsgewr6t87349n#^R(*WFJ";
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

    private String getMD5(String str){
        String base = str+"/"+slat;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());

        return md5;
    }
}
