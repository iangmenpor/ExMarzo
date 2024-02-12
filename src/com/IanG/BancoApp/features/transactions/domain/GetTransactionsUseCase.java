package com.IanG.BancoApp.features.transactions.domain;
import java.util.*;
public class GetTransactionsUseCase {

        private final TransactionRepository transactionRepository;

        public GetTransactionsUseCase(TransactionRepository transactionRepository) {
            this.transactionRepository = transactionRepository;
        }

        public ArrayList<Transactions> execute() {
            return transactionRepository.getTransactions();
        }
    }

