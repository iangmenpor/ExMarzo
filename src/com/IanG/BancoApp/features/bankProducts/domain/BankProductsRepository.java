package com.IanG.BancoApp.features.bankProducts.domain;

import java.util.ArrayList;

public interface BankProductsRepository {

    void createProduct(BankProducts bankProducts);
    ArrayList<BankProducts> getProducts ();
    BankProducts getProduct(String id);
    void removeProduct(String id);
    void updateProduct(BankProducts bankProducts);
}
