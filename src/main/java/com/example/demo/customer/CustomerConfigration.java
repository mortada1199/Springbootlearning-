package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfigration {
    @Value("${useFakeCustomerRepo:false}")
   private Boolean useFakeCustomerRepo;
    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("Command line Runner OKayyyyyyyyyyyyyy");
        };
    }
    @Bean
    CustomerRepo customerRepo(){
        System.out.println("useFackeCustomerRepo ="+useFakeCustomerRepo);
        return new CustomerFakeRepository();

    }
}
