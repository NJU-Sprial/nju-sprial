package po;

import enums.AssetType;
import enums.LoanType;

import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * Created by Guo on 2017/9/12.
 */
public class PersonalConsumptionLoanPO {
    String username;
    String projectID;
    AssetType assetType;

    /**贷款情况*/
    String purpose;
    LocalDate releaseDate;
    LocalDate expirationDate;
    String profitType;
    LocalDate repayDay;
    String repayMethod;
    String RepayFrequency;
    BigDecimal contractAmount;
    double contractAnnualizedRate;
    LocalDate extractionDate;
    int leftMonth;
    BigDecimal currentBalance;
    double currentAnnualizedRate;
    String loanQuality;

    /**贷款情况*/
    LoanType loanType = LoanType.PersonalConsumption;
    String borrowerName;
    String certificateType;
    String certificateNumber;
    String nationality;
    String location;
    String sex;
    LocalDate birthday;
    String maritalStatus;
    int age;
    String occupation;
    BigDecimal annualIncome;
    double creditLevel;
    double incomeDebtRatio;
    String address;



}
