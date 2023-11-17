package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;
public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"ali","password_one","email@gmail.com"),
                new Customer(2L,"mohamed","password_two","email@gmail.com")
        );
    }
}
