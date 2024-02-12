package com.IanG.BancoApp.features.bankProducts.domain;

public class Mortgage extends BankProducts{

    public final String startDate, finalDate;
    public final double interest, amount;

    public Mortgage(String id, String name, String description, String startDate, String finalDate, double interest, double amount) {
        super(id, name, description);
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.interest = interest;
        this.amount = amount;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public double getInterest() {
        return interest;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Mortgage{" +
                "startDate='" + startDate + '\'' +
                ", finalDate='" + finalDate + '\'' +
                ", interest=" + interest +
                ", amount=" + amount +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
