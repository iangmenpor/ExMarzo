package com.IanG.BancoApp.features.transactions.domain;

import java.util.ArrayList;

public class Transactions {

    private final String id;
    private final String description;
    private final ArrayList<Movements> movements;

    public Transactions(String id, String description) {
        this.id = id;
        this.description = description;
        this.movements = new ArrayList<>();
    }

    public void addMovement(Movements movement) {
        this.movements.add(movement);
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Movements> getMovements() {
        return movements;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", movements=" + movements +
                '}';
    }
}