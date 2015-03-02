package com.vp.visitable.items;

import com.vp.visitor.ShoppingVisitor;

/**
 *  it has accept method that all items need to implement
 * Created by Karandeep.biawat on 02/03/2015.
 */

public interface Visitable {

    public Long accept(ShoppingVisitor v);
}
