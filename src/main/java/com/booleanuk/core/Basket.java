package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagelsInStore = new ArrayList<String>();

    public Basket() {
        bagelsInStore.add("Cheese Bagel");
    }

    public boolean addBagel(String name) {
        if(name.isEmpty() || !bagelsInStore.contains(name)) {
            return false;
        }

        return true;
    }

}
