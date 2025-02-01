package example.annot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class AnnotApp
{
    public static void main( String[] args ) {
        System.out.println("Hello World!");

        ApplicationContext context = new AnnotationConfigApplicationContext(ObjectConfig.class);

        PaymentService ps = context.getBean("service", PaymentService.class);
        System.out.println(ps.findStatus("1234"));
    }
}
