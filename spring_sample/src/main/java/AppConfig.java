import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"zac.spring"})
@PropertySource("app.properties")
//@PropertySources({
//        @PropertySource("app.properties"),
//        @PropertySource("app.properties")
//})
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

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
