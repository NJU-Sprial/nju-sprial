package po;

import enums.LoanType;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author yinywf
 * Created on 2017/11/17
 */
@Entity
@Table(name = "loan", schema = "sprial")
@DynamicUpdate
@DynamicInsert
public class LoanPO implements Serializable{
    private static final long serialVersionUID = -4228830630350579111L;
    private String loanId;
    private String purpose;
    private LocalDateTime releaseDate;
    private LocalDateTime expirationDate;
    private String profitType;
    private Integer repayDay;
    private String repayMethod;
    private String repayFrequency;
    private Integer contractAmount;
    private Double contractAnnualizedRate;
    private LocalDateTime extractionDate;
    private Integer leftMonth;
    private BigDecimal currentBalance;
    private Double currentAnnualizedRate;
    private String loanQuality;
    private Integer propertyPackageId;
    private Integer projectId;
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
    private BigDecimal occupation;
    private BigDecimal annualIncome;
    private Double creditLevel;
    private Double incomeDebtRatio;
    private String address;

    @Id
    @Column(name = "loan_id")
    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    @Basic
    @Column(name = "purpose")
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Basic
    @Column(name = "release_date")
    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Basic
    @Column(name = "expiration_date")
    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Basic
    @Column(name = "profit_type")
    public String getProfitType() {
        return profitType;
    }

    public void setProfitType(String profitType) {
        this.profitType = profitType;
    }

    @Basic
    @Column(name = "repay_day")
    public Integer getRepayDay() {
        return repayDay;
    }

    public void setRepayDay(Integer repayDay) {
        this.repayDay = repayDay;
    }

    @Basic
    @Column(name = "repay_method")
    public String getRepayMethod() {
        return repayMethod;
    }

    public void setRepayMethod(String repayMethod) {
        this.repayMethod = repayMethod;
    }

    @Basic
    @Column(name = "repay_frequency")
    public String getRepayFrequency() {
        return repayFrequency;
    }

    public void setRepayFrequency(String repayFrequency) {
        this.repayFrequency = repayFrequency;
    }

    @Basic
    @Column(name = "contract_amount")
    public Integer getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Integer contractAmount) {
        this.contractAmount = contractAmount;
    }

    @Basic
    @Column(name = "contract_annualized_rate")
    public Double getContractAnnualizedRate() {
        return contractAnnualizedRate;
    }

    public void setContractAnnualizedRate(Double contractAnnualizedRate) {
        this.contractAnnualizedRate = contractAnnualizedRate;
    }

    @Basic
    @Column(name = "extraction_date")
    public LocalDateTime getExtractionDate() {
        return extractionDate;
    }

    public void setExtractionDate(LocalDateTime extractionDate) {
        this.extractionDate = extractionDate;
    }

    @Basic
    @Column(name = "left_month")
    public Integer getLeftMonth() {
        return leftMonth;
    }

    public void setLeftMonth(Integer leftMonth) {
        this.leftMonth = leftMonth;
    }

    @Basic
    @Column(name = "current_balance")
    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Basic
    @Column(name = "current_annualized_rate")
    public Double getCurrentAnnualizedRate() {
        return currentAnnualizedRate;
    }

    public void setCurrentAnnualizedRate(Double currentAnnualizedRate) {
        this.currentAnnualizedRate = currentAnnualizedRate;
    }

    @Basic
    @Column(name = "loan_quality")
    public String getLoanQuality() {
        return loanQuality;
    }

    public void setLoanQuality(String loanQuality) {
        this.loanQuality = loanQuality;
    }

    @Basic
    @Column(name = "property_package_id")
    public Integer getPropertyPackageId() {
        return propertyPackageId;
    }

    public void setPropertyPackageId(Integer propertyPackageId) {
        this.propertyPackageId = propertyPackageId;
    }

    @Basic
    @Column(name = "project_id")
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Basic
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "loan_type")
    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    @Basic
    @Column(name = "borrower_name")
    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    @Basic
    @Column(name = "certificate_type")
    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    @Basic
    @Column(name = "certificate_number")
    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    @Basic
    @Column(name = "nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "birthday")
    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "marital_status")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "occupation")
    public BigDecimal getOccupation() {
        return occupation;
    }

    public void setOccupation(BigDecimal occupation) {
        this.occupation = occupation;
    }

    @Basic
    @Column(name = "annual_income")
    public BigDecimal getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(BigDecimal annualIncome) {
        this.annualIncome = annualIncome;
    }

    @Basic
    @Column(name = "credit_level")
    public Double getCreditLevel() {
        return creditLevel;
    }

    public void setCreditLevel(Double creditLevel) {
        this.creditLevel = creditLevel;
    }

    @Basic
    @Column(name = "income_debt_ratio")
    public Double getIncomeDebtRatio() {
        return incomeDebtRatio;
    }

    public void setIncomeDebtRatio(Double incomeDebtRatio) {
        this.incomeDebtRatio = incomeDebtRatio;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoanPO loanPO = (LoanPO) o;

        if (loanId != null ? !loanId.equals(loanPO.loanId) : loanPO.loanId != null) return false;
        if (purpose != null ? !purpose.equals(loanPO.purpose) : loanPO.purpose != null) return false;
        if (releaseDate != null ? !releaseDate.equals(loanPO.releaseDate) : loanPO.releaseDate != null) return false;
        if (expirationDate != null ? !expirationDate.equals(loanPO.expirationDate) : loanPO.expirationDate != null)
            return false;
        if (profitType != null ? !profitType.equals(loanPO.profitType) : loanPO.profitType != null) return false;
        if (repayDay != null ? !repayDay.equals(loanPO.repayDay) : loanPO.repayDay != null) return false;
        if (repayMethod != null ? !repayMethod.equals(loanPO.repayMethod) : loanPO.repayMethod != null) return false;
        if (repayFrequency != null ? !repayFrequency.equals(loanPO.repayFrequency) : loanPO.repayFrequency != null)
            return false;
        if (contractAmount != null ? !contractAmount.equals(loanPO.contractAmount) : loanPO.contractAmount != null)
            return false;
        if (contractAnnualizedRate != null ? !contractAnnualizedRate.equals(loanPO.contractAnnualizedRate) : loanPO.contractAnnualizedRate != null)
            return false;
        if (extractionDate != null ? !extractionDate.equals(loanPO.extractionDate) : loanPO.extractionDate != null)
            return false;
        if (leftMonth != null ? !leftMonth.equals(loanPO.leftMonth) : loanPO.leftMonth != null) return false;
        if (currentBalance != null ? !currentBalance.equals(loanPO.currentBalance) : loanPO.currentBalance != null)
            return false;
        if (currentAnnualizedRate != null ? !currentAnnualizedRate.equals(loanPO.currentAnnualizedRate) : loanPO.currentAnnualizedRate != null)
            return false;
        if (loanQuality != null ? !loanQuality.equals(loanPO.loanQuality) : loanPO.loanQuality != null) return false;
        if (propertyPackageId != null ? !propertyPackageId.equals(loanPO.propertyPackageId) : loanPO.propertyPackageId != null)
            return false;
        if (projectId != null ? !projectId.equals(loanPO.projectId) : loanPO.projectId != null) return false;
        if (loanType != null ? !loanType.equals(loanPO.loanType) : loanPO.loanType != null) return false;
        if (borrowerName != null ? !borrowerName.equals(loanPO.borrowerName) : loanPO.borrowerName != null)
            return false;
        if (certificateType != null ? !certificateType.equals(loanPO.certificateType) : loanPO.certificateType != null)
            return false;
        if (certificateNumber != null ? !certificateNumber.equals(loanPO.certificateNumber) : loanPO.certificateNumber != null)
            return false;
        if (nationality != null ? !nationality.equals(loanPO.nationality) : loanPO.nationality != null) return false;
        if (location != null ? !location.equals(loanPO.location) : loanPO.location != null) return false;
        if (gender != null ? !gender.equals(loanPO.gender) : loanPO.gender != null) return false;
        if (birthday != null ? !birthday.equals(loanPO.birthday) : loanPO.birthday != null) return false;
        if (maritalStatus != null ? !maritalStatus.equals(loanPO.maritalStatus) : loanPO.maritalStatus != null)
            return false;
        if (age != null ? !age.equals(loanPO.age) : loanPO.age != null) return false;
        if (occupation != null ? !occupation.equals(loanPO.occupation) : loanPO.occupation != null) return false;
        if (annualIncome != null ? !annualIncome.equals(loanPO.annualIncome) : loanPO.annualIncome != null)
            return false;
        if (creditLevel != null ? !creditLevel.equals(loanPO.creditLevel) : loanPO.creditLevel != null) return false;
        if (incomeDebtRatio != null ? !incomeDebtRatio.equals(loanPO.incomeDebtRatio) : loanPO.incomeDebtRatio != null)
            return false;
        if (address != null ? !address.equals(loanPO.address) : loanPO.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = loanId != null ? loanId.hashCode() : 0;
        result = 31 * result + (purpose != null ? purpose.hashCode() : 0);
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        result = 31 * result + (expirationDate != null ? expirationDate.hashCode() : 0);
        result = 31 * result + (profitType != null ? profitType.hashCode() : 0);
        result = 31 * result + (repayDay != null ? repayDay.hashCode() : 0);
        result = 31 * result + (repayMethod != null ? repayMethod.hashCode() : 0);
        result = 31 * result + (repayFrequency != null ? repayFrequency.hashCode() : 0);
        result = 31 * result + (contractAmount != null ? contractAmount.hashCode() : 0);
        result = 31 * result + (contractAnnualizedRate != null ? contractAnnualizedRate.hashCode() : 0);
        result = 31 * result + (extractionDate != null ? extractionDate.hashCode() : 0);
        result = 31 * result + (leftMonth != null ? leftMonth.hashCode() : 0);
        result = 31 * result + (currentBalance != null ? currentBalance.hashCode() : 0);
        result = 31 * result + (currentAnnualizedRate != null ? currentAnnualizedRate.hashCode() : 0);
        result = 31 * result + (loanQuality != null ? loanQuality.hashCode() : 0);
        result = 31 * result + (propertyPackageId != null ? propertyPackageId.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (loanType != null ? loanType.hashCode() : 0);
        result = 31 * result + (borrowerName != null ? borrowerName.hashCode() : 0);
        result = 31 * result + (certificateType != null ? certificateType.hashCode() : 0);
        result = 31 * result + (certificateNumber != null ? certificateNumber.hashCode() : 0);
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (maritalStatus != null ? maritalStatus.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (occupation != null ? occupation.hashCode() : 0);
        result = 31 * result + (annualIncome != null ? annualIncome.hashCode() : 0);
        result = 31 * result + (creditLevel != null ? creditLevel.hashCode() : 0);
        result = 31 * result + (incomeDebtRatio != null ? incomeDebtRatio.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
