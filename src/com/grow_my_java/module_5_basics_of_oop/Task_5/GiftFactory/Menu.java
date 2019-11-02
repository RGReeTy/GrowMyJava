package com.grow_my_java.module_5_basics_of_oop.Task_5.GiftFactory;

import com.grow_my_java.module_5_basics_of_oop.Task_5.Source.PackageOfSweets.Sweet.SweetGift;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    private static int checkValue() {

        int value;
        while (true) {
            value = getValue();
            if (value > 0) {
                break;
            } else {
                System.out.println("Wrong value! Enter again: ");
            }
        }
        return value;
    }

    public void run() {

        try {
            System.out.println("Please, enter the name sweets (candy, chocolate, cookies:");
            String name = getName();


            SweetGift gift = new SweetGift();


        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static int getValue() {
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter again:");
        }
        return scanner.nextInt();
    }

    private String getName() {
        Pattern pattern = Pattern.compile("[\\w ]{4,}");
        scanner.useDelimiter("[\r\n]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("The name must contains more than 10 letters! Enter again:");
        }
        return scanner.nextLine();
    }
}