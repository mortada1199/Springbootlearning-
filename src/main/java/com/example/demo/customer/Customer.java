package com.example.demo.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@AllArgsConstructor
public class Customer {
    private final  Long id;

    @NotBlank(message = "name can,t be blank")
    private final String name;

    @NotBlank(message = "password can,t be blank")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final  String password;

@NotBlank(message = "email can,t be blank")
@Email//this  is the Email valiodation
    private final String email;
public long getCustomerId(){
    return  id;
}

    @Override
    public String toString() {
        return "Customer{"+
                "id="+id +
                ",name='"+name +'\''+
                ",password='"+password+'\''+
                ",email='"+email+'\''+
                '}';
    }
}
