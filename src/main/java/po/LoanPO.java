package po;

import enums.LoanType;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * Created by yinywf on 2017/9/7
 */
@Entity
@Table(name = "loan", schema = "sprial")
@DynamicUpdate
@DynamicInsert
@Data
public class LoanPO implements Serializable {
    private static final long serialVersionUID = 8950856623294834521L;
    @Id
    private String loanId;
    private String purpose;
    private LocalDateTime releaseDate;
    private LocalDateTime expirationDate;
    private String profitType;
    private Integer repayDay;
    private String repayMethod;
    private String repayFrequency;
    private BigDecimal contractAmount;
    private Double contractAnnualizedRate;
    private LocalDateTime extractionDate;
    private Integer leftMonth;
    private BigDecimal currentBalance;
    private Double currentAnnualizedRate;
    private String loanQuality;
    private Integer propertyPackageId;
    private Integer projectId;
    @Enumerated(EnumType.ORDINAL)
    private LoanType loanType;

    private String borrowerName;
    private String certificateType;
    private String certificateNumber;
    private String nationality;
    private String location;
    private String gender;
    private LocalDateTime birthday;
    private String maritalStatus;
    private Integer age;
    private String occupation;
    private BigDecimal annualIncome;
    private Double creditLevel;
    private Double incomeDebtRatio;
    private String address;


}
