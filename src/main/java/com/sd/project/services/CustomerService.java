package com.sd.project.services;

import java.util.List;

import com.sd.project.entity.Customer;

public interface CustomerService {
    public Customer save(Customer customer);
    public Customer findByIdCustomer(long id);
    public List<Customer> findAllCustomer();
    public void deleteCustomer(long id);
}
