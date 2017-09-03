package vo;

/**
 * Created by zjy on 2017/9/2.
 * 用户注册时填写的信息
 */
public class SignUpVO {
    private UserType userType;
    private String username;
    private String password;
    private String password_confirm;
    private String name;
    private String company;
    private String e_mail;
    private String authenticationCode;//认证码
    private String phoneNumber;//工作电话

    public SignUpVO(UserType userType, String username, String password, String password_confirm, String name,
                    String company, String e_mail, String authenticationCode, String phoneNumber) {
        this.userType = userType;
        this.username = username;
        this.password = password;
        this.password_confirm = password_confirm;
        this.name = name;
        this.company = company;
        this.e_mail = e_mail;
        this.authenticationCode = authenticationCode;
        this.phoneNumber = phoneNumber;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword_confirm() {
        return password_confirm;
    }

    public void setPassword_confirm(String password_confirm) {
        this.password_confirm = password_confirm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getAuthenticationCode() {
        return authenticationCode;
    }

    public void setAuthenticationCode(String authenticationCode) {
        this.authenticationCode = authenticationCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
