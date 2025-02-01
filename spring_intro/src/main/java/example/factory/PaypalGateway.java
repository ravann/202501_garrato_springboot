package example.factory;

public class PaypalGateway implements Gateway
{

    public PaypalGateway() {
        System.out.println("PaypalGateway instance created");
    }

    public String findStatus(String id) {
        System.out.println("PaypalGateway findStatus called");
        return "SUCCESS";
    }
}
