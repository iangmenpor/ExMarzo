package com.IanG.BancoApp.features.bankAccount.domain;

import com.IanG.BancoApp.features.bankProducts.domain.BankProducts;
import com.IanG.BancoApp.features.transactions.domain.Transactions;

import java.util.ArrayList;

public interface BankAccountRepository {
    void createAccount(BankAccount account);
    void addTransaction(String accountNumber, Transactions transaction);
    void addProduct(String accountNumber, BankProducts product);
    double getBalance(String accountNumber);
    ArrayList<Transactions> getTransactions(String accountNumber);
    ArrayList<BankProducts> getProducts(String accountNumber);
}
