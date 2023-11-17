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
    @NotBlank
    private final String name;
    @NotBlank
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final  String password;
@NotBlank
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
