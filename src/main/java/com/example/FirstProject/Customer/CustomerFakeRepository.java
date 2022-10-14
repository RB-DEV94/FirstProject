package com.example.FirstProject.Customer;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"Rahul Bhagwat","122", "email@gmail.com"),
                new Customer(2L,"Chintan Shah","qdswedf", "email@gmail.com")
        );
    }
}
