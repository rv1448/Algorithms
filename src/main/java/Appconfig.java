import com.group.respository.HibernateCustomer;
import com.group.respository.HibernateCustomerRepoImpl;
import com.group.service.CustomerService;
import com.group.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.group"})
public class Appconfig {


    @Bean(name="CustomerService")
    public CustomerService setCustomerService(){
//        CustomerServiceImpl cs = new CustomerServiceImpl(getCustomerRepo());
        CustomerServiceImpl cs = new CustomerServiceImpl();
        //cs.setCustomerrepo(getCustomerRepo());
        return cs;
    }

    @Bean(name = "CustomerRepo")
     public HibernateCustomer getCustomerRepo(){
         return new HibernateCustomerRepoImpl();
     }
}
