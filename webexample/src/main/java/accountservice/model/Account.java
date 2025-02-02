package accountservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@SuppressWarnings("unused")
@Entity
public class Account {

    @Id
    private String accountNumber;
    private double accountBalance;
    private String accountType;
    private String currency;

    public Account() {
    }

    public Account(String accountNumber, double accountBalance, String accountType, String currency) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", accountType='" + accountType + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
