package com.experiment.impl;

/**
 * Created by Karandeep.biawat on 03/03/2015.
 */
public class PaypalPayment implements Payment {

    private String email;
    private String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Amount " + amount + " paid using paypal account");
    }
}
