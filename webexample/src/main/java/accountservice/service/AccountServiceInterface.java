package accountservice.service;

import accountservice.exception.AccountAlreadyExistsException;
import accountservice.exception.AccountNotFoundException;
import accountservice.model.Account;

import java.util.List;

public interface AccountServiceInterface {
    List<Account> readAllAccounts();
    Account getAccountByNumber(String accountNumber) throws AccountNotFoundException;
    Account newAccount(Account account) throws AccountAlreadyExistsException;
    Account updateAmount(Account modifiedAccount) throws AccountNotFoundException;
}
