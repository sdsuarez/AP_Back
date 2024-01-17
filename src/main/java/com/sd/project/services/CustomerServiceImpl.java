package com.sd.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sd.project.entity.Customer;
import com.sd.project.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    
    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findByIdCustomer(long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
        }

    @Override
    public void deleteCustomer(long id) {
        customerRepository.deleteById(id);
    }
    
}
