package example.simple;

public class PaymentService
{
    PaypalGateway paypalGateway;
    StripeGateway stripeGateway;
    int gatewayType;

    public PaymentService(PaypalGateway paypalGateway)
    {
        this.paypalGateway = paypalGateway;
        this.gatewayType = 1;
    }

    public PaymentService(StripeGateway stripeGateway)
    {
        this.stripeGateway = stripeGateway;
        this.gatewayType = 2;
    }


    public void getStatus()
    {
        System.out.println("Getting status of payment from PaymentService: ");
        if(this.gatewayType == 1)
        {
            paypalGateway.getStatus();
        }
        else if(this.gatewayType == 2)
        {
            stripeGateway.getStatus();
        }
    }
}
