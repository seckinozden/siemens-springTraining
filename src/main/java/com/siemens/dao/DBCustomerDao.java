package com.siemens.dao;

import com.siemens.model.Customer;
import com.siemens.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class DBCustomerDao implements ICustomerDao {

    @Autowired
    private ICustomerRepository customerRepositry;


    @Override
    public List<Customer> getAllCustomers() {
       Iterable<Customer> customers = customerRepositry.findAll();

       List<Customer> customerList = new ArrayList<>();

       for(Customer customer: customers)
            customerList.add(customer);

       return customerList;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepositry.save(customer);
    }
}
