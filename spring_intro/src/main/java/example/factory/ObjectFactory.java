package example.factory;

public class ObjectFactory
{
    public PaypalGateway createPaypalGateway() {
        return new PaypalGateway();
    }

    public StripeGateway createStripeGateway() {
        return new StripeGateway();
    }

    public PaymentService createPaymentService(Gateway gateway) {
        return new PaymentService(gateway);
    }
}
