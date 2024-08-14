package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
Basket basket;

    BasketTest(){
        basket = new Basket();
    }

    @Test
    public void testAddBagelExists() {
        Assertions.assertFalse(basket.addBagel(""));

    }

    @Test
    public void testAddBagel() {
        Assertions.assertTrue(basket.addBagel("Cheese Bagel"));
        Assertions.assertFalse(basket.addBagel("Ham Bagel"));


    }
    @Test
    public void testRemoveBagel() {
        Assertions.assertFalse(basket.addBagel(""));
        Assertions.assertFalse(basket.removeBagel("Double Cheese Bagel"));
        Assertions.assertTrue(basket.removeBagel("Pepperoni Bagel"));
    }

    @Test
    public void testBucketIsNotFull() {
        Assertions.assertTrue(basket.addBagel("Cheese Bagel"));
    }

    @Test
    public void testIncrementBucketCapacity() {
        Assertions.assertFalse(basket.incrementCapacity(2, "Dave"));
        Assertions.assertTrue(basket.incrementCapacity(2, "bob"));
    }

}
