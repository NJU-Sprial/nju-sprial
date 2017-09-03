package exception;

/**
 * Created by zjy on 2017/9/2.
 * 用户注册失败时返回的信息，包括但不限于用户名已存在，两次密码不一致，认证码不正确
 */
public class SignUpException extends Exception{
    public SignUpException(String message) {
        super(message);
    }
}
