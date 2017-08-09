package com.siemens.manager;

import com.siemens.model.Customer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CustomerCache {


    private Map<Long, Customer> customerMap = new HashMap<>();

    public void refreshMap(List<Customer> customerList) {
        Map<Long, Customer> tempCustomerMap = new HashMap<>();
        for (Customer customer : customerList) {
            tempCustomerMap.put(customer.getId(),
                    customer);
        }
        customerMap = tempCustomerMap;
    }
}
