package example.factory;

/**
 * Hello world!
 *
 */
public class FactoryApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ObjectFactory of = new ObjectFactory();

        PaypalGateway paypalGateway = of.createPaypalGateway();
        PaymentService paymentService = of.createPaymentService(paypalGateway);

        String id = "1234";
        String status = paymentService.findStatus(id);
        System.out.println("Payment status for id " + id + " is " + status);

        StripeGateway stripeGateway = of.createStripeGateway();
        paymentService = of.createPaymentService(stripeGateway);
        id = "5678";
        status = paymentService.findStatus(id);
        System.out.println("Payment status for id " + id + " is " + status);

    }
}

