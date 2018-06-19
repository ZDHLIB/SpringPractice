package zac.spring.repository;

import zac.spring.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
}
