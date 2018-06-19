package zac.spring.service;

import zac.spring.model.Customer;
import zac.spring.repository.CustomerRepositoryImpl;
import zac.spring.repository.ICustomerRepository;

import java.util.List;

public class CustomerServiceImple implements ICustomerService {

    private ICustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
