package accountservice.service;

import accountservice.exception.AccountAlreadyExistsException;
import accountservice.exception.AccountNotFoundException;
import accountservice.repository.AccountRepository;

import accountservice.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("unused")
@Service
public class AccountService implements AccountServiceInterface {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> readAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountByNumber(String accountNumber) throws AccountNotFoundException {
        return accountRepository.findById(accountNumber)
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }

    @Override
    public Account newAccount(Account account) throws AccountAlreadyExistsException {
        if (accountRepository.existsById(account.getAccountNumber())) {
            throw new AccountAlreadyExistsException("Account already exists");
        }
        return accountRepository.save(account);
    }

    @Override
    public Account updateAmount(Account modifiedAccount) throws AccountNotFoundException {
        Account account = getAccountByNumber(modifiedAccount.getAccountNumber());
        account.setAccountBalance(modifiedAccount.getAccountBalance());
        return accountRepository.save(account);
    }
}
