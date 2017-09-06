package bl;

import blservice.SignUpService;
import constranst.SignUpCode;
import dataservice.UserDataService;
import exception.SignUpException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.UserDataPO;
import vo.SignUpVO;

/**
 * Created by Water on 2017/9/3.
 */
@Service
public class SignUpServiceImpl implements SignUpService{

    private UserDataService userDataService;
    @Autowired
    public SignUpServiceImpl(UserDataService userDataService) {
        this.userDataService = userDataService;
    }
    /**
     * 用户注册
     * <p>
     * 注意：如果注册成功，账号还不能使用。在注册成功后三个工作日内工作人员会打电话给用户，核实信息，如果通过，
     * 会发一封邮件给用户，然后账号才能使用
     * </p>
     * @param signUpVO 用户填写的注册信息
     * @return 成功返回true，失败返回false
     * @throws SignUpException 注册失败时提示原因
     */
    @Override
    public boolean signUp(SignUpVO  signUpVO) throws SignUpException {
       if(!signUpVO.getPassword().equals(signUpVO.getPassword_confirm())) {
            throw new SignUpException(SignUpCode.PASSWORD_NOT_SAME);
        }
       UserDataPO userDataPO = new UserDataPO();
        String ignoreProperty1 = "serialVersionUID";
        String ignoreProperty2 = "password_confirm";
        String ignoreProperty3 = "userState";
        String ignoreProperty4 = "offline";
        BeanUtils.copyProperties(signUpVO, userDataPO, ignoreProperty1, ignoreProperty2, ignoreProperty3, ignoreProperty4);
        String result = userDataService.signUp(userDataPO);
        if(result.equals(SignUpCode.SIGN_UP_SUCCESS)) {
            return true;
        } else {
            throw new SignUpException(result);
        }
    }

    /**
     * 给邮箱发送验证邮件
     * TODO 问一下验证邮件的内容
     * @param e_mail 邮箱地址
     * @return 发送成功返回true，发送失败（如邮箱已注册）返回false
     */
    @Override
    public boolean sendAuthenticationCode(String e_mail) {
        return false;
    }
}
