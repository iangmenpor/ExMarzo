package com.IanG.BancoApp.features.transactions.domain;

public class RemoveTransactionUseCase {
    private final TransactionRepository transactionRepository;

    public RemoveTransactionUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void execute(String id) {
        transactionRepository.removeTransaction(id);
        System.out.println("Transacción eliminada con ID: " + id);
    }
}
