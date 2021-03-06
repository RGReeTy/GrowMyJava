package com.grow_my_java.module_2_algorithmization.Decomposition;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_11 {
    //11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number A..");
        Integer A = Integer.valueOf(read.readLine());
        System.out.println("Enter a number B..");
        Integer B = Integer.valueOf(read.readLine());
        if (A <= 0 || B <= 0) {
            System.out.println("Input a positive numbers > 0!!");
        } else {
            int counterA = getNumberOfDigits(A);
            int counterB = getNumberOfDigits(B);
            //System.out.println(A + " " + B);
            //System.out.println(counterA + " " + counterB);
            if (counterA == counterB) {
                System.out.println("The numbers has identical count of digits - " + counterA);
            } else if (counterA > counterB) {
                System.out.println("More digits at number A - " + counterA + ". The other number has " + counterB + " digits.");
            } else {
                System.out.println("More digits at number B - " + counterB + ". The other number has " + counterA + " digits.");
            }
        }
    }

    private static int getNumberOfDigits(int number) {
        int counter = 0;
        while (number > 0) {
            number = number / 10;
            counter++;
        }
        return counter;
    }
}