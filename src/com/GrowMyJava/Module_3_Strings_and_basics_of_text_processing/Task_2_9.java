package com.GrowMyJava.Module_3_Strings_and_basics_of_text_processing;

import java.util.Scanner;

public class Task_2_9 {
    //9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
    //буквы.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the string: ");
        String text = scanner.nextLine();
        if (text.length() == 0) {
            System.out.println("The given string is empty!");
        } else {
            numberOfUppercaseLowercaseLetters(text);
        }
    }

    private static void numberOfUppercaseLowercaseLetters(String text) {
        int uppercaseCounter = 0;
        int lowercaseCounter = 0;
        char current;
        for (int i = 0; i < text.length(); i++) {
            current = text.charAt(i);
            if ((current >= 'A' && current <= 'Z') && Character.isUpperCase(current)) uppercaseCounter++;
            if ((current >= 'a' && current <= 'z') && Character.isLowerCase(current)) lowercaseCounter++;
        }
        System.out.println("The test string has " + uppercaseCounter + " characters in uppercase and "
                + lowercaseCounter + " characters in lowercase.");
    }
}