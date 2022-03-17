package com.example.customerservice.controllers;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{id}")
    public Customer findCustomer(@PathVariable("id") String id){
        return customerService.findCustomer(id);
    }

}
