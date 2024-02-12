package com.IanG.BancoApp.features.transactions.domain;
import java.util.*;
public interface TransactionRepository {


    //- No creo que tenga que ser considerado un uso de caso (SafeUseCase)
    void save(Transactions transaction);
    Transactions getTransaction(String id);
    ArrayList<Transactions> getTransactions();
    void removeTransaction(String id);
    void updateTransaction(Transactions transaction);
}
