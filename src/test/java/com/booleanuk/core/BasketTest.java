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
    }

}
