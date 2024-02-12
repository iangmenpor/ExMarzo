package com.IanG.BancoApp.features.bankProducts.domain;

public class updateBankProductUseCase {

    private final BankProductsRepository bankProductsRepository;

    public updateBankProductUseCase(BankProductsRepository bankProductsRepository){
        this.bankProductsRepository = bankProductsRepository;
    }

    public void execute(BankProducts bankProducts){
        bankProductsRepository.updateProduct(bankProducts);
    }
}
