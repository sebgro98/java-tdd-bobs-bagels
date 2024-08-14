package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagelsInStore = new ArrayList<>();
    ArrayList<String> bagelsInBasket = new ArrayList<>();

    public Basket() {
        bagelsInStore.add("Cheese Bagel");
    }

    public boolean addBagel(String name) {
        if(name.isEmpty() || !(bagelsInStore.contains(name))) {
            return false;
        }
        bagelsInBasket.add(name);
        System.out.println("Your: " + name + " Has been added to the basket");
        return true;
    }

    public boolean removeBagel(String name) {
        if(name.isEmpty() || !(bagelsInBasket.contains(name))) {
            return false;
        }
        return true;
    }

}
