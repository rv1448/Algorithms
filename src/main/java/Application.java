import com.group.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext app = new AnnotationConfigApplicationContext(Appconfig.class);

        CustomerService cs = app.getBean("CustomerService",CustomerService.class);

        System.out.println(cs.findall().get(0).getFirstname());

    }
}
