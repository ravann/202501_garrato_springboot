package example.simpleinterface;

public class SimpleInterfaceApp {

    public static void main(String[] args)
    {
        Gateway gateway = new PaypalGateway();
        PaymentService paymentService = new PaymentService(gateway);
        paymentService.getStatus();

        gateway = new StripeGateway();
        PaymentService paymentService2 = new PaymentService(gateway);
        paymentService2.getStatus();
    }
}
