package po;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yinywf on 2017/9/7
 */
@Entity
@Table(name = "verification_code", schema = "sprial")
public class VerificationCodePO implements Serializable {
    private static final long serialVersionUID = -5025406318716780775L;
    private String email;
    private String code;

    @Id
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VerificationCodePO that = (VerificationCodePO) o;

        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
