package com.IanG.BancoApp.features.transactions.data;
import com.IanG.BancoApp.features.bankProducts.data.BankProductsDataRepository;
import com.IanG.BancoApp.features.customer.domain.Customer;
import com.IanG.BancoApp.features.transactions.domain.TransactionRepository;
import com.IanG.BancoApp.features.transactions.domain.Transactions;

import java.util.ArrayList;
import java.util.List;

public class TransactionDataRepository implements TransactionRepository {
    private static TransactionDataRepository instance;
    private final List<Transactions> transactions;

    private TransactionDataRepository() {
        this.transactions = new ArrayList<>();
    }

    public static TransactionDataRepository newInstance() {
        if (instance == null) {
            instance = new TransactionDataRepository();
        }
        return instance;
    }

    @Override
    public void save(Transactions transaction) {
        transactions.add(transaction);
    }

    @Override
    public Transactions getTransaction(String id) {
        for (Transactions transaction : transactions) {
            if (transaction.getId().equals(id)) {
                return transaction;
            }
        }
        return null;
    }
    @Override
    public ArrayList<Transactions> getTransactions() {
        ArrayList<Transactions> transactions1 = new ArrayList<>();
        for (Transactions transacciones: transactions){
            System.out.println("->Transacción: "+ transacciones.toString());
            transactions1.add(transacciones);
        }
        return transactions1;
    }

    @Override
    public void removeTransaction(String id) {
        transactions.removeIf(transaction -> transaction.getId().equals(id));
    }

    @Override
    public void updateTransaction(Transactions updatedTransaction) {
        for (int i = 0; i < transactions.size(); i++) {
            Transactions transaction = transactions.get(i);
            if (transaction.getId().equals(updatedTransaction.getId())) {
                transactions.set(i, updatedTransaction);
                return;
            }
        }
    }
}
