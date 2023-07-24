package com.techelevator.items;

import com.techelevator.Items;

public class Chips extends Items {

    public Chips(String name, String price) {
        super(name, price);
    }

    @Override
    public String getSound() {
        return "\"Crunch Crunch, Yum!\"";
    }

}