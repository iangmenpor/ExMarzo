package com.IanG.BancoApp.features.customer.domain;

public class DeleteCustomerUseCase {

    private final CustomerRepository customerRepository;
    public DeleteCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void execute(String dni){
        customerRepository.deleteCustomer(dni);

    }
}
