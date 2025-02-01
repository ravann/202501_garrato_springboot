package example.simpleinterface;

public class StripeGateway implements Gateway {

    public void getStatus()
    {
        System.out.println("Getting status of payment from StripeGateway: ");
    }

    public void processPayment() {
        System.out.println("Processing payment from StripeGateway: ");
    }

}
