package po;

import enums.AssetType;
import enums.LoanType;

import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * Created by Guo on 2017/9/12.
 */
public class PersonalConsumptionLoanPO {
    private String username;
    private String projectID;
    private AssetType assetType;

    /**贷款情况*/
    private String purpose;
    private LocalDate releaseDate;
    private LocalDate expirationDate;
    private String profitType;
    private Integer repayDay;
    private String repayMethod;
    private String repayFrequency;
    private BigDecimal contractAmount;
    private Double contractAnnualizedRate;
    private LocalDate extractionDate;
    private Integer leftMonth;
    private BigDecimal currentBalance;
    private Double currentAnnualizedRate;
    private String loanQuality;

    /**贷款情况*/
    private  LoanType loanType = LoanType.PersonalConsumption;
    private String borrowerName;
    private  String certificateType;
    private String certificateNumber;
    private String nationality;
    private String location;
    private String sex;
    private  LocalDate birthday;
    private String maritalStatus;
    private Integer age;
    private String occupation;
    private BigDecimal annualIncome;
    private Double creditLevel;
    private Double incomeDebtRatio;
    private String address;

}
