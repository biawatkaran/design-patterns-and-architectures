package com.vp;

import com.vp.visitable.items.Book;
import com.vp.visitable.items.CD;
import com.vp.visitable.items.Visitable;
import com.vp.visitor.ShoppingCartVisitorImpl;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Karan Biawat on 02/03/2015.
 *
 * Allow one or more operations to be applied to set of objects at runtime
 *
 * Advantages:
 *  It decouples the logic from object structure, means clean code
 *
 * Disadvantages:
 *  - you need to know the param and return type at compile time.in case visited classes always changing, new elements added
 *  - already written code, not intended in this way quite hard to refactor
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        long totalPrice = 0 ;

        Visitable[] items = new Visitable[] {new Book(new Long(1000), "Java Concurrency"), new CD("Random", new Long(20))};

        List<Visitable> visitables = Arrays.asList(items);
        totalPrice = calculatePrice(visitables);
        System.out.println("Totoal Price: " + totalPrice);
    }

    private static long calculatePrice(List<Visitable> visitables) {

        long sum = 0;
        ShoppingCartVisitorImpl visitor = new ShoppingCartVisitorImpl();

        for (Visitable visitable : visitables) {
            sum = sum + visitable.accept(visitor);
        }

        return sum;
    }
}
