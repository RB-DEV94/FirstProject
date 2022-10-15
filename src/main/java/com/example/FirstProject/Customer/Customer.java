package com.example.FirstProject.Customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


@Entity
@Table
public class Customer
{

    @Id
    private  Long id;

    @NotBlank(message="name must not be blank")
    private  String name;

    @JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
    @NotBlank(message="password must not be empty")
    private  String password;


    @NotBlank(message="email must not empty")
    @Email
    private  String email;


    public  Customer(Long id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password=password;
        this.email = email;
    }



    public Customer()
    {

    }
    @JsonProperty("customer_id")
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
