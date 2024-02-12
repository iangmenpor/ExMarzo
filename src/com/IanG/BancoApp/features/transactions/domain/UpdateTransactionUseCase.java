package com.IanG.BancoApp.features.transactions.domain;

public class UpdateTransactionUseCase {
    private final TransactionRepository transactionRepository;

    public UpdateTransactionUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void execute(Transactions transaction) {
        transactionRepository.updateTransaction(transaction);
        System.out.println("Transacción actualizada: " + transaction);
    }
}
