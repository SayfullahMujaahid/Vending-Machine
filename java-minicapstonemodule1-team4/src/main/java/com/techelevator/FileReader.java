package com.techelevator;

import com.techelevator.items.Candy;
import com.techelevator.items.Chips;
import com.techelevator.items.Drinks;
import com.techelevator.items.Gum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReader {


    private String fileName = "vendingmachine.csv";
    private File inventoryFile = new File(fileName);

    private List<String> getListOfAllLines() {
        List<String> listOfInputFileLines = new ArrayList<String>();
        try (Scanner fileScanner = new Scanner(inventoryFile)) {
            while (fileScanner.hasNextLine()) {
                listOfInputFileLines.add(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
        }
        return listOfInputFileLines;

    }

    public List<String[]> inventoryAsArrayList() {

        List<String[]> inventoryArray = new ArrayList<String[]>();

        for (String currentString : getListOfAllLines()) {
            inventoryArray.add(currentString.split("\\|"));
        }
        return inventoryArray;

    }

    public TreeMap<String, Items> createMapOfLocationAndItems() {
        TreeMap<String, Items> inventoryMap = new TreeMap<String, Items>();

        for (String currentString : getListOfAllLines()) {
            String[] tempSplitString = currentString.split("\\|");


            if (tempSplitString[3].equals("Candy")) {
                Candy candy = new Candy(tempSplitString[1], tempSplitString[2]);
                inventoryMap.put(tempSplitString[0], candy);


            } else if (tempSplitString[3].equals("Chip")) {
                Chips chip = new Chips(tempSplitString[1], tempSplitString[2]);
                inventoryMap.put(tempSplitString[0], chip);


            } else if (tempSplitString[3].equals("Drink")) {
                Drinks drink = new Drinks(tempSplitString[1], tempSplitString[2]);
                inventoryMap.put(tempSplitString[0], drink);


            } else if (tempSplitString[3].equals("Gum")) {
                Gum gum = new Gum(tempSplitString[1], tempSplitString[2]);
                inventoryMap.put(tempSplitString[0], gum);
            }
        }
        return inventoryMap;

    }



}

