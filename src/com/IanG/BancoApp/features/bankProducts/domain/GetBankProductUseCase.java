package com.IanG.BancoApp.features.bankProducts.domain;

public class GetBankProductUseCase {

    private final BankProductsRepository bankProductsRepository;

    public GetBankProductUseCase(BankProductsRepository bankProductsRepository){
        this.bankProductsRepository = bankProductsRepository;
    }

    public BankProducts execute(String id){
       return bankProductsRepository.getProduct(id);
    }
}
