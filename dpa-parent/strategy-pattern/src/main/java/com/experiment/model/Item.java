package com.experiment.model;

/**
 * Created by Karandeep.biawat on 03/03/2015.
 */
public class Item {

    private String barCode;
    private int price;

    public Item(String barCode, int price) {
        this.barCode = barCode;
        this.price = price;
    }

    public String getBarCode() {
        return barCode;
    }

    public int getPrice() {
        return price;
    }
}

