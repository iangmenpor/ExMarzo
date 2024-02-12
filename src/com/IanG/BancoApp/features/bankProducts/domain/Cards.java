package com.IanG.BancoApp.features.bankProducts.domain;

public class Cards extends BankProducts {

    public final String expirationDate, CardNumber;

    public Cards(String id, String name, String description, String expirationDate, String cardNumber) {
        super(id, name, description);
        this.expirationDate = expirationDate;
        CardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "expirationDate='" + expirationDate + '\'' +
                ", CardNumber='" + CardNumber + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
