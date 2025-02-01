package example.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("service")
public class PaymentService
{

    public Gateway paymentGateway;

    @Autowired
    public PaymentService(Gateway gateway) {
        System.out.println("PaymentService instance created");
        this.paymentGateway = gateway;
    }

    public String findStatus(String id) {
        return paymentGateway.findStatus(id);
    }
}
