package com.example.demo.customer;

import java.util.Collections;
import java.util.List;
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        //Todo Connect To Real DB
        return Collections.singletonList(
                new Customer(1L, "todo Data base","password","email@gmail.com")
        );
    }
}
