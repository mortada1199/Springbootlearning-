package com.example.demo.customer;

import com.example.demo.exception.ApiRequestException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerControllerV1 {
    private final  CustomerService customerService;
    @Autowired

    public CustomerControllerV1(CustomerService customerService){

        this.customerService =customerService;
    }
@GetMapping
List<Customer> getCustomers(){
        return customerService.getCustomers();
}

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") long id){
        return customerService.getCustomer(id);
    }

    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") long id){
throw  new ApiRequestException("ApiRequestException for customer  " + id);
    }
@PostMapping
    void createNewCustomer(@Valid @RequestBody   Customer customer){
    System.out.println("Request Body ====");
    System.out.println(customer);
}
@DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") long id){
    System.out.println("Delete Request fromthe customer with id "+id);
}
@PutMapping()
    void updateCustomer(@RequestBody Customer customer){
    System.out.println("Update REquest");
    System.out.println(customer);
}
}
