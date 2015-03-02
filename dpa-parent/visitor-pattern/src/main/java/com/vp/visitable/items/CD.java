package com.vp.visitable.items;

import com.vp.visitor.ShoppingVisitor;

/**
 *
 * Created by Karandeep.biawat on 02/03/2015.
 */
public class CD implements Visitable {

    private String name;
    private Long price;

    public CD(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Long getPrice() {
        return price;
    }

    @Override
    public Long accept(ShoppingVisitor v) {
        return v.visit(this);
    }
}
