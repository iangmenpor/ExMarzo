package com.IanG.BancoApp.features.customer.domain;

public class UpdateCustomerUseCase {
    private final CustomerRepository customerRepository;
    public UpdateCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void execute(Customer customer){
        customerRepository.updateCustomer(customer);

    }
}
