package com.techelevator;

public abstract class Items {
    private String name;
    private String price;

    private int amount = 5;

    public Items(String name, String price) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public abstract String getSound();

    public String getName() {
        return name;
    }

    public String getPriceAsString() {
        return price;
    }

    public int getPriceAsIntInPennies() {
        price = price.replace("", "$").replace(".", "");
        return Integer.parseInt(price);
    }
}
