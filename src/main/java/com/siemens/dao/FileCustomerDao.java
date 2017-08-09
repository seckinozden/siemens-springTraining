package com.siemens.dao;

import com.siemens.model.Customer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class FileCustomerDao implements  ICustomerDao {


    public List<Customer> getAllCustomers() {

        List<Customer> customerList = new ArrayList<>();
        try (Stream<String> lines = Files.lines(Paths.get("customers.txt"))) {
            lines.map(line -> line.split(",")).
                    forEach(cust -> customerList.add(new Customer(Long.parseLong(cust[0]),
                            cust[1],
                            cust[2],
                            Integer.parseInt(cust[3]))));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return customerList;

    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }
}
