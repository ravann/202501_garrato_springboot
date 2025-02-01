package example.simpleinterface;

public class PaymentService
{
    Gateway gateway;

    public PaymentService(Gateway gateway)
    {
        this.gateway = gateway;
    }

    public void getStatus()
    {
        System.out.println("Getting status of payment from PaymentService: ");
        gateway.getStatus();

        if( gateway instanceof PaypalGateway)
        {
            PaypalGateway paypalGateway = (PaypalGateway) gateway;
            paypalGateway.refundPayment();
        }

    }
}
