package com.IanG.BancoApp.features.bankProducts.data;

import com.IanG.BancoApp.features.bankProducts.domain.BankProducts;
import com.IanG.BancoApp.features.bankProducts.domain.BankProductsRepository;
import com.IanG.BancoApp.features.customer.data.CustomerDataRepository;
import com.IanG.BancoApp.features.customer.domain.Customer;

import java.util.ArrayList;

public class BankProductsDataRepository implements BankProductsRepository{

    /*SINGLETON*/
    private static BankProductsDataRepository instance;
    public static BankProductsDataRepository newInstance(){
        if (instance == null ){
            instance = new BankProductsDataRepository();
        }
        return instance;
    }

        private ArrayList<BankProducts> bankProducts = new ArrayList<>();
    @Override
    public void createProduct(BankProducts bankProduct) {
        this.bankProducts.add(bankProduct);
        System.out.println("-> Producto contratado exitosamente");
    }

    @Override
    public ArrayList<BankProducts> getProducts() {
        for (BankProducts bankProduct : bankProducts) {
            System.out.println("-> Producto: " + bankProduct.toString());
        }
        return new ArrayList<>(bankProducts); // Devuelve una copia de la lista
    }

    @Override
    public BankProducts getProduct(String id) {
        for (BankProducts bankProduct : bankProducts) {
            if (bankProduct.id.equals(id)) {
                System.out.println("-> Producto: " + bankProduct.toString());
                return bankProduct;
            }
        }
        System.err.println("-> Error: Producto no encontrado");
        return null;
    }

    @Override
    public void removeProduct(String id) {
        for (int i = 0; i < bankProducts.size(); i++) {
            if (bankProducts.get(i).id.equals(id)) {
                bankProducts.remove(i);
                System.out.println("-> Producto eliminado exitosamente");
                return;
            }
        }
        System.err.println("-> Error: Producto no encontrado");
    }

    @Override
    public void updateProduct(BankProducts bankProduct) {
        for (int i = 0; i < bankProducts.size(); i++) {
            if (bankProducts.get(i).id.equals(bankProduct.id)) {
                bankProducts.set(i, bankProduct);
                System.out.println("-> Producto actualizado exitosamente");
                return;
            }
        }
        System.err.println("-> Error: Producto no encontrado");
    }
}


