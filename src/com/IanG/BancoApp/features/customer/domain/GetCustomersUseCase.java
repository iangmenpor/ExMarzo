package com.IanG.BancoApp.features.customer.domain;

public class GetCustomersUseCase {
    private final CustomerRepository customerRepository;
    public GetCustomersUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void execute(){
        customerRepository.getCustomers();

    }
}
