package zac.spring.repository;

import zac.spring.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {

    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Zac");
        customer.setLastName("Zhong");
        customers.add(customer);
        return customers;
    }
}
