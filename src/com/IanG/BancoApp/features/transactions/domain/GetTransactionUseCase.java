package com.IanG.BancoApp.features.transactions.domain;

public class GetTransactionUseCase {

    private final TransactionRepository transactionRepository;

    public GetTransactionUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Transactions execute(String id) {
        Transactions transaction = transactionRepository.getTransaction(id);
        if (transaction != null) {
            System.out.println("Transacción obtenida: " + transaction);
        } else {
            System.out.println("No se encontró la transacción con ID: " + id);
        }
        return transaction;
    }
}
