package com.example.FirstProject.Customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Controller for Rest API
@RequestMapping(path="api/v1/customer")
@RestController
@Deprecated
public class CustomerController
{

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService)
    {
        this.customerService=customerService;
    }

    @GetMapping(value="all")
    List<Customer> getCustomer()
    {
        return customerService.getCustomers();
    }

    @PostMapping
    void createnewCustomer(@RequestBody  Customer customer)
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
