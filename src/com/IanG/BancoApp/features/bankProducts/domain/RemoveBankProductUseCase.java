package com.IanG.BancoApp.features.bankProducts.domain;

public class RemoveBankProductUseCase {
    private final BankProductsRepository bankProductsRepository;

    public RemoveBankProductUseCase(BankProductsRepository bankProductsRepository){
        this.bankProductsRepository = bankProductsRepository;
    }

    public void execute(String id){
        bankProductsRepository.removeProduct(id);
    }
}
