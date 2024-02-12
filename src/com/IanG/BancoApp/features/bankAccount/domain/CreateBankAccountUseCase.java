package com.IanG.BancoApp.features.bankAccount.domain;

public class CreateBankAccountUseCase {
    private final BankAccountRepository bankAccountRepository;

    public CreateBankAccountUseCase(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public void execute(BankAccount account) {
        bankAccountRepository.createAccount(account);
        System.out.println("Cuenta bancaria creada exitosamente.");
    }
}
