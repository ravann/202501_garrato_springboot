package example.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigApp {

    public static void main(String[] args) {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        PaymentService ps = context.getBean("stripe-service", PaymentService.class);
        System.out.println(ps.findStatus("1234"));
    }
}
