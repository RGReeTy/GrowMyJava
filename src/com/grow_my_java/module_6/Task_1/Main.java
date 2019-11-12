package com.grow_my_java.module_6.Task_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            while (true) {
                System.out.println("Please, choose an option:");
                System.out.println("1 - I have an account");
                System.out.println("2 - I want to create an account");
                System.out.println("0 - Exit.");

                int i = checkValue();
                int i = checkValue();
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

        try (FileWriter writer = new FileWriter("notes987987.txt", false)) {
            // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}