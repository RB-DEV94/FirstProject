package com.example.FirstProject.Customer;

import com.example.FirstProject.Exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CustomerService
{
    private final CustomerRepository customerRepo;


    @Autowired
    public CustomerService(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomers() {
        return customerRepo.findAll();
    }

    Customer getCustomer(Long id)
    {
        return customerRepo.findById(id)
                .orElseThrow(()->new NotFoundException("Customer with id " + id + "not found"));
    }
}
