package po;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Water on 2017/9/3.
 */
@Entity
@Table(name = "recruitment_situation", schema = "sprial")
@Data
public class RecruitmentSituationPO {
    private String investor;//投资人
    private double amount;//投资金额
    private double rate;//投资利率
    private int id;

    @Basic
    @Column(name = "investor")
    public String getInvestor() {
        return investor;
    }

    public void setInvestor(String investor) {
        this.investor = investor;
    }

    @Basic
    @Column(name = "amount")
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "rate")
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecruitmentSituationPO that = (RecruitmentSituationPO) o;

        if (Double.compare(that.amount, amount) != 0) return false;
        if (Double.compare(that.rate, rate) != 0) return false;
        if (id != that.id) return false;
        return investor.equals(that.investor);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = investor.hashCode();
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + id;
        return result;
    }
}
