package zac.spring.service;

import zac.spring.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}
