package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagelsInStore = new ArrayList<>();
    ArrayList<String> bagelsInBasket = new ArrayList<>();
    int maxCapacity = 3;

    public Basket() {
        bagelsInStore.add("Cheese Bagel");
        bagelsInBasket.add("Pepperoni Bagel");
    }

    public boolean addBagel(String name) {
        if(name.isEmpty() || !(bagelsInStore.contains(name)) || maxCapacity == bagelsInBasket.size() ) {
            return false;
        }
        bagelsInBasket.add(name);
        System.out.println("Your: " + name + " Has been added to the basket");
        return true;
    }

    public boolean removeBagel(String name) {
        if(name.isEmpty() || !(bagelsInBasket.contains(name))) {
            System.out.println("The item you're trying to remove doesn't exist.");
            return false;
        }
        return true;
    }

}
