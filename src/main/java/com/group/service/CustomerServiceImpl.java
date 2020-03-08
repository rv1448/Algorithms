package com.group.service;

import com.group.model.Customer;
import com.group.respository.HibernateCustomer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    HibernateCustomer customerrepo;


    public CustomerServiceImpl(){


    }

    public CustomerServiceImpl(HibernateCustomer repoimpl){
        System.out.println("we are using constructors injection");
        this.customerrepo = repoimpl;
    }

    @Autowired
    public void setCustomerrepo(HibernateCustomer customerrepo) {
        System.out.println("we are using setter injection");
        this.customerrepo = customerrepo;
    }



    @Override
    public List<Customer> findall(){
        return customerrepo.findall();
    }

}
