package example.factory;

public class PaymentService
{

    public Gateway gateway;

    public PaymentService(Gateway gateway) {
        System.out.println("PaymentService instance created");
        this.gateway = gateway;
    }

    public String findStatus(String id) {
        return gateway.findStatus(id);
    }
}
