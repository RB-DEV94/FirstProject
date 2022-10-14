package com.example.FirstProject.Customer;

import java.util.Collections;
import java.util.List;


public class CustomerRepository implements CustomerRepo
{
    @Override
    public List<Customer> getCustomers() {
        return Collections.singletonList(
                new Customer(1L,"Implement Real DB","wdef", "email@gmail.com")
        );
    }
}
