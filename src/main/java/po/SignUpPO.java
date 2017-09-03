package po;

import enums.UserType;
import lombok.Data;

/**
 * Created by Water on 2017/9/3.
 */
@Data
public class SignUpPO {
    private UserType userType;
    private String username;
    private String password;
    private String name;
    private String company;
    private String e_mail;
    private String authenticationCode;//认证码
    private String phoneNumber;//工作电话

    public SignUpPO() {

    }
}
