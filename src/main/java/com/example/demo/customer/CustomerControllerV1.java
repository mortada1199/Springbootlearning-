package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("Api/Customer/")
@RestController
public class CustomerController {
    private final  CustomerService customerService;
    @Autowired

    public CustomerController(CustomerService customerService){

        this.customerService =customerService;
    }
@GetMapping
List<Customer> getCustomer(){
        return  customerService.getCustomer();
}
@PostMapping
    void createNewCustomer(@RequestBody Customer customer){
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
