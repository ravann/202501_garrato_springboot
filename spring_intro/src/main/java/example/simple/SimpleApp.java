package example.simple;

public class SimpleApp {

    public static void main(String[] args)
    {
        PaymentService paymentService = new PaymentService(new PaypalGateway());
        paymentService.getStatus();

        // PaymentService paymentService2 = new PaymentService(new StripeGateway());
        // paymentService2.getStatus();
    }
}
