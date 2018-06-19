import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zac.spring.service.ICustomerService;

public class Application {
    public static void main(String[] orgs){
//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
//        ICustomerService service =
//                applicationContext.getBean("customerService", ICustomerService.class);
//        System.out.println(service.findAll().get(0).getFirstName());

        ApplicationContext appContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        ICustomerService service =
                appContext.getBean("customerService", ICustomerService.class);
        System.out.println(service);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
