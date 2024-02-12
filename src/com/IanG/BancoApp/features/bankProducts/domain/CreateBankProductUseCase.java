package com.IanG.BancoApp.features.bankProducts.domain;

public class CreateBankProductUseCase {
    private final BankProductsRepository bankProductsRepository;

    public CreateBankProductUseCase(BankProductsRepository bankProductsRepository){
        this.bankProductsRepository = bankProductsRepository;
    }

    public void execute(BankProducts bankProducts){
        bankProductsRepository.createProduct(bankProducts);
    }
}
