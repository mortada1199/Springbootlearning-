package com.example.demo.customer;


import com.example.demo.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
@Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    List<Customer> getCustomers(){
    return  customerRepository.findAll();
}


    Customer getCustomer(long id){
        return customerRepository.findById(id).
                orElseThrow(()->new NotFoundException("cudtomer with id "+ id +" not found "));
    }
}
