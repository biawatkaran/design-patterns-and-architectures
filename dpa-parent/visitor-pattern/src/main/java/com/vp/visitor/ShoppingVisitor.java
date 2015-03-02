package com.vp.visitor;

import com.vp.visitable.items.Book;
import com.vp.visitable.items.CD;

/**
 * visitor - It has visit method that is used for concrete implementation of logic
 *
 * Created by Karandeep.biawat on 02/03/2015.
 *
 */
public interface ShoppingVisitor {

   public Long visit(Book b);
   public Long visit(CD cd);
}
