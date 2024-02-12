package com.IanG.BancoApp.features.transactions.domain;

import java.util.ArrayList;

public class CreateTransactionUseCase {

    private final TransactionRepository transactionRepository;

    public CreateTransactionUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void execute(Transactions transaction) {
        transactionRepository.save(transaction);
        System.out.println("Transacción creada exitosamente.");
    }
}
