package accountservice.controller;

import accountservice.exception.AccountAlreadyExistsException;
import accountservice.exception.AccountNotFoundException;
import accountservice.model.Account;
import accountservice.service.AccountServiceInterface;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
@SuppressWarnings("unused")
@Tag(name = "Account Service", description = "Operations related to Account Service")
public class AccountController {

    @Autowired
    private AccountServiceInterface accountService;

    @Operation(summary = "Welcome to Account Service", description = "Welcome message")
    @GetMapping("/welcome")
    public String welcomeHander() {
        return "Welcome to Account Service!";
    }

    @Operation(summary = "Get all accounts", description = "Get all accounts")
    @GetMapping("/all")
    public List<Account> getAllAccounts() {
        return accountService.readAllAccounts();
    }

    @Operation(summary = "Get account by account number", description = "Get account by account number")
    @GetMapping("/{accountNumber}")
    public Account getAccountByNumber(@PathVariable String accountNumber) throws AccountNotFoundException {
        return accountService.getAccountByNumber(accountNumber);
    }

    @Operation(summary = "Create a new account", description = "Create a new account")
    @PostMapping("/create")
    public Account createAccount(@RequestBody Account account) throws AccountAlreadyExistsException {
        return accountService.newAccount(account);
    }

    @Operation(summary = "Delete account by account number", description = "Delete account by account number")
    @PutMapping("/{accountNumber}")
    public Account updateAccountAmount(@PathVariable String accountNumber, @RequestBody Account modifiedAccount) throws AccountNotFoundException {
        modifiedAccount.setAccountNumber(accountNumber);
        return accountService.updateAmount(modifiedAccount);
    }

}
