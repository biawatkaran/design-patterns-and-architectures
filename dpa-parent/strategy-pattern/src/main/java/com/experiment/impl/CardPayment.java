package com.experiment.impl;

/**
 * Created by Karandeep.biawat on 03/03/2015.
 */
public class CardPayment implements Payment {

    private String cardNumber;
    private String name;
    private String expiryDate;
    private String cvv;

    public CardPayment(String cardNumber, String name, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getName() {
        return name;
    }

    public String getCvv() {
        return cvv;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Amount :" + amount + " paid using card");
    }
}
