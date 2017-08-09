package com.siemens;

import com.siemens.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CustomerApplication {


    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(CustomerApplication.class, args);
        Customer customer = context.getBean(Customer.class);
        System.out.println(customer.getName());
    }
}
