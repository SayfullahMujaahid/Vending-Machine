package com.techelevator.items;

import com.techelevator.Items;

public class Drinks extends Items {
        public Drinks(String name, String price) {
            super(name, price);
        }

        @Override
        public String getSound() {
            return "\"Glug Glug, Yum!\"";
        }

}
