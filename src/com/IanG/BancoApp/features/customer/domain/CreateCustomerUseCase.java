package com.IanG.BancoApp.features.customer.domain;

public class CreateCustomerUseCase {

    private final CustomerRepository customerRepository;
    public CreateCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void execute(Customer customer){
        customerRepository.createCustomer(customer);

    }
}
