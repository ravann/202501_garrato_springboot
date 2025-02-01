package example.annot;

import org.springframework.stereotype.Component;

@Component("stripe")
public class StripeGateway implements Gateway
{

    public StripeGateway() {
        System.out.println("StripeGateway instance created");
    }

    public String findStatus(String id) {
        System.out.println("StripeGateway findStatus called");
        return "SUCCESS";
    }
}
