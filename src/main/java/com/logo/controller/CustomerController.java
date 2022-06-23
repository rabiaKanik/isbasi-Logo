package com.logo.controller;

import com.logo.model.Customer;
import com.logo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer createCustomer(@PathVariable String name ){
        return customerService.create(name);
    }

    @GetMapping(value= "/all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }





}
