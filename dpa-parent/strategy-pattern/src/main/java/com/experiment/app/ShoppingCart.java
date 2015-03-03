package com.experiment.app;

import com.experiment.impl.Payment;
import com.experiment.model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karandeep.biawat on 03/03/2015.
 */
public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public int calculatePrice(){

        int sum= 0;

        for (Item item : items) {
            sum += item.getPrice();
        }

        return sum;
    }

    public void pay(Payment paymentMethod){
        int totalAmount = calculatePrice();
        paymentMethod.pay(totalAmount);
    }
}
