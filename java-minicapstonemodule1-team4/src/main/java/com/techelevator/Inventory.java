package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

import java.util.Scanner;
import java.util.TreeMap;

public class Inventory {
    FileReader fileReader = new FileReader();
    TreeMap<String, Items> map;

    public Inventory() {
        map = fileReader.createMapOfLocationAndItems();
    }


}

