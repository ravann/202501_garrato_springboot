package example.config;

public class PaymentService
{

    public Gateway paymentGateway;

    public PaymentService(Gateway gateway) {
        System.out.println("PaymentService instance created");
        this.paymentGateway = gateway;
    }

    public String findStatus(String id) {
        return paymentGateway.findStatus(id);
    }
}
