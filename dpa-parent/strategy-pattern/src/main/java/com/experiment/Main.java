package com.experiment;

import com.experiment.app.ShoppingCart;
import com.experiment.impl.CardPayment;
import com.experiment.impl.PaypalPayment;
import com.experiment.model.Item;

/**
 * When we have different mode of al
 * Created by Karandeep.biawat on 03/03/2015.
 */
public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1= new Item("item1", 10);
        Item item2= new Item("item2", 20);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new CardPayment("123", "Karan", "cvv", "expiryDate"));

        cart.pay(new PaypalPayment("email", "password"));
    }
}
