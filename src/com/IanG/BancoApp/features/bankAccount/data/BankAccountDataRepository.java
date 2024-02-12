package com.IanG.BancoApp.features.bankAccount.data;

import com.IanG.BancoApp.features.bankAccount.domain.BankAccount;
import com.IanG.BancoApp.features.bankAccount.domain.BankAccountRepository;
import com.IanG.BancoApp.features.bankProducts.domain.BankProducts;
import com.IanG.BancoApp.features.customer.data.CustomerDataRepository;
import com.IanG.BancoApp.features.transactions.domain.Transactions;

import java.util.ArrayList;

public class BankAccountDataRepository implements BankAccountRepository {


    /*SINGLETON*/
    private static BankAccountDataRepository instance;
    public static BankAccountDataRepository newInstance(){
        if (instance == null ){
            instance = new BankAccountDataRepository();
        }
        return instance;
    }

    public final ArrayList<BankAccount> accounts = new ArrayList<>();

}
