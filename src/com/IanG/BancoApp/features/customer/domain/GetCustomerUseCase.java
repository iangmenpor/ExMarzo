package com.IanG.BancoApp.features.customer.domain;

public class GetCustomerUseCase {

    private final CustomerRepository customerRepository;

    public GetCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer execute(String dni){

        return customerRepository.getCustomer(dni);
    }
}
