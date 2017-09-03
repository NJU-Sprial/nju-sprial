package blservice;

import exception.SignUpException;
import vo.SignUpVO;

/**
 * Created by zjy on 2017/9/2.
 * 用户注册服务
 */
public interface SignUpService {
    /**
     * 用户注册
     * <p>
     *     注意：如果注册成功，账号还不能使用。在注册成功后三个工作日内工作人员会打电话给用户，核实信息，如果通过，
     *     会发一封邮件给用户，然后账号才能使用
     * </p>
     * @param signUpVO 用户填写的注册信息
     * @return 成功返回true，失败返回false
     * @throws SignUpException 注册失败时提示原因
     */
    public boolean signUp(SignUpVO signUpVO) throws SignUpException;

    /**
     * 给邮箱发送验证邮件
     * @param e_mail 邮箱地址
     * @return 发送成功返回true，发送失败（如邮箱已注册）返回false
     */
    public boolean sendAuthenticationCode(String e_mail);
}
