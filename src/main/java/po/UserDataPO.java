package po;

import enums.UserState;
import enums.UserType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_data", schema = "sprial")
public class UserDataPO implements Serializable {
    private static final long serialVersionUID = 5748532289010606834L;
    private String username;
    private String password;
    private String name;
    private String company;
    private String email;
    private String authenticationCode;
    private String phoneNumber;
    private UserType userType;
    private UserState userState;
    private Boolean offline;

    @Id
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "authentication_code")
    public String getAuthenticationCode() {
        return authenticationCode;
    }

    public void setAuthenticationCode(String authenticationCode) {
        this.authenticationCode = authenticationCode;
    }

    @Basic
    @Column(name = "phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "user_type")
    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Basic
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "user_state")
    public UserState getUserState() {
        return userState;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    @Basic
    @Column(name = "offline")
    public Boolean getOffline() {
        return offline;
    }

    public void setOffline(Boolean offline) {
        this.offline = offline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDataPO that = (UserDataPO) o;

        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (company != null ? !company.equals(that.company) : that.company != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (authenticationCode != null ? !authenticationCode.equals(that.authenticationCode) : that.authenticationCode != null)
            return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (userType != null ? !userType.equals(that.userType) : that.userType != null) return false;
        if (userState != null ? !userState.equals(that.userState) : that.userState != null) return false;
        if (offline != null ? !offline.equals(that.offline) : that.offline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (authenticationCode != null ? authenticationCode.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        result = 31 * result + (userState != null ? userState.hashCode() : 0);
        result = 31 * result + (offline != null ? offline.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserDataPO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", authenticationCode='" + authenticationCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userType=" + userType +
                ", userState=" + userState +
                ", offline=" + offline +
                '}';
    }
}
