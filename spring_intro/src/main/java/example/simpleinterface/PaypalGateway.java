package example.simpleinterface;

public class PaypalGateway implements Gateway {

    public void getStatus()
    {
        System.out.println("Getting status of payment from PaypalGateway: ");
    }

    public void processPayment() {
        System.out.println("Processing payment from PaypalGateway: ");
    }

    public void refundPayment() {
        System.out.println("Refunding payment from PaypalGateway: ");
    }

}
