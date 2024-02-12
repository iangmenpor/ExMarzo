package com.IanG.BancoApp.features.customer.domain;

import java.util.ArrayList;

public interface CustomerRepository {

    Customer getCustomer(String dni);
    void createCustomer(Customer customer);
    void deleteCustomer(String id);
    ArrayList<Customer> getCustomers();
    void updateCustomer(Customer customer);
}
