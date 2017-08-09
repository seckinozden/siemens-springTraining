package com.siemens.config;

import com.siemens.dao.DBCustomerDao;
import com.siemens.dao.FileCustomerDao;
import com.siemens.dao.ICustomerDao;
import com.siemens.manager.CustomerManager;
import com.siemens.manager.CustomerCache;
import com.siemens.manager.EDaoType;
import com.siemens.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan("com.siemens")
@Profile("dev")
public class CustmerConfig {

    @Bean
    public Customer customer(){ return new Customer();}

    @Bean
    @Profile("live")
    public ICustomerDao customerDao(@Value("${siemens.basic.dao.type}") EDaoType eDaoType){
        switch (eDaoType){
            case FILE: return  new FileCustomerDao();
            case DB: return new DBCustomerDao();
            default: return new FileCustomerDao();
        }
    }

    @Bean
    public CustomerManager customerManager(){
        return new CustomerManager();
    }

    @Bean
    public CustomerCache customerCache(){
        return new CustomerCache();
    }
}
