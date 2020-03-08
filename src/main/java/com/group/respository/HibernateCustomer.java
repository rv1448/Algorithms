package com.group.respository;

import com.group.model.Customer;

import java.util.List;

public interface HibernateCustomer {
    List<Customer> findall();
}
