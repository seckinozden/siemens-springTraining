package com.siemens.manager;

import com.siemens.dao.ICustomerDao;
import com.siemens.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.util.List;

public class CustomerManager {

    @Value("${seckin.my.prop}")
    private ECacheType cahceType;

    @Autowired
    private ICustomerDao customerDAO;

    @Autowired
    private CustomerCache customerCache;


    public CustomerManager(){

    }

    @PostConstruct
    public void init(){
        List<Customer> allCustomers = customerDAO.getAllCustomers();
        customerCache.refreshMap(allCustomers);
    }

    public List<Customer> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }

    public Customer saveCustomer(Customer customer){ return customerDAO.save(customer);}
}
