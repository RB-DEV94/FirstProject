package com.example.FirstProject.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Controller for Rest API
@RequestMapping(path="api/v2/customers")
@RestController
public class CustomerControllerV2
{

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService)
    {
        this.customerService=customerService;
    }

    @GetMapping
    List<Customer> getCustomers()
    {
        return customerService.getCustomers();
    }

    @GetMapping(path="{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id)
    {
        return customerService.getCustomer(id);
    }

    @PostMapping
    void createnewCustomer(@RequestBody Customer customer)
    {
        System.out.println("Post Request");
        System.out.println(customer);
    }


    @DeleteMapping(path="{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id)
    {
        System.out.println("delete id is  " +id);
    }

    @PutMapping
    void updateCustomer(@RequestBody  Customer customer)
    {
        System.out.println("update");
    }

}
