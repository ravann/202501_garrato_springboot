package accountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "accountservice")
public class AccountServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApp.class, args);
    }
}
