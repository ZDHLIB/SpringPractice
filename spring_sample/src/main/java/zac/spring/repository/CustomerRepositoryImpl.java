package zac.spring.repository;

import org.springframework.stereotype.Repository;
import zac.spring.model.Customer;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements ICustomerRepository {

    private String dbUsername;

    public List<Customer> findAll(){
        System.out.println(this.dbUsername);
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Zac");
        customer.setLastName("Zhong");
        customers.add(customer);
        return customers;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }
}
