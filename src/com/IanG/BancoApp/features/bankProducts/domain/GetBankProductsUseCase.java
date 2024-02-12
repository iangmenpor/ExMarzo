package com.IanG.BancoApp.features.bankProducts.domain;

import java.util.ArrayList;

public class GetBankProductsUseCase {

    private final BankProductsRepository bankProductsRepository;

    public GetBankProductsUseCase(BankProductsRepository bankProductsRepository){
        this.bankProductsRepository = bankProductsRepository;
    }

    public ArrayList<BankProducts> execute(){
        return bankProductsRepository.getProducts();
    }
}
