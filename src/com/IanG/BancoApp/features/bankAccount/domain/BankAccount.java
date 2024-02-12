package com.IanG.BancoApp.features.bankAccount.domain;

import com.IanG.BancoApp.features.bankProducts.domain.BankProducts;
import com.IanG.BancoApp.features.customer.domain.Customer;
import com.IanG.BancoApp.features.transactions.domain.Movements;
import com.IanG.BancoApp.features.transactions.domain.Transactions;

import java.util.ArrayList;

public class BankAccount {

    public final String accountNumber;
    public final Customer accountHolder;
    public final ArrayList<Transactions> transactions;
    public final ArrayList<BankProducts> products;
    public double balance;

    public BankAccount(String accountNumber, Customer accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.transactions = new ArrayList<>();
        this.products = new ArrayList<>();
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }

    public ArrayList<Transactions> getTransactions() {
        return transactions;
    }

    public ArrayList<BankProducts> getProducts() {
        return products;
    }

    public double getBalance() {
        return balance;
    }

    //-Metodos necesarios
    public void addTransaction(Transactions transaction) {
        transactions.add(transaction);
        if (transaction.getMovements() != null) {
            for (Movements movement : transaction.getMovements()) {
                balance += movement.getAmount();
            }
        }
    }

    public void addProduct(BankProducts product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder=" + accountHolder +
                ", transactions=" + transactions +
                ", products=" + products +
                ", balance=" + balance +
                '}';
    }
}
