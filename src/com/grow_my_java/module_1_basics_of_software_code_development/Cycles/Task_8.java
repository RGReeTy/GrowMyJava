package com.grow_my_java.module_1_basics_of_software_code_development.Cycles;

import java.util.Scanner;

public class Task_8 {
    //Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Write second number:");
        int secondNumber = sc.nextInt();
        compareDigits(firstNumber, secondNumber);
    }

    private static void compareDigits(int x, int y) {
        int tempY = y;   //  temp param to enumeration
        long uniqNums = 0;  //  new number of uniq digits
        long uniqTemp;  //  temp param to enumeration
        boolean hasUniNum = false;
        while (x != 0) {         // compare x with temp y (tempY)
            while (tempY != 0) {
                if (x % 10 == tempY % 10) {
                    uniqTemp = uniqNums;
                    while (uniqTemp != 0) { // try find only unique digits
                        if (uniqTemp % 10 == x % 10) hasUniNum = true;
                        uniqTemp /= 10;
                    }
                    if (!hasUniNum) {
                        uniqNums = uniqNums * 10 + (x % 10); // creating new unique number
                    }
                }
                tempY /= 10; // decrease Y for every X
                hasUniNum = false;
            }
            x /= 10;
            tempY = y; // return y to tempY
        }
        System.out.println("Digits included in first and second number is :" + uniqNums);
    }
}