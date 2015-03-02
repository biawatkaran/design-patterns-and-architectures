package com.vp.visitable.items;

import com.vp.visitor.ShoppingVisitor;

/**
 *
 * Created by Karandeep.biawat on 02/03/2015.
 */

public class Book implements Visitable{

    private String name;
    private Long price;

    public Book(Long price, String name) {
        this.price = price;
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public Long accept(ShoppingVisitor v) {
        return v.visit(this);
    }
}