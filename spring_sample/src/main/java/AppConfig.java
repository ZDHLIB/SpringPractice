import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"zac.spring"})
public class AppConfig {

//    @Bean(name="customerService")
//    public ICustomerService getCustomerService(){
//        CustomerServiceImpl customerService = new CustomerServiceImpl();
//        customerService.setCustomerRepository(getCustomerRepository());
//        getCustomerRepository: spring will return the singleton of the object
//        CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
//        return customerService;
//    }

//    @Bean(name="customerRepository")
//    public ICustomerRepository getCustomerRepository(){
//        return new CustomerRepositoryImpl();
//    }
}
