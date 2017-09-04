package vo;

import enums.UserType;
import lombok.Data;

/**
 * Created by zjy on 2017/9/2.
 * 用户注册时填写的信息
 */
@Data
public class SignUpVO {

    private String username;
    private String password;
    private String password_confirm;
    private String name;
    private String company;
    private String email;
    private String authenticationCode;//认证码
    private String phoneNumber;//工作电话
    private UserType userType;

    public SignUpVO(UserType userType, String username, String password, String password_confirm, String name,
                    String company, String e_mail, String authenticationCode, String phoneNumber) {
        this.userType = userType;
        this.username = username;
        this.password = password;
        this.password_confirm = password_confirm;
        this.name = name;
        this.company = company;
        this.email = e_mail;
        this.authenticationCode = authenticationCode;
        this.phoneNumber = phoneNumber;
    }
}
