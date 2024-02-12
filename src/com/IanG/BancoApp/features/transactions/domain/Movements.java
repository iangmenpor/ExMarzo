package com.IanG.BancoApp.features.transactions.domain;

public class Movements {
    public final String id, description;
    public final double amount;

    public Movements(String id, String description, double amount ) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    //-Método para ingreso (true) y pago (false)
    public boolean esIngreso(){
        return (amount>0);
    }
    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}
