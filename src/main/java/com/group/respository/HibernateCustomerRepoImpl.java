package com.group.respository;

import com.group.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepoImpl implements HibernateCustomer {

    public List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> findall(){
        Customer customer = new Customer();
        customer.setFirstname("Bob");
        customer.setLastname("Hansen");
        customers.add(customer);
        return customers;
    }
}
