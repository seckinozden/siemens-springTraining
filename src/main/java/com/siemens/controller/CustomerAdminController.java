package com.siemens.controller;

import com.siemens.manager.CustomerManager;
import com.siemens.model.Customer;
import com.siemens.model.CustomerList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerAdminController {

    @Autowired
    private CustomerManager customerManager;

    @RequestMapping(value = "/allcustomers",produces = {"application/json","application/xml"})
    public ResponseEntity<CustomerList> allCustomers(){
        List<Customer> customers = customerManager.getAllCustomers();
        CustomerList customerList = new CustomerList(customers);
        return ResponseEntity.ok(customerList);
    }

    @RequestMapping(value = "/customerNew", method = RequestMethod.PUT, produces = {"application/xml", "application/json"}, consumes = {"application/xml", "application/json"})
    public ResponseEntity<?> updateCustomerNew(@RequestBody Customer customer) {
        Customer result = customerManager.saveCustomer(customer);
        return ResponseEntity.ok(result);
    }

}
