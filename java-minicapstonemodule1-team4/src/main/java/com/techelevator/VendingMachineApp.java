package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VendingMachineApp {
    public static void main(String[] args) {

        MoneyHandler moneyHandler = new MoneyHandler();
        FileReader fileReader = new FileReader();

        // Prints main menu
        String mainMenuSelection;
        String returnToMainMenu = "1";
        while (returnToMainMenu.equals("1")) {

            System.out.println("(1) Display Vending Machine Items");
            System.out.println("(2) Purchase");
            System.out.println("(3) Exit");

            Scanner mainMenu = new Scanner(System.in);
            mainMenuSelection = mainMenu.nextLine();

            // if statements directing to option user entered.

            if (mainMenuSelection.equals("1")) {
                // Display Items

                File displayItemsFile = new File("displayitems.txt");
                try (Scanner displayItemsReader = new Scanner(displayItemsFile)) {
                    while (displayItemsReader.hasNextLine()) {
                        String line = displayItemsReader.nextLine();
                        if (displayItemsReader.hasNextLine()) {
                            System.out.println(line);
                        }
                    }
                } catch (FileNotFoundException e) {

                }
                System.out.println("");
                System.out.println("(1) Return");
                System.out.println("(2) Exit");
                returnToMainMenu = mainMenu.nextLine();
                if (returnToMainMenu.equals(1)) {

                }
                if (returnToMainMenu.equals("2")) {
                    System.exit(1);
                }
            }


            if (mainMenuSelection.equals("2")) {

                System.out.println("");
                System.out.println("Current Money Provided: " + "$" + moneyHandler.balance);
                System.out.println("");
                System.out.println("(1) Feed Money");
                System.out.println("(2) Select Product");
                System.out.println("(3) Finish Transaction");

                Scanner purchaseMenu = new Scanner(System.in);
                String purchaseMenuSelection = purchaseMenu.nextLine();

                if (purchaseMenuSelection.equals("1")) {
                    System.out.println("Please insert money!");
                    String moneyAmount = purchaseMenu.nextLine();
                    Integer parsedMoneyAmount = Integer.parseInt(moneyAmount);
                    moneyHandler.addMoney(parsedMoneyAmount);
                }

                if (purchaseMenuSelection.equals("2")) {
                    System.out.println("Please enter item number: ");
                    String itemNumber = purchaseMenu.nextLine();
                    String itemSelected = fileReader.createMapOfLocationAndItems().get(itemNumber).getName();
                    String itemPrice = fileReader.createMapOfLocationAndItems().get(itemNumber).getPriceAsString();
                    Integer parsedItemPrice = Integer.parseInt(itemPrice);
                    moneyHandler.balance = moneyHandler.balance - parsedItemPrice;
                }

                if (purchaseMenuSelection.equals("3")) {

                }


            }

            if (mainMenuSelection.equals("3")) {
                System.out.println("Thank you, see you again soon!");
                System.exit(1);
            }


        }
    }
}