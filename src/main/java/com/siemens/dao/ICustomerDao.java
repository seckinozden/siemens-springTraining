package com.siemens.dao;

import com.siemens.model.Customer;
import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;

import java.util.List;

public interface ICustomerDao {
     List<Customer> getAllCustomers();
     Customer save(Customer customer);
}
