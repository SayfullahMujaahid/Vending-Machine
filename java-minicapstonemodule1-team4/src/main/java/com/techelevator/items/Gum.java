package com.techelevator.items;

import com.techelevator.Items;

public  class Gum extends Items {

    public Gum(String name, String price) {
        super(name, price);
    }

    @Override
    public String getSound() {
        return "\"Chew Chew, Yum!\"";
    }
}