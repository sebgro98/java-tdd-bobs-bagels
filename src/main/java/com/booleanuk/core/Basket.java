package com.booleanuk.core;

public class Basket {

    public boolean addBagel(String name) {
        if(name.isEmpty()) {
            return false;
        }
        return true;
    }

}
