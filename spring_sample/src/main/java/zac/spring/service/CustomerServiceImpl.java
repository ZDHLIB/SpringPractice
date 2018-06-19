package zac.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zac.spring.model.Customer;
import zac.spring.repository.ICustomerRepository;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    public CustomerServiceImpl(){}

//    @Autowired
    public CustomerServiceImpl(ICustomerRepository customerRepository){
        System.out.println("Autowire customerRepository by constructor");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

//    @Autowired
    public void setCustomerRepository(ICustomerRepository customerRepository) {
        System.out.println("Autowire customerRepository by setter");
        this.customerRepository = customerRepository;
    }
}
