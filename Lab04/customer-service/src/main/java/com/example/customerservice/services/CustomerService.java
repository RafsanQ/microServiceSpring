package com.example.customerservice.services;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer findCustomer(String id) {
        return customerRepository.findCustomerByID(id);
    }
}
