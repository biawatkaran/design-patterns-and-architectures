package com.vp.visitor;

import com.vp.visitable.items.Book;
import com.vp.visitable.items.CD;

/**
 *
 * Created by Karandeep.biawat on 02/03/2015.
 */
public class ShoppingCartVisitorImpl implements ShoppingVisitor {

    @Override
    public Long visit(Book b) {

        return b.getPrice() > 50 ? b.getPrice() - 50 : b.getPrice();
    }

    @Override
    public Long visit(CD cd) {

        return cd.getPrice();
    }
}
