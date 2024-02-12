package com.IanG.BancoApp.features.customer.domain;

public class Customer {

    public final String dni, name, surname, address, city, mailing;
    public Customer(String dni, String name, String surname, String address, String city, String mailing) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.city = city;
        this.mailing = mailing;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + mailing + '\'' +
                '}';
    }
}

