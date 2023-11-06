package com.example.demo.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Customer {
    private final  Long id;
    private final String name;

    @Override
    public String toString() {
     return "Customer{"+
             "id="+id +
             ",name='"+name +'\''+'}';
    }
}
