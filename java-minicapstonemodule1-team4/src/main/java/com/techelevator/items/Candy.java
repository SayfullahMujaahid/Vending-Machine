package com.techelevator.items;

import com.techelevator.Items;

public class Candy extends Items {

    public Candy(String name, String price) {
        super(name, price);
    }

    @Override
    public String getSound() {
        return "\"Munch Munch, Yum!\"";
    }

}
