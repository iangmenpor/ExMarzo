package com.IanG.BancoApp.features.bankProducts.domain;

public class FixedTerm extends BankProducts {

    public final String monthDuration;
    public final double appliedInterest;

    public FixedTerm(String id, String name, String description, String monthDuration, double appliedInterest) {
        super(id, name, description);
        this.monthDuration = monthDuration;
        this.appliedInterest = appliedInterest;
    }

    public String getMonthDuration() {
        return monthDuration;
    }

    public double getAppliedInterest() {
        return appliedInterest;
    }

    @Override
    public String toString() {
        return "FixedTerm{" +
                "monthDuration='" + monthDuration + '\'' +
                ", appliedInterest=" + appliedInterest +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
