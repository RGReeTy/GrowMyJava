package com.grow_my_java.module_5_basics_of_oop.Task_4.Source;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private CaveOfTreasures caveOfTreasures = new CaveOfTreasures("Horrible Dragon Cave");
    private OperationsUnderTheTreasures logic = new OperationsUnderTheTreasures(caveOfTreasures);

    private static int getValue() {

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter again:");
        }
        return scanner.nextInt();
    }

    private static int checkValue() {
        int value;
        while (true) {
            value = getValue();
            if (value >= 0 && value <= 4) {
                break;
            } else {
                System.out.println("Wrong value! Enter again: ");
            }
        }
        return value;
    }

    public void run() {

        try {
            while (true) {
                System.out.println("Please, choose an option:");
                System.out.println("0 - Create a cave with 100 treasures.");
                System.out.println("1 - Print all treasures in the cave.");
                System.out.println("2 - Find the most expensive treasure.");
                System.out.println("3 - Print treasures for a given sum.");
                System.out.println("4 - Exit.");

                int i = checkValue();

                if (i == 0) {
                    logic.fillArrayListOfTreasures();

                } else if (i == 1) {
                    System.out.println("The treasures in the cave:");
                    logic.printInfo();

                } else if (i == 2) {
                    logic.whereIsMostExpensiveTreasure();

                } else if (i == 3) {

                    logic.selectTreasuresAtDefinitelyCount(175.5, 100.0);

                } else if (i == 4) {
                    break;
                }
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}