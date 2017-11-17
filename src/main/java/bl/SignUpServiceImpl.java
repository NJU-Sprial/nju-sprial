package bl;

import blservice.SignUpService;
import constranst.SignUpCode;
import dataservice.UserDataService;
import exception.SignUpException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.UserDataPO;
import util.CaptchaUtil;
import util.MailUtil;
import vo.SignUpVO;

/**
 * Created by Water on 2017/9/3.
 */
@Service("SignUpService")
public class SignUpServiceImpl implements SignUpService{

    private UserDataService userDataService;
    @Autowired
    public SignUpServiceImpl(UserDataService userDataService) {
        this.userDataService = userDataService;
    }
    /**
     * 用户注册
     * @param signUpVO 用户填写的注册信息
     * @return 成功返回true，失败返回false
     * @throws SignUpException 注册失败时提示原因
     */
    @Override
    public boolean signUp(SignUpVO  signUpVO) throws SignUpException {
       if(!signUpVO.getPassword().equals(signUpVO.getPassword_confirm())) {
            throw new SignUpException(SignUpCode.PASSWORD_NOT_SAME);
        }
        if(!userDataService.checkAuthenticationCode(signUpVO.getEmail(), signUpVO.getAuthenticationCode())) {
           throw new SignUpException(SignUpCode.AUTH_ERROR);
        }
        UserDataPO userDataPO = new UserDataPO();
        String ignoreProperty1 = "serialVersionUID";
        String ignoreProperty2 = "password_confirm";
        String ignoreProperty3 = "userState";
        String ignoreProperty4 = "offline";
        String ignoreProperty5 = "authenticationCode";
        BeanUtils.copyProperties(signUpVO, userDataPO,
                ignoreProperty1, ignoreProperty2, ignoreProperty3, ignoreProperty4, ignoreProperty5);
        String result = userDataService.signUp(userDataPO);
        if(result.equals(SignUpCode.SIGN_UP_SUCCESS)) {
            return true;
        } else {
            throw new SignUpException(result);
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean sendAuthenticationCode(String e_mail) {
        int capLen = 6;
        String captcha = CaptchaUtil.generator(capLen);
        userDataService.saveAuthenticationCode(e_mail, captcha);
        try {
            MailUtil.sendMail(e_mail, captcha);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
